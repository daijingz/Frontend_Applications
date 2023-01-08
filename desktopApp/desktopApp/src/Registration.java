import javax.swing.*;
import java.awt.*;

public class Registration {
    // Debit Account Registration Page
    public static void scene3(){
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

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}
