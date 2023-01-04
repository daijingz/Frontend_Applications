import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration {
    // Account Registration Page
    public static void scene3(){
        JFrame frame2 = new JFrame("Bank of CS - Registration");

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
        JLabel head4 = new JLabel();
        ImageIcon brandLing = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_language.png");
        Image brand3 = brandLing.getImage();
        brand3 = brand3.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand3);
        head4.setIcon(brandLing);
        Dimension size3 = head4.getPreferredSize();
        head4.setBounds(700, 30, size3.width, size3.height);
        frame2.add(head4);

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}
