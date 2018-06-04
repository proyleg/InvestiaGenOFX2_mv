/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.Cookie;
//import com.gargoylesoftware.htmlunit.util.WebClientUtils;
import static investiagenofx2.util.PropertiesInit.getProperties;
import static investiagenofx2.util.TransactionType.initTransactionType;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.LogManager;

import investiagenofx2.util.PropertiesInit;
import investiagenofx2.util.TransactionType;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Pierre
 */
public class InvestiaGenOFX extends Application {

    public static final Boolean debug = false;
    public static final String debugPath = "file:///C:/Users/Pierre/Downloads/InvestiaTest/New2";
    public static final String debugFullPath = debugPath + "/Pierre";
    /**
     *
     */
    private static Stage pStage;
    private static WebClient webClient;

    @Override
    public void start(Stage primaryStage) throws Exception {
        pStage = primaryStage;
        // Make sure we are in English on French java plateform
        Locale.setDefault(Locale.ENGLISH);
        webClient = new WebClient(BrowserVersion.FIREFOX_45);
        webClient.getOptions().setJavaScriptEnabled(!debug);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getCookieManager().addCookie(new Cookie("clientportal.investia.ca", "seen-popup", "true"));
        webClient.getCookieManager().addCookie(new Cookie("clientportal.investia.ca", "lang", "fr"));
//        WebClientUtils.attachVisualDebugger(webClient);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("view/investiaGenOFX.fxml"));


        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResourceAsStream("myIcons/Teddy-Bear-Sick-icon.png")));
        primaryStage.setTitle("Génération de fichier OFX pour Investia");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setX(PropertiesInit.getStageX());
        primaryStage.setY(PropertiesInit.getStageY());

        setOnCloseRequest(primaryStage);

        // When a button has focus and enter key is pressed we fireup the Button
        getPrimaryStage().addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(final KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    if (getPrimaryStage().getScene().getFocusOwner() instanceof Button) {
                        ((Button) getPrimaryStage().getScene().getFocusOwner()).fire();
                        event.consume();
                    }
                }
            }
        });
    }

    @Override
    public void init() throws Exception {
        try {
            LogManager.getLogManager().readConfiguration(getClass().getClassLoader().getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            System.out.println("Unable to initialize logging.properties");
        }
        getProperties();
        initTransactionType();
//        System.out.println(TransactionType.getTransactionType("échangesortant"));

    }

    public static void setOnCloseRequest(Stage stage) {
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            final BooleanProperty ignoreCloseRequest = new SimpleBooleanProperty(true);

            @Override
            public void handle(final WindowEvent event) {
                if (ignoreCloseRequest.get()) {
                    event.consume();
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @return the Primary Stage
     */
    public static Stage getPrimaryStage() {
        return pStage;
    }

    /**
     * @return the WebClient
     */
    public static WebClient getWebClient() {
        return webClient;
    }
}
