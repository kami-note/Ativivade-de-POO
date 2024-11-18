package com.kryprforge.atividade7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private static final URL HOME_FXML = Main.class.getResource("home.fxml");
    private static final URL CART_FXML = Main.class.getResource("cart.fxml");
    private static final URL RESTAURANT_FXML = Main.class.getResource("restaurant.fxml");

    private static Stage mainStage; // Referência ao Stage principal

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage; // Guarda a referência ao Stage principal
        setScreen(0); // Inicializa com a tela 0
    }

    public static void setScreen(int screenId) {
        try {
            FXMLLoader fxmlLoader;
            if (screenId == 0) {
                fxmlLoader = new FXMLLoader(HOME_FXML);
            } else if (screenId == 1) {
                fxmlLoader = new FXMLLoader(CART_FXML);
            } else if (screenId == 2) {
                fxmlLoader = new FXMLLoader(RESTAURANT_FXML);
            } else {
                throw new IllegalArgumentException("Tela inválida: " + screenId);
            }

            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            mainStage.setScene(scene);
            mainStage.setTitle("Ifood");
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
