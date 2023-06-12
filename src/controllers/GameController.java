/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GameController implements Initializable {

    @FXML
    private Pane pane;
    @FXML
    private Button cover;
    @FXML
    private Button hintBtn;
    @FXML
    private Button settingBtn;
    @FXML
    private Label lvlLabel;
    @FXML
    private Button qletter;
    @FXML
    private Button aletter;
    @FXML
    private Button zletter;
    @FXML
    private Button wletter;
    @FXML
    private Button sletter;
    @FXML
    private Button xletter;
    @FXML
    private Button eletter;
    @FXML
    private Button dletter;
    @FXML
    private Button cletter;
    @FXML
    private Button rletter;
    @FXML
    private Button fletter;
    @FXML
    private Button vletter;
    @FXML
    private Button tletter;
    @FXML
    private Button gletter;
    @FXML
    private Button bletter;
    @FXML
    private Button yletter;
    @FXML
    private Button hletter;
    @FXML
    private Button nletter;
    @FXML
    private Button uletter;
    @FXML
    private Button jletter;
    @FXML
    private Button mletter;
    @FXML
    private Button iletter;
    @FXML
    private Button kletter;
    @FXML
    private Button oletter;
    @FXML
    private Button lletter;
    @FXML
    private Button pletter;
    @FXML
    private Label QLabel;
    @FXML
    private Label lvlNum;
    @FXML
    private Button btn;
    @FXML
    private Button btntest;
    @FXML
    private Button nq;
    @FXML
    private Button back;
    @FXML
    private TextArea ansarea;
    @FXML
    private Button wrong;
    private int L = 0;
    private int lvl = 0;
    private Label lbl = new Label("lvl.");
    @FXML
    private ImageView m1;
    @FXML
    private ImageView m2;
    @FXML
    private ImageView m3;
    @FXML
    private ImageView m4;
    @FXML
    private ImageView m5;
    @FXML
    private ImageView m6;
    @FXML
    private ImageView m7;
    @FXML
    private ImageView m8;

    //hints
    @FXML
    private ImageView image;
    @FXML
    private Button coverBtn;
    File file1 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\zoo.jpg");
    Image Image1 = new Image(file1.toURI().toString());
    File file2 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\bank.png");
    Image Image2 = new Image(file2.toURI().toString());
    File file3 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\cinema.jpg");
    Image Image3 = new Image(file3.toURI().toString());
    File file4 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\hospital.png");
    Image Image4 = new Image(file4.toURI().toString());
    File file5 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\sandwich.png");
    Image Image5 = new Image(file5.toURI().toString());
    File file6 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\juise.png");
    Image Image6 = new Image(file6.toURI().toString());
    File file7 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\milk.png");
    Image Image7 = new Image(file7.toURI().toString());
    File file8 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\rice.png");
    Image Image8 = new Image(file8.toURI().toString());
    File file9 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\cat.png");
    Image Image9 = new Image(file9.toURI().toString());
    File file10 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\chicken.png");
    Image Image10 = new Image(file10.toURI().toString());

    File file11 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\cow.png");
    Image Image11 = new Image(file11.toURI().toString());
    File file12 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\duck.png");
    Image Image12 = new Image(file12.toURI().toString());
    File file13 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\arm.png");
    Image Image13 = new Image(file13.toURI().toString());
    File file14 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\body.png");
    Image Image14 = new Image(file14.toURI().toString());
    File file15 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\ear.png");
    Image Image15 = new Image(file15.toURI().toString());
    File file16 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\eye.png");
    Image Image16 = new Image(file16.toURI().toString());
    File file17 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\nurse.png");
    Image Image17 = new Image(file17.toURI().toString());
    File file18 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\cough.png");
    Image Image18 = new Image(file18.toURI().toString());
    File file19 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\earache.png");
    Image Image19 = new Image(file19.toURI().toString());
    File file20 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\headache.png");
    Image Image20 = new Image(file20.toURI().toString());

    File file21 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\computer.png");
    Image Image21 = new Image(file21.toURI().toString());
    File file22 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\exam.png");
    Image Image22 = new Image(file22.toURI().toString());
    File file23 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\desk.png");
    Image Image23 = new Image(file23.toURI().toString());
    File file24 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\homework.png");
    Image Image24 = new Image(file24.toURI().toString());
    File file25 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\jeans.png");
    Image Image25 = new Image(file25.toURI().toString());
    File file26 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\sweater.png");
    Image Image26 = new Image(file26.toURI().toString());
    File file27 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\belt.png");
    Image Image27 = new Image(file27.toURI().toString());
    File file28 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\shorts.png");
    Image Image28 = new Image(file28.toURI().toString());
    File file29 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\garden.png");
    Image Image29 = new Image(file29.toURI().toString());
    File file30 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\basement.png");
    Image Image30 = new Image(file30.toURI().toString());

    File file31 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\stairs.png");
    Image Image31 = new Image(file31.toURI().toString());
    File file32 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\key.png");
    Image Image32 = new Image(file32.toURI().toString());
    File file33 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\football.png");
    Image Image33 = new Image(file33.toURI().toString());
    File file34 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\basketball.png");
    Image Image34 = new Image(file34.toURI().toString());
    File file35 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\baseball.png");
    Image Image35 = new Image(file35.toURI().toString());
    File file36 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\volleyball.png");
    Image Image36 = new Image(file36.toURI().toString());
    File file37 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\silver.png");
    Image Image37 = new Image(file37.toURI().toString());
    File file38 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\wood.png");
    Image Image38 = new Image(file38.toURI().toString());
    File file39 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\brick.png");
    Image Image39 = new Image(file39.toURI().toString());
    File file40 = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\image\\glass.png");
    Image Image40 = new Image(file40.toURI().toString());

    public TranslateTransition translate = new TranslateTransition();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void transf1() {

        translate.setNode(m1);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transt1() {

        translate.setNode(m2);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transf2() {

        translate.setNode(m3);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transt2() {

        translate.setNode(m4);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transf3() {

        translate.setNode(m5);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transt3() {

        translate.setNode(m6);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transf4() {

        translate.setNode(m7);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    private void transt4() {

        translate.setNode(m8);
        translate.setDuration(Duration.millis(2200));
        translate.setByY(1000);
        translate.play();
    }

    @FXML
    private void btnclicked(ActionEvent event) {
        if (CatogeryController.placesCheck) {
                QLabel.setText("A PLACE WHERE LIVING ANIMALS\nESPECIALLY WILD ONES\nARE KEPT FOR PEOPLE TO LOOK AT");
            btntest.setVisible(false);
        } else if (CatogeryController.foodCheck) {
            QLabel.setText("SLICES OF BREAD OTHER FOOD\nBETWEEN THEM SUCH AS MEAT, CHEESE");
            btntest.setVisible(false);
        } else if (CatogeryController.animalCheck) {
            QLabel.setText("A SMALL ANIMAL RELATED TO LIONS");
            btntest.setVisible(false);
        } else if (CatogeryController.bodyCheck) {
            QLabel.setText("THE PART OF THE HUMAN BODY BETWEEN\nTHE SHOULDER AND THE WRIST");
            btntest.setVisible(false);
        } else if (CatogeryController.healthCheck) {
            QLabel.setText("A PERSON WHO IS TRAINED TO CARE\nFOR SICK AND INJURED PEOPLE");
            btntest.setVisible(false);
        } else if (CatogeryController.schoolCheck) {
            QLabel.setText("AN ELECTRONIC DEVICE THAT IS USED\nTO STORE AND SORT INFORMATION\nAND WORK WITH DATA AT A HIGH SPEED . ");
            btntest.setVisible(false);
        } else if (CatogeryController.clothesheck) {
            QLabel.setText("TROUSERS MADE OF DENIM ");
            btntest.setVisible(false);
        } else if (CatogeryController.homeCheck) {
            QLabel.setText("AN AREA AROUND ONE'S\n HOME PLANTED WITH GRASS\nFLOWERS, OR OTHER PLANTS ");
            btntest.setVisible(false);
        } else if (CatogeryController.sportCheck) {
            QLabel.setText("A GAME PLAYED BETWEEN\nTWO TEAMS OF ELEVEN PEOPLE\nWHERE EACH TEAM TRIES TO WIN BY KICKING\nA BALL INTO THE OTHER TEAM'S GOAL");
            btntest.setVisible(false);
        } else if (CatogeryController.materialsCheck) {
            QLabel.setText("A SOFT WHITE METALLIC CHEMICAL ELEMENT\nTHAT CAN BE POLISHED AND\nIS USED FOR MONEY\nJEWELRY AND ORNAMENTS");
            btntest.setVisible(false);
        }
    }

    @FXML
    private void check(ActionEvent event) {

        if (CatogeryController.placesCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"ZOO".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");

                        }
                        break;

                    case 1:
                        if (!"BANK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();
                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"CINEMA".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"HOSPITAL".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();
                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:

                        break;
                }
            }
        } else if (CatogeryController.foodCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"SANDWICH".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");

                        }
                        break;

                    case 1:
                        if (!"JUISE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();
                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"MILK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"RISE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();
                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.animalCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"CAT".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"CH".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"COW".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"DUCK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.bodyCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"ARM".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"BODY".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"EAR".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"EYE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.healthCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"NURSE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"COUGH".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"EARACHE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"HEADACHE".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.schoolCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"COMPUTER".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"EXAM".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"DESK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"HOMEWORK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.clothesheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"JEANS".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"SWEATER".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"BELT".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"SHORTS".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.homeCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"GARDEN".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"BASEMENT".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"STAIRS".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"KEY".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.sportCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"FOOTBALL".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"BASKETBALL".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"BASEBALL".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"VOLLEYBALL".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        } else if (CatogeryController.materialsCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        if (!"SILVER".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf1();

                        } else {
                            transt1();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 1:
                        if (!"WOOD".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf2();

                        } else {
                            transt2();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 2:
                        if (!"BRICK".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf3();

                        } else {
                            transt3();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    case 3:
                        if (!"GLASS".equals(ansarea.getText())) {
                            ansarea.setText("");
                            transf4();

                        } else {
                            transt4();
                            L++;
                            String s = String.valueOf(L);
                            lvlLabel.setText(lbl.getText().concat(s));
                            ansarea.setText("");
                        }
                        break;

                    default:
                        break;
                }
            }
        }
    }

    @FXML
    private void NEXT(ActionEvent event) {

        for (int i = 0; i < 4; i++) {
            if (CatogeryController.placesCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PLACE WHERE YOU GO\nTO TAKE OUT MONEY");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PLACE WHERE YOU GO\nTO WATCH A MOVIE");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PLACE WHERE SICK OR HURT\nPEOPLE GO TO FIND CARE OR HELP");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.foodCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE LIQUID FROM FRUITS\nIS USED FOR DRINKING.");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("THIS LIQUID PRODUCED BY COWS OR FEMALE\nGOATS AND COLLECTED FOR PEOPLE TO DRINK");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE SEED OF THIS GRASS,\nWHICH IS A VERY IMPORTANT FOOD");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.animalCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("KEPT FOR IT'S EGGS AND MEAT");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("KEPT ON FARMS TO PRODUCE MILK OR BEEF");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A BIRD THAT LIVES IN OR NEAR WATER AND\nHAS WEBBED FEET FOR SWIMMING AND\nA LARGE FLAT BILL");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.bodyCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE MAIN PART OF A PERSON OR ANIMAL\nNOT INCLUDING THE HEAD\nARMS, AND LEGS");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE ORGAN OF HEARING IN\nPEOPLE AND SOME OTHER ANIMALS");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE ORGAN OF THE BODY\nTHAT GIVES ANIMALS SIGHT\nAND THE AREA CLOSE AROUND IT.");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.healthCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("TO RELEASE AIR NOISILY FROM THE LUNGS .");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PAIN INSIDE THE EAR");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PAIN IN THE HEAD");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.schoolCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("A FORMAL TEST TO DETERMINE HOW MUCH A PERSON KNOWS . ");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText(" A PIECE OF FURNITURE WITH DRAWERS\nAND A FLAT SURFACE USED\nFOR READING AND WRITING ");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("SCHOOL WORK THAT\nIS TO BE DONE AT HOME\nRATHER THAN AT SCHOOL");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.clothesheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PIECE OF CLOTHING FOR\nTHE UPPER PART OF THE BODY\n,MADE OF WOOL OR COTTON , WITH LONG SLEEVES ");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("A LONG NARROW PIECE OF LEATHER,CLOTH, ETC.\nTHAT YOU WEAR AROUND THE MIDDLE OF YOUR BODY ");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("SHORT TROUSERS THAT END\nABOVE OR AT THE KNEE");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.homeCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("THE SPACE IN A BUILDING\nTHAT IS UNDERGROUND\n OR PARTLY UNDERGROUND ");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("A SET OF STEPS THAT LEAD\nFROM ONE LEVEL OF A BUILDING TO ANOTHER");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A PIECE OF METAL THAT HAS BEEN\nCUT INTO A SPECIAL SHAPE \nAND IS USED FOR OPENING OR CLOSING A LOCK");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.sportCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("A GAME PLAYED BY TWO TEAMS OF\nFIVE PLAYERS WHO SCORE POINTS\n BY THROWING A LARGE BALL\nTHROUGH AN OPEN NET\n HANGING FROM A METAL RING");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("IS A BAT-AND-BALL GAME PLAYED BETWEEN\nTWO OPPOSING TEAMS\nTYPICALLY OF NINE PLAYERS EACH\nTHAT TAKE TURNS BATTING AND FIELDING");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A GAME IN WHICH TWO TEAMS\nUSE THEIR HANDS TO HIT A LARGE BALL\nBACKWARDS AND FORWARDS OVER A HIGH NET\nWITHOUT ALLOWING THE BALL\nTO TOUCH THE GROUND");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            } else if (CatogeryController.materialsCheck) {
                switch (L) {
                    case 1:
                        coverBtn.setVisible(true);
                        QLabel.setText("A HARD SUBSTANCE THAT FORMS THE BRANCHES AND\n TRUNKS OF TREES AND CAN BE USED AS A BUILDING MATERIAL");
                        break;
                    case 2:
                        coverBtn.setVisible(true);
                        QLabel.setText("A HARD BLOCK OF DRIED OR BAKED CLAY\n USED AS A BUILDING MATERIAL ");
                        break;
                    case 3:
                        coverBtn.setVisible(true);
                        QLabel.setText("A HARD , CLEAR MATERIAL THAT BREAKS EASILY .");
                        break;
                    default:
                        coverBtn.setVisible(true);
                        cover.setVisible(true);
                        back.setVisible(true);
                        break;
                }
            }
        }
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        CatogeryController.schoolCheck = false;
        CatogeryController.placesCheck = false;
        CatogeryController.bodyCheck = false;
        CatogeryController.healthCheck = false;
        CatogeryController.sportCheck = false;
        CatogeryController.homeCheck = false;
        CatogeryController.clothesheck = false;
        CatogeryController.materialsCheck = false;
        CatogeryController.foodCheck = false;
        CatogeryController.animalCheck = false;
        lvl = L;
        L = 0;
        URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\catogery.fxml").toURI().toURL();
        Parent score = FXMLLoader.load(url);

        Scene categoery = new Scene(score);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(categoery);
        window.show();
    }

    @FXML
    private void hint(ActionEvent event) {
        //image.setImage(myImage);

        if (CatogeryController.placesCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);
                        image.setImage(Image1);//zoo
                        break;
                    case 1:
                        coverBtn.setVisible(false);
                        image.setImage(Image2);//bank
                        break;
                    case 2:
                        coverBtn.setVisible(false);
                        image.setImage(Image3);
                        break;
                    case 3:
                        coverBtn.setVisible(false);
                        image.setImage(Image4);
                        break;
                }
            }
        } else if (CatogeryController.foodCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);

                        image.setImage(Image5);
                        break;
                    case 1:
                        coverBtn.setVisible(false);

                        image.setImage(Image6);
                        break;
                    case 2:
                        coverBtn.setVisible(false);

                        image.setImage(Image7);
                        break;
                    case 3:
                        coverBtn.setVisible(false);

                        image.setImage(Image8);
                        break;
                }
            }
        } else if (CatogeryController.animalCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);

                        image.setImage(Image9);
                        break;
                    case 1:
                        coverBtn.setVisible(false);

                        image.setImage(Image10);
                        break;
                    case 2:
                        coverBtn.setVisible(false);

                        image.setImage(Image11);
                        break;
                    case 3:
                        coverBtn.setVisible(false);

                        image.setImage(Image12);
                        break;
                }
            }
        } else if (CatogeryController.bodyCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);

                        image.setImage(Image13);
                        break;

                    case 1:
                        coverBtn.setVisible(false);

                        image.setImage(Image14);
                        break;

                    case 2:
                        coverBtn.setVisible(false);

                        image.setImage(Image15);
                        break;

                    case 3:
                        coverBtn.setVisible(false);

                        image.setImage(Image16);
                        break;
                }
            }
        } else if (CatogeryController.healthCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);

                        image.setImage(Image17);

                        break;

                    case 1:
                        coverBtn.setVisible(false);

                        image.setImage(Image18);
                        break;

                    case 2:
                        coverBtn.setVisible(false);

                        image.setImage(Image19);
                        break;

                    case 3:
                        coverBtn.setVisible(false);

                        image.setImage(Image20);
                        break;
                }
            }
        } else if (CatogeryController.schoolCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);

                        image.setImage(Image21);
                        break;

                    case 1:
                        coverBtn.setVisible(false);

                        image.setImage(Image22);
                        break;

                    case 2:
                        coverBtn.setVisible(false);

                        image.setImage(Image23);
                        break;

                    case 3:
                        coverBtn.setVisible(false);

                        image.setImage(Image24);
                        break;
                }
            }
        } else if (CatogeryController.clothesheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);
                        image.setImage(Image25);
                        break;

                    case 1:
                        coverBtn.setVisible(false);
                        image.setImage(Image26);
                        break;

                    case 2:
                        coverBtn.setVisible(false);
                        image.setImage(Image27);
                        break;

                    case 3:
                        coverBtn.setVisible(false);
                        image.setImage(Image28);
                        break;
                }
            }
        } else if (CatogeryController.homeCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);
                        image.setImage(Image29);
                        break;

                    case 1:
                        coverBtn.setVisible(false);
                        image.setImage(Image30);
                        break;

                    case 2:
                        coverBtn.setVisible(false);
                        image.setImage(Image31);
                        break;

                    case 3:
                        coverBtn.setVisible(false);
                        image.setImage(Image32);
                        break;
                }
            }
        } else if (CatogeryController.sportCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);
                        image.setImage(Image33);
                        break;

                    case 1:
                        coverBtn.setVisible(false);
                        image.setImage(Image34);
                        break;

                    case 2:
                        coverBtn.setVisible(false);
                        image.setImage(Image35);
                        break;

                    case 3:
                        coverBtn.setVisible(false);
                        image.setImage(Image36);
                        break;
                }
            }
        } else if (CatogeryController.materialsCheck) {
            for (int i = 0; i < 4; i++) {
                switch (L) {
                    case 0:
                        coverBtn.setVisible(false);
                        image.setImage(Image37);
                        break;

                    case 1:
                        coverBtn.setVisible(false);
                        image.setImage(Image38);
                        break;

                    case 2:
                        coverBtn.setVisible(false);
                        image.setImage(Image39);
                        break;

                    case 3:
                        coverBtn.setVisible(false);
                        image.setImage(Image40);
                        break;
                }
            }
        }

    }

    @FXML
    private void raction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("R"));
    }

    @FXML
    private void vaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("V"));
    }

    @FXML
    private void faction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("F"));
    }

    @FXML
    private void aaction(ActionEvent event
    ) {

        ansarea.setText(ansarea.getText().concat("A"));

    }

    @FXML
    private void qaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("Q"));

    }

    @FXML
    private void zaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("Z"));
    }

    @FXML
    private void waction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("W"));
    }

    @FXML
    private void saction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("S"));
    }

    @FXML
    private void xaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("X"));
    }

    @FXML
    private void eaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("E"));
    }

    @FXML
    private void daction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("D"));
    }

    @FXML
    private void caction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("C"));
    }

    @FXML
    private void taction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("T"));
    }

    @FXML
    private void gaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("G"));
    }

    @FXML
    private void baction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("B"));
    }

    @FXML
    private void yaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("Y"));
    }

    @FXML
    private void haction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("H"));
    }

    @FXML
    private void naction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("N"));
    }

    @FXML
    private void uaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("U"));
    }

    @FXML
    private void jaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("J"));
    }

    @FXML
    private void maction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("M"));
    }

    @FXML
    private void iaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("I"));
    }

    @FXML
    private void kaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("K"));
    }

    @FXML
    private void oaction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("O"));
    }

    @FXML
    private void laction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("L"));
    }

    @FXML
    private void paction(ActionEvent event
    ) {
        ansarea.setText(ansarea.getText().concat("P"));
    }

    @FXML
    void delete(MouseEvent event) {
        /*if (event.getButton() == MouseButton.PRIMARY) {
            ansarea.setText("");
        } else if (event.getButton() == MouseButton.SECONDARY) {
            ansarea.setText("");
        }*/

    }

    @FXML
    private void deleteKey(KeyEvent event
    ) {
    }

}
