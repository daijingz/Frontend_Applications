import javax.swing.*;
import java.awt.*;

public class Registration {
    // Debit Account Registration Page
    public static void scene3(Balance[] Balance_List, Database database){
        JFrame frame2 = new JFrame("Bank of CS - Debit Registration");
        frame2.setResizable(false);

        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame2.add(head1);

        JLabel head2 = new JLabel("Bank of CS");
        head2.setBounds(70,15,200,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new java.awt.Color(0, 42, 255));
        frame2.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head3);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        frame2.add(button_ling);

        JLabel head5 = new JLabel("Ready to register for digital banking?");
        head5.setBounds(30,70,300,30);
        head5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head5.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head5);

        JLabel head6 = new JLabel("Please have your debit card number handy.");
        head6.setBounds(30,110,360,30);
        head6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head6.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head6);

        JLabel head7 = new JLabel("By continuing, you agree to our Electronic Banking Services Agreement");
        head7.setBounds(30,135,500,30);
        head7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        head7.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head7);

        JLabel head8 = new JLabel("First up, let’s get your details");
        head8.setBounds(30,185,500,30);
        head8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head8.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head8);

        JLabel head9 = new JLabel("Your Card Number                                           Your Tel Number");
        head9.setBounds(30,220,500,30);
        head9.setFont(new Font("Times New Roman", Font.BOLD, 15));
        head9.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head9);

        JTextField textfield1 = new JTextField("");
        textfield1.setBounds(30,250, 200,30);
        frame2.add(textfield1);
        JTextField textfield2 = new JTextField("");
        textfield2.setBounds(330,250, 200,30);
        frame2.add(textfield2);

        JTextField textfield3 = new JTextField("");
        textfield3.setBounds(30,420, 450,30);
        frame2.add(textfield3);
        JTextField textfield4 = new JTextField("");
        textfield4.setBounds(30,490, 450,30);
        frame2.add(textfield4);
        JTextField textfield5 = new JTextField("");
        textfield5.setBounds(30,560, 450,30);
        frame2.add(textfield5);
        JTextField textfield6 = new JTextField("");
        textfield6.setBounds(30,630, 450,30);
        frame2.add(textfield6);

        textfield3.setEditable(false);
        textfield4.setEditable(false);
        textfield5.setEditable(false);
        textfield6.setEditable(false);

        JLabel error1 = new JLabel();
        error1.setForeground(new java.awt.Color(0, 0, 0));
        error1.setBounds(120,300, 270,30);
        frame2.add(error1);

        JButton next1 = new JButton("Next");
        next1.setBounds(30, 300, 60, 30);
        next1.addActionListener(e -> {
            String Input_Card_Number = textfield1.getText();
            String Input_Tel_Number = textfield2.getText();
            if (Input_Card_Number.length() != 16){
                error1.setText("Error: Invalid Card Number (Length = 16)");
                error1.setForeground(new java.awt.Color(255, 0, 0));
                frame2.add(error1);
            } else if (Input_Tel_Number.length() != 10){
                error1.setText("Error: Invalid Tel Number (Length = 10)");
                error1.setForeground(new java.awt.Color(255, 0, 0));
                frame2.add(error1);
            } else {
                error1.setText("Input Correct");
                error1.setForeground(new java.awt.Color(0, 255, 0));
                frame2.add(error1);
                textfield3.setEditable(true);
                textfield4.setEditable(true);
                textfield5.setEditable(true);
                textfield6.setEditable(true);
            }
        });
        frame2.add(next1);

        JLabel head10 = new JLabel("Then, set up your passwords");
        head10.setBounds(30,350,500,30);
        head10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head10.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head10);

        JLabel head11 = new JLabel("Your Email Address");
        head11.setBounds(30,385,300,30);
        head11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        head11.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head11);
        JLabel head12 = new JLabel("Your Password");
        head12.setBounds(30,455,300,30);
        head12.setFont(new Font("Times New Roman", Font.BOLD, 15));
        head12.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head12);
        JLabel head13 = new JLabel("Re-Enter Your Password");
        head13.setBounds(30,525,300,30);
        head13.setFont(new Font("Times New Roman", Font.BOLD, 15));
        head13.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head13);
        JLabel head14 = new JLabel("Enter Your Username");
        head14.setBounds(30,595,300,30);
        head14.setFont(new Font("Times New Roman", Font.BOLD, 15));
        head14.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head14);

        JLabel result = new JLabel();
        result.setForeground(new java.awt.Color(0, 0, 0));
        result.setBounds(120, 680, 350, 30);
        frame2.add(result);

        JButton next2 = new JButton("Next");
        next2.setBounds(30, 680, 60, 30);
        next2.addActionListener(e -> {
            String Input_Card_Number = textfield1.getText();
            String input_email_address = textfield3.getText();
            String input_password = textfield4.getText();
            String input_reenter_password = textfield5.getText();
            String input_username = textfield6.getText();
            if (!input_email_address.contains("@")){
                result.setText("Error: invalid email address");
                result.setForeground(new java.awt.Color(255, 0, 0));
                frame2.add(result);
            } else if (input_password.length() == 0 || input_reenter_password.length() == 0){
                result.setText("Error: empty password input");
                result.setForeground(new java.awt.Color(255, 0, 0));
                frame2.add(result);
            } else if (!input_password.equals(input_reenter_password)){
                result.setText("Error: password and re-enter password doesn't match");
                result.setForeground(new java.awt.Color(255, 0, 0));
                frame2.add(result);
            } else {
                result.setText("Success Registration...");
                result.setForeground(new java.awt.Color(0, 255, 0));
                frame2.add(result);
            }
        });
        frame2.add(next2);

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

    // Credit Account Registration Page
    public static void scene4(){
        JFrame frame2 = new JFrame("Bank of CS - Credit Registration");
        frame2.setResizable(false);

        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame2.add(head1);

        JLabel head2 = new JLabel("Bank of CS");
        head2.setBounds(70,15,200,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new java.awt.Color(0, 42, 255));
        frame2.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head3);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        frame2.add(button_ling);

        JLabel head4 = new JLabel("Get started with online and mobile banking");
        head4.setBounds(30,70,450,30);
        head4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head4.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head4);

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}
