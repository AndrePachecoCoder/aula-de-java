package TelaDeLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame{
    private JLabel label;
    private JPasswordField password;
    private JTextField textField;
    private JPanel panel;
    private JButton button;
    private ImageIcon icon;
    public Login() {
        super("Tela de Login");
        panel = new JPanel();

        icon = new ImageIcon(getClass().getResource("logo.png"));
        label = new JLabel(icon);
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        panel.add(label);

        textField = new JTextField(6);
        textField.setBounds(20, SwingConstants.BOTTOM+300, 100, 20);
        panel.add(textField);

        password = new JPasswordField(6);
        password.setBounds(20, SwingConstants.BOTTOM+400, 100, 20);
        panel.add(password);

        button = new JButton("Confirmar");
        button.setBounds(20, SwingConstants.BOTTOM+500, 50, 20);
        panel.add(button);

        add(panel);

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == button) {
                JOptionPane.showMessageDialog(null, "A senha de "+textField.getText() + " é "+ Arrays.toString(password.getPassword()));
            }
        }
    }
}
