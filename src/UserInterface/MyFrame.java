package UserInterface;

import UserData.DaneUzytkownikow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    private JTextField userJTextField;
    private JPasswordField passwordField;



    public MyFrame(){

        //USTAWIENIA JFRME
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(240,250,240));

        JLabel userLabel = new JLabel("USER:");
        userLabel.setBounds(215,100,50,50);
        this.add(userLabel);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(180,150,150,50);
        this.add(passwordLabel);

        userJTextField = new JTextField();
        userJTextField.setSize(100,50);
        userJTextField.setBounds(260,115,100,20);
        this.add(userJTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(260,165,100,20);
        this.add(passwordField);


        final JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(150,350,100,30);
        loginButton.setMnemonic('L');
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.loginButtonAction(userJTextField,passwordField, MyFrame.this);

            }
        });
        this.add(loginButton);

        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(300,350,100,30);
        clearButton.setMnemonic('C');
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.clearButtonAction(userJTextField,passwordField,MyFrame.this);
            }
        });
        this.add(clearButton);

        this.setVisible(true);
    }

    public static void   loginButtonAction(JTextField userJTextField,JPasswordField passwordField, MyFrame frame){
          frame.getContentPane().setBackground(DaneUzytkownikow.czyTakiuzytkownikIstnieje(userJTextField,passwordField));
    }

    public static void clearButtonAction(JTextField userJTextField,JPasswordField passwordField,MyFrame frame){
        userJTextField.setText(null);
        passwordField.setText(null);
        frame.getContentPane().setBackground(new Color(240,250,240));
    }

}
