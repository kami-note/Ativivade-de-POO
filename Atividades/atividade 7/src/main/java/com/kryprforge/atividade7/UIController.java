package com.kryprforge.atividade7;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UIController {
    @FXML
    public Button SeeMoreButton;

    @FXML
    private Button CartButton;

    @FXML
    private void handleSeeMoreButtonClick() {
        Main.setScreen(2);
    }

    @FXML
    private void handleCartButtonClick() {
        Main.setScreen(1);
    }

    @FXML
    private void handleBackButtonClick() {
        Main.setScreen(0);
    }
}
