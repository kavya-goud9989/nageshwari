import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components
    JLabel nameLabel, emailLabel, passwordLabel, genderLabel;
    JTextField nameField, emailField;
    JPasswordField passwordField;
    JRadioButton maleButton, femaleButton;
    JButton submitButton;
    ButtonGroup genderGroup;

    // Constructor
    RegistrationForm() {
        setTitle("Registration Form");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Name
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        // Email
        emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        // Password
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        // Gender
        genderLabel = new JLabel("Gender:");
