import javax.swing.*;
import java.awt.*;
import java.time.*;

class Accounts extends JFrame{
    // Account Summary Page
    public static void scene2(Record record) throws Exception {
        JFrame frame2 = new JFrame("Bank of CS - Homepage");

        Balance Balance_R1 = new Balance("Jingze Dai");
        Balance_R1.set_chequering_balance(2000.0);
        Balance_R1.set_saving_balance(1000.0);
        Balance Balance_R2 = new Balance("daij24");
        Balance_R2.set_chequering_balance(800.0);
        Balance_R2.set_saving_balance(3000.0);
        Balance Balance_R3 = new Balance("daijingz");
        Balance_R3.set_chequering_balance(5000.0);
        Balance_R3.set_saving_balance(1500.0);
        Balance[] Balance_List = new Balance[]{Balance_R1, Balance_R2, Balance_R3};

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

        LocalTime timeObj = LocalTime.now();
        JLabel head5 = new JLabel();
        if (timeObj.getHour() < 12){
            head5.setText("Good Morning, " + record.get_user_name());
        } else if (timeObj.getHour() < 18){
            head5.setText("Good Afternoon, " + record.get_user_name());
        } else if (timeObj.getHour() < 21){
            head5.setText("Good Evening, " + record.get_user_name());
        } else {
            head5.setText("Good Night, " + record.get_user_name());
        }
        head5.setBounds(30,75,400,40);
        head5.setFont(new Font("Times New Roman", Font.PLAIN, 36));
        head5.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head5);

        JLabel head6 = new JLabel("Bank Accounts");
        head6.setBounds(35,120,200,30);
        head6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head6.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head6);

        String total_balance = "Unknown";
        for (Balance balance : Balance_List) {
            if (balance.get_user_name().equals(record.get_user_name())) {
                total_balance = String.valueOf(balance.get_chequering_balance()
                        + balance.get_saving_balance());
            }
        }
        JLabel head7 = new JLabel("Total Balance: " + total_balance);
        head7.setBounds(220,120,200,30);
        head7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head7.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head7);

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}