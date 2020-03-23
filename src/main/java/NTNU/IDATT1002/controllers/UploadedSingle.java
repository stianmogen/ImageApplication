package NTNU.IDATT1002.controllers;

import NTNU.IDATT1002.App;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controls the buttons and changeable elements on upload_single.fxml,
 * a page where you add descriptions to your selected image
 * @version 1.0 22.03.2020
 */
public class UploadedSingle implements Initializable {


    public ImageView tbar_logo;
    public TextField tbar_search;
    public Button tbar_searchBtn;
    public Button tbar_explore;
    public Button tbar_map;
    public Button tbar_upload;

    public TextField photo_title;
    public TextField photo_tag;
    public TextArea photo_desc;
    public ImageView photo_image;

    public Button acceptBtn;
    public Button tbar_albums;


    /**
     * Method that runs when the controller is loaded
     * Sets the image url on the page to be the uploaded images url
     * @param location
     * @param resources
     */
    public void initialize(URL location, ResourceBundle resources) {
        photo_image.setImage(new Image(App.ex.getUploadedFiles().get(0).toURI().toString()));
    }

    /**
     * Method that changes scene to Main page
     * @param mouseEvent
     * @throws IOException
     */
    public void switchToMain(MouseEvent mouseEvent) throws IOException {
        App.setRoot("main");
    }

    /**
     * Method that changes scene to Search page. It reads the value of the search
     * field and if not empty it is passed to dataexchange
     * @param actionEvent
     * @throws IOException
     */
    public void switchToSearch(ActionEvent actionEvent) throws IOException {
        if (!tbar_search.getText().isEmpty()){
            App.ex.setSearchField(tbar_search.getText());
        }
        App.setRoot("search");
    }

    /**
     * Method that changes scene to Explore page
     * @param actionEvent
     * @throws IOException
     */
    public void switchToExplore(ActionEvent actionEvent) throws IOException {
        App.setRoot("explore");
    }

    /**
     * Method that changes scene to Albums page
     * @param actionEvent
     * @throws IOException
     */
    public void switchToAlbums(ActionEvent actionEvent) throws IOException {
        App.setRoot("explore_albums");
    }

    /**
     * Method that changes scene to Map page
     * @param actionEvent
     * @throws IOException
     */
    public void switchToMap(ActionEvent actionEvent) throws IOException {
        App.setRoot("map");
    }

    /**
     * Method that changes scene to Upload page
     * @param actionEvent
     * @throws IOException
     */
    public void switchToUpload(ActionEvent actionEvent) throws IOException {
        App.setRoot("upload");
    }

    /**
     * Method for uploading image to database with title, tags and description
     * Image itself is not stored but URL is
     * @param actionEvent
     * @throws IOException
     */
    public void uploadSingle(ActionEvent actionEvent) throws IOException {
        //TODO: write method to accept and upload the photo with chosen settings, titles...
        App.setRoot("main");
    }
}