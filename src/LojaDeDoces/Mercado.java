package LojaDeDoces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mercado extends JFrame {
    private JLabel label;
    private ImageIcon icon;
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button;
    private double total;

    public Mercado() {
        super("Mercado");
        panel = new JPanel(null);

        icon = new ImageIcon(getClass().getResource("brigadeiro.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, SwingConstants.BOTTOM+20, 100, 100);
        panel.add(label);

        icon = new ImageIcon(getClass().getResource("cookie.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, SwingConstants.BOTTOM+150, 100, 100);
        panel.add(label);

        icon = new ImageIcon(getClass().getResource("pudim.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, SwingConstants.BOTTOM+290, 100, 100);
        panel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(150, SwingConstants.BOTTOM+25, 100, 100);
        panel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(150, SwingConstants.BOTTOM+155, 100, 100);
        panel.add(label);

        label = new JLabel("R$ 10");
        label.setBounds(150, SwingConstants.BOTTOM+295, 100, 100);
        panel.add(label);

        textField1 = new JTextField(6);
        textField1.setBounds(250, SwingConstants.BOTTOM+65, 100, 20);
        panel.add(textField1);

        textField2 = new JTextField(6);
        textField2.setBounds(250, SwingConstants.BOTTOM+195, 100, 20);
        panel.add(textField2);

        textField3 = new JTextField(6);
        textField3.setBounds(250, SwingConstants.BOTTOM+335, 100, 20);
        panel.add(textField3);

        button = new JButton("Pedir");
        button.setBounds(250, SwingConstants.BOTTOM+400, 100, 20);
        panel.add(button);

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);

        add(panel);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == button) {
                total = 0.0;

                try {
                    total += (Float.parseFloat(textField1.getText())) * 10.0;
                } catch(NumberFormatException e) {
                    total += 0;
                }

                try {
                    total += (Float.parseFloat(textField2.getText())) * 10.0;
                } catch(NumberFormatException e) {
                    total += 0;
                }

                try {
                    total += (Float.parseFloat(textField3.getText())) * 10.0;
                } catch(NumberFormatException e) {
                    total += 0;
                }

                JOptionPane.showMessageDialog(null, "O total foi de R$ " + total);
            }
        }
    }
}
