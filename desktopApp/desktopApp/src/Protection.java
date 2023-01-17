import javax.swing.*;
import java.awt.*;

public class Protection {
    public static void scene_protection_policy(){
        JFrame frame0 = new JFrame("Bank of CS - Protection Policy");
        frame0.setResizable(false);

        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame0.add(head1);

        JLabel head2 = new JLabel("Bank of CS");
        head2.setBounds(70,15,200,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new java.awt.Color(0, 42, 255));
        frame0.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new java.awt.Color(0, 0, 0));
        frame0.add(head3);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        frame0.add(button_ling);

        JLabel head4 = new JLabel("How we protect you");
        head4.setBounds(15,80,210,30);
        head4.setFont(new Font("Times New Roman", Font.BOLD, 24));
        head4.setForeground(new java.awt.Color(255, 255, 255));
        head4.setOpaque(true);
        head4.setBackground(new java.awt.Color(0, 125, 180));
        frame0.add(head4);

        JLabel head5 = new JLabel("<html>Your security is our priority. That’s why we work hard to bring you the fast, convenient personal " +
                "and business banking experiences you’ve come to expect, while applying advanced security " +
                "measures to protect your financial details.</html>", SwingConstants.CENTER);
        head5.setBounds(15,115,750,40);
        head5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head5.setForeground(new java.awt.Color(0, 0, 0));
        frame0.add(head5);

        JLabel head6 = new JLabel("Security however you bank");
        head6.setBounds(15,170,500,30);
        head6.setFont(new Font("Times New Roman", Font.BOLD, 24));
        head6.setForeground(new java.awt.Color(255, 255, 255));
        head6.setOpaque(true);
        head6.setBackground(new java.awt.Color(0, 125, 180));
        frame0.add(head6);

        //True Icon group set
        ImageIcon imgTrue = new ImageIcon("C:\\Users\\david\\IdeaProjects\\desktopApp\\src\\icon_true.png");
        Image brand0 = imgTrue.getImage();
        brand0 = brand0.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
        imgTrue = new ImageIcon(brand0);

        JLabel head_true1 = new JLabel();
        head_true1.setBounds(15,210,30,30);
        head_true1.setIcon(imgTrue);
        frame0.add(head_true1);

        JLabel head_true2 = new JLabel();
        head_true2.setBounds(15,250,30,30);
        head_true2.setIcon(imgTrue);
        frame0.add(head_true2);

        JLabel head_true3 = new JLabel();
        head_true3.setBounds(15,290,30,30);
        head_true3.setIcon(imgTrue);
        frame0.add(head_true3);

        JLabel head_true4 = new JLabel();
        head_true4.setBounds(15,330,30,30);
        head_true4.setIcon(imgTrue);
        frame0.add(head_true4);

        JLabel head7 = new JLabel("<html><b>Online banking</b> - Bank online knowing that all info you exchange with us over the internet is secure.</html>");
        head7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head7.setBounds(55,210,700,30);
        frame0.add(head7);

        JLabel head8 = new JLabel("<html><b>Mobile banking</b> - Protect your mobile device and identity from scammers while banking through CSO mobile app.</html>");
        head8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head8.setBounds(55,250,700,30);
        frame0.add(head8);

        JLabel head9 = new JLabel("<html><b>ATM banking</b> - Deposit or withdraw at BMO ATM. Automated teller machines with the confidence that if anything goes wrong, we're here to help.</html>");
        head9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head9.setBounds(55,290,700,40);
        frame0.add(head9);

        JLabel head10 = new JLabel("<html><b>Telephone banking</b> - Make a transaction safely by phone with voice recognition and a unique PIN to confirm your identity.</html>");
        head10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head10.setBounds(55,330,700,40);
        frame0.add(head10);

        JLabel head11 = new JLabel("Setting the standard for bank security");
        head11.setBounds(15,380,450,30);
        head11.setFont(new Font("Times New Roman", Font.BOLD, 24));
        head11.setForeground(new java.awt.Color(255, 255, 255));
        head11.setOpaque(true);
        head11.setBackground(new java.awt.Color(0, 125, 180));
        frame0.add(head11);

        JLabel head12 = new JLabel("<html>Your security is important to us. That’s why we go above and beyond to protect you." +
                " Our Financial Crimes Unit (FCU) is a security operations team " +
                "that’s the first of its kind in Canada.</html>", SwingConstants.CENTER);
        head12.setBounds(15,430,750,30);
        head12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head12.setForeground(new java.awt.Color(0, 0, 0));
        frame0.add(head12);

        JLabel head13 = new JLabel("<html>Founded in 2019, the FCUF C U combines world-class expertise " +
                "from our cyber security, fraud, physical security, " +
                "and crisis management teams to detect, prevent, " +
                "respond to and recover from security threats.</html>", SwingConstants.CENTER);
        head13.setBounds(15,480,750,30);
        head13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head13.setForeground(new java.awt.Color(0, 0, 0));
        frame0.add(head13);

        frame0.setSize(800,800);
        frame0.setLayout(null);
        frame0.setVisible(true);
    }
}
