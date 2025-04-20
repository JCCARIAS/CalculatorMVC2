package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class CalculadoraView extends JFrame {
    private JTextField num1Field = new JTextField(10);
    private JTextField num2Field = new JTextField(10);
    private JButton sumarButton = new JButton("+");
    private JButton restarButton = new JButton("-");
    private JButton multiplicarButton = new JButton("*");
    private JButton dividirButton = new JButton("/");
    private JTextField resultadoField = new JTextField(10);

    public CalculadoraView() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Número 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Número 2:"));
        panel.add(num2Field);


        panel.add(sumarButton);
        panel.add(restarButton);
        panel.add(multiplicarButton);
        panel.add(dividirButton);

        panel.add(new JLabel("Resultado:"));
        panel.add(resultadoField);

        this.add(panel);
    }

    public double getNum1() {
        return Double.parseDouble(num1Field.getText());
    }
    public double getNum2() {
        return Double.parseDouble(num2Field.getText());
    }
    public void setResultado(double resultado) {
        resultadoField.setText(Double.toString(resultado));
    }

    public void addSumarListener(ActionListener listener) {
        sumarButton.addActionListener(listener);
    }

    public void addRestarListener(ActionListener listener) {
        restarButton.addActionListener(listener);
    }

    public void addMultiplicarListener(ActionListener listener) {
        multiplicarButton.addActionListener(listener);
    }

    public void addDividirListener(ActionListener listener) {
        dividirButton.addActionListener(listener);
    }

    public void mostrarError(String mensajeError) {
        JOptionPane.showMessageDialog(this, mensajeError);
}
}