package TelaDeLogin;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setSize(600, 600);
        login.setVisible(true);
    }
}
