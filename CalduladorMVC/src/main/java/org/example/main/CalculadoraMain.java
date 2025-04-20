package org.example.main;

import org.example.model.CalculadoraModel;
import org.example.view.CalculadoraView;
import org.example.controller.CalculadoraController;
public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);

        view.setVisible(true);
    }
}