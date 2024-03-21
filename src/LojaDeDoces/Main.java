package LojaDeDoces;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        mercado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mercado.setSize(500, 500);
        mercado.setVisible(true);
        mercado.setResizable(false);
    }
}