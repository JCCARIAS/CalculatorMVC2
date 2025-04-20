package org.example.controller;
import org.example.model.CalculadoraModel;
import org.example.view.CalculadoraView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class CalculadoraController {
    private CalculadoraModel model;
    private CalculadoraView view;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;

        this.view.addSumarListener(new SumarListener());
        this.view.addRestarListener(new RestarListener());
        this.view.addMultiplicarListener(new MultiplicarListener());
        this.view.addDividirListener(new DividirListener());
    }

    class SumarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = view.getNum1();
                double num2 = view.getNum2();
                double resultado = model.sumar(num1, num2);
                view.setResultado(resultado);
            } catch (NumberFormatException ex) {
                view.mostrarError("Ingrese números válidos");
            }
        }
    }

    class RestarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = view.getNum1();
                double num2 = view.getNum2();
                double resultado = model.restar(num1, num2);
                view.setResultado(resultado);
            } catch (NumberFormatException ex) {
                view.mostrarError("Ingrese números válidos");
            }
        }
    }

    class MultiplicarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = view.getNum1();
                double num2 = view.getNum2();
                double resultado = model.multiplicar(num1, num2);
                view.setResultado(resultado);
            } catch (NumberFormatException ex) {
                view.mostrarError("Ingrese números válidos");
            }
        }
    }

    class DividirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = view.getNum1();
                double num2 = view.getNum2();
                double resultado = model.dividir(num1, num2);
                view.setResultado(resultado);
            } catch (NumberFormatException ex) {
                view.mostrarError("Ingrese números válidos");
            } catch (ArithmeticException ex) {
                view.mostrarError(ex.getMessage());
            }
        }
    }
}