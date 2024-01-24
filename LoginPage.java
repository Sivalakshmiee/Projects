import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Exception;

class CreateLoginForm extends JFrame implements ActionListener {
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;

    CreateLoginForm() {
        userLabel = new JLabel();
        userLabel.setText("Mail Id");
        textField1 = new JTextField(10);
        passLabel = new JLabel();
        passLabel.setText("Password");
        textField2 = new JPasswordField(10);
        b1 = new JButton("ENTER");
        newPanel = new JPanel(new GridLayout(4, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);
        add(newPanel, BorderLayout.CENTER);
        b1.addActionListener(this);
        setTitle("LOGIN PAGE");
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        if (userValue.equals("abc@gmail.com") && passValue.equals("abc")) {
            NewPage page = new NewPage();
            page.setVisible(true);
            JLabel label = new JLabel("Hi:" + userValue);
            page.getContentPane().add(label);
        } else {
            System.out.println("Invalid ");
        }
    }
}

class LoginPage {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            System.out.println("Connected");
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(400, 100);
            form.setVisible(true);
        } catch (Exception e) {
            System.out.println("Not connected");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
