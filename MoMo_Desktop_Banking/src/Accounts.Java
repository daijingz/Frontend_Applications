import javax.swing.*;
import java.awt.*;
import java.time.*;

class Accounts extends JFrame{
    // Account Summary Page
    public static void scene2(Record record) throws Exception {
        JFrame frame2 = new JFrame("MoMo Bank - Homepage");
        frame2.setResizable(false);

        final var ref = new Object() {
            boolean profileIsOpen = false;
        };

        Balance Balance_R1 = new Balance("Jingze Dai", 3000);
        Balance_R1.set_chequering_balance(2000.0);
        Balance_R1.set_saving_balance(1000.0);
        Balance Balance_R2 = new Balance("daij24", 2000);
        Balance_R2.set_chequering_balance(800.0);
        Balance_R2.set_saving_balance(3000.0);
        Balance Balance_R3 = new Balance("daijingz", 15000);
        Balance_R3.set_chequering_balance(5000.0);
        Balance_R3.set_saving_balance(1500.0);
        Balance[] Balance_List = new Balance[]{Balance_R1, Balance_R2, Balance_R3};

        Balance user_balance = new Balance(record.get_user_name(), -1);
        for (int i = 0; i < 3; i++){
            if (Balance_List[i].get_user_name().equals(record.get_user_name())){
                user_balance = Balance_List[i];
            }
        }

        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("src\\icon\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame2.add(head1);

        JLabel head2 = new JLabel("MoMo Bank");
        head2.setBounds(70,15,240,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new java.awt.Color(0, 42, 255));
        frame2.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head3);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("src\\icon\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        frame2.add(button_ling);

        //Personal Profile Option Brand
        ImageIcon brandPerson = new ImageIcon("src\\icon\\icon_personal_profile.png");
        Image brand2 = brandPerson.getImage();
        brand2 = brand2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandPerson = new ImageIcon(brand2);
        JButton button_person = new JButton(brandPerson);
        button_person.setBounds(720, 90, 50, 50);

        button_person.addActionListener(e -> {
            try {
                if (!ref.profileIsOpen){
                    ref.profileIsOpen = true;
                    PersonalProfile.scene_pp();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        frame2.add(button_person);

        //Personal Profile Option Brand
        ImageIcon brandSetting = new ImageIcon("src\\icon\\icon_setting.png");
        Image brand3 = brandSetting.getImage();
        brand3 = brand3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandSetting = new ImageIcon(brand3);
        JButton button_setting = new JButton(brandSetting);
        button_setting.setBounds(720, 160, 50, 50);
        button_setting.addActionListener(e -> {
            try {
                Setting.scene_setting();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        frame2.add(button_setting);

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
        head5.setBounds(30,75,500,40);
        head5.setFont(new Font("Times New Roman", Font.PLAIN, 36));
        head5.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head5);

        JLabel head6 = new JLabel("Bank Accounts");
        head6.setBounds(30,120,200,30);
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

        JLabel head7 = new JLabel("Total Balance: ");
        head7.setBounds(220,120,200,30);
        head7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head7.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head7);

        ImageIcon icon_printer = new ImageIcon("src\\icon\\icon_printer.png");
        Image brand_printer = icon_printer.getImage();
        brand_printer = brand_printer.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        icon_printer = new ImageIcon(brand_printer);
        JButton button_printer = new JButton(icon_printer);
        button_printer.setBounds(450, 120, 50, 50);
        frame2.add(button_printer);

        JLabel head8 = new JLabel(total_balance);
        head8.setBounds(350,120,200,30);
        head8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head8.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head8);

        JButton button1 = new JButton("Chequing Balance - " + user_balance.get_chequering_balance());
        button1.setBounds(30,170,200,30);
        frame2.add(button1);

        JButton button2 = new JButton("Saving Balance - " + user_balance.get_saving_balance());
        button2.setBounds(30,220,200,30);
        frame2.add(button2);

        JButton button3 = new JButton("+ Open a new Account");
        button3.setBounds(30,270,200,30);
        frame2.add(button3);

        String[] money_move = {"Account Transfers","Bill Payments","Interact E-Transfer","Global Money Transfer"};
        JComboBox comboBox1 = new JComboBox(money_move);
        comboBox1.setBounds(30, 320, 200, 30);
        frame2.add(comboBox1);

        JButton button4 = new JButton("Move Money");
        button4.setBounds(250,320,200,30);
        frame2.add(button4);

        JLabel head9 = new JLabel("Credit cards");
        head9.setBounds(30,370,200,30);
        head9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head9.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head9);

        JButton button5 = new JButton("Apply for a new credit card");
        button5.setBounds(30,420,200,30);
        frame2.add(button5);

        JLabel head10 = new JLabel("Loans & mortgages");
        head10.setBounds(30,470,200,30);
        head10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head10.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head10);

        JButton button6 = new JButton("Apply for a line of credit");
        button6.setBounds(30,520,200,30);
        frame2.add(button6);

        JButton button7 = new JButton("Get Pre-Approved For a Mortgage");
        button7.setBounds(250,520,250,30);
        frame2.add(button7);

        JLabel head11 = new JLabel("Investments");
        head11.setBounds(30,570,200,30);
        head11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        head11.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head11);

        JLabel head12 = new JLabel("Non-Registered Investments");
        head12.setBounds(30,620,200,30);
        head12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        head12.setForeground(new java.awt.Color(0, 0, 0));
        frame2.add(head12);

        JButton button8 = new JButton("BMO Term Investments");
        button8.setBounds(30,670,200,30);
        frame2.add(button8);

        JButton button9 = new JButton("Invest in TFSA");
        button9.setBounds(30,720,200,30);
        frame2.add(button9);

        JButton button10 = new JButton("Purchase an RRSP GIC");
        button10.setBounds(250,720,200,30);
        frame2.add(button10);

        JButton button11 = new JButton("Purchase an GIC");
        button11.setBounds(470,720,200,30);
        frame2.add(button11);

        frame2.setSize(800,800);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}