import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

class GUI6 extends JFrame{
    // Exit Page (When there are some errors detected)
    public void exit_Page() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        JFrame frame0 = new JFrame("Exit...");
        frame0.setResizable(false);

        String soundName = "src\\music\\CantinaBand60.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();

        //Sound Option Brand
        ImageIcon brandSound1 = new ImageIcon("src\\icon\\icon_sound_on.png");
        ImageIcon brandSound2 = new ImageIcon("src\\icon\\icon_sound_off.png");
        Image soundOn = brandSound1.getImage();
        Image soundOff = brandSound2.getImage();
        soundOn = soundOn.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        soundOff = soundOff.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        brandSound1 = new ImageIcon(soundOn);
        brandSound2 = new ImageIcon(soundOff);
        JButton button_Sound = new JButton(brandSound1);
        ImageIcon finalBrandSound1 = brandSound1;
        ImageIcon finalBrandSound2 = brandSound2;
        button_Sound.setBounds(720, 90, 50, 50);
        final boolean[] soundIsOn = {true};
        button_Sound.addMouseListener((new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (soundIsOn[0]){
                    soundIsOn[0] = false;
                    button_Sound.setIcon(finalBrandSound2);
                    clip.stop();
                } else {
                    soundIsOn[0] = true;
                    button_Sound.setIcon(finalBrandSound1);
                    clip.start();
                }
            }
        }));
        frame0.add(button_Sound);

        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("src\\icon\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame0.add(head1);

        JLabel head2 = new JLabel("MoMo Bank");
        head2.setBounds(70,15,200,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new java.awt.Color(0, 42, 255));
        frame0.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new java.awt.Color(0, 0, 0));
        frame0.add(head3);

        JLabel head4 = new JLabel("Error Detected: Exit...");
        head4.setBounds(70,135,500,60);
        head4.setFont(new Font("Monaco", Font.PLAIN, 48));
        head4.setForeground(new java.awt.Color(255, 52, 255));
        frame0.add(head4);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("src\\icon\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        frame0.add(button_ling);

        frame0.setSize(800,800);
        frame0.setLayout(null);
        frame0.setVisible(true);
    }

    // Login Page
    public void Login_Page(Database Db1) throws Exception {
        // Homepage Frame
        JFrame frame1 = new JFrame("MoMo Bank - Login Page");
        frame1.setResizable(false);

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

        Record Record1 = new Record("1520298043025567", "1234567890", "Jingze Dai");
        Record Record2 = new Record("1502756788294430", "abc12345", "daij24");
        Record Record3 = new Record("1111222233334444", "qwer7890", "daijingz");
        Database Bank_Database = new Database(10, "MoMo Bank Database");
        Bank_Database.add_Record_List(Record1, Record2, Record3);

        AtomicReference<String> soundName = new AtomicReference<>("src\\music\\CantinaBand60.wav");
        AtomicReference<AudioInputStream> audioInputStream = new AtomicReference<>(AudioSystem.getAudioInputStream(new File(String.valueOf(soundName)).getAbsoluteFile()));
        AtomicReference<Clip> clip = new AtomicReference<>(AudioSystem.getClip());
        clip.get().open(audioInputStream.get());
        clip.get().start();

        // Choice for signing up
        JRadioButton radioButton1 = new JRadioButton("I have a Debit Card");
        JRadioButton radioButton2 = new JRadioButton("I have a Credit Card");
        radioButton1.setBounds(60,350,200,30);
        radioButton2.setBounds(300,350,200,30);
        ButtonGroup button_Group = new ButtonGroup();
        button_Group.add(radioButton1);
        button_Group.add(radioButton2);
        frame1.add(radioButton1);
        frame1.add(radioButton2);

        JRadioButton radioButton3 = new JRadioButton("Remember me");
        radioButton3.setBounds(200,250,150,30);
        frame1.add(radioButton3);

        // MoMo Bank brand and title
        JLabel head1 = new JLabel();
        ImageIcon brandIcon = new ImageIcon("src\\icon\\icon_brand.png");
        Image brand = brandIcon.getImage();
        brand = brand.getScaledInstance(60, 60,  Image.SCALE_SMOOTH);
        brandIcon = new ImageIcon(brand);
        head1.setIcon(brandIcon);
        Dimension size = head1.getPreferredSize();
        head1.setBounds(0, 0, size.width, size.height);
        frame1.add(head1);

        JLabel head2 = new JLabel("MoMo Bank");
        head2.setBounds(70,15,240,30);
        head2.setFont(new Font("Monaco", Font.BOLD, 36));
        head2.setForeground(new Color(0, 42, 255));
        frame1.add(head2);

        JLabel head3 = new JLabel("We are here to help");
        head3.setBounds(350,15,230,30);
        head3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        head3.setForeground(new Color(0, 0, 0));
        frame1.add(head3);

        JLabel head4 = new JLabel("Sign in to Online Banking");
        head4.setBounds(50,100,300,30);
        head4.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        head4.setForeground(new Color(0, 0, 0));
        frame1.add(head4);

        JLabel head5 = new JLabel("Register for Online Banking");
        head5.setBounds(50,300,300,30);
        head5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        head5.setForeground(new Color(0, 0, 0));
        frame1.add(head5);

        JLabel head6 = new JLabel("Have Questions?");
        head6.setBounds(50,450,300,30);
        head6.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        head6.setForeground(new Color(0, 0, 0));
        frame1.add(head6);

        JLabel head7 = new JLabel("Provide Feedback");
        head7.setBounds(50,550,300,30);
        head7.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        head7.setForeground(new Color(0, 0, 0));
        frame1.add(head7);

        // Remind messages
        JLabel label1 = new JLabel("Your Card Number");
        label1.setBounds(50,130, 200,30);
        JLabel label2 = new JLabel("Your Password");
        label2.setBounds(350,130, 200,30);
        frame1.add(label1);
        frame1.add(label2);

        JLabel label3 = new JLabel("Enter your 16-digit card number");
        label3.setBounds(50,200, 350,30);
        frame1.add(label3);

        JLabel label4 = new JLabel("");
        label4.setBounds(200,400, 400,30);
        frame1.add(label4);

        JLabel label5 = new JLabel("");
        label5.setBounds(350,250, 300,30);
        frame1.add(label5);

        // Login input fields (card number and password)
        JTextField textfield1 = new JTextField("");
        textfield1.setBounds(50,165, 200,30);
        frame1.add(textfield1);
        JTextField textfield2 = new JTextField("");
        textfield2.setBounds(350,165, 200,30);
        frame1.add(textfield2);

        // Extract inputs and checks whether login inputs fulfils
        ActionListener actionListener1 = actionEvent -> {
            if (radioButton3.isSelected()){
                label5.setForeground(new Color(255, 125, 0));
                label5.setText("Warning: Do not save in the public computers");
            } else {
                label5.setForeground(new Color(0, 0, 0));
                label5.setText("");
            }

            String tf_value_account = textfield1.getText();
            String tf_value_password = textfield2.getText();
            if (tf_value_account.length() == 0) {
                label3.setForeground(new Color(255, 0, 0));
                label3.setText("Error: Empty card number");
            } else if (tf_value_account.length() != 16) {
                label3.setForeground(new Color(255, 0, 0));
                label3.setText("Error: Card number length should be 16");
            } else if (tf_value_password.length() > 0){
                boolean isMatched = false;
                for (int i = 0; i < Db1.get_Record_List().length; i++){
                    if (Db1.get_Record_List()[i].get_password().equals(tf_value_password) &&
                            tf_value_account.equals(Db1.get_Record_List()[i].get_card_f4()
                                    + Db1.get_Record_List()[i].get_card_s4()
                                    + Db1.get_Record_List()[i].get_card_t4()
                                    + Db1.get_Record_List()[i].get_card_l4())){
                        label3.setForeground(new Color(0, 255, 0));
                        label3.setText("Successfully Login...");
                        isMatched = true;
                        try {
                            Accounts.scene2(Db1.get_Record_List()[i]);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (!isMatched) {
                    label3.setForeground(new Color(255, 0, 0));
                    label3.setText("Error: Your Username and Password didn't match");
                }
            } else {
                label3.setForeground(new Color(255, 0, 0));
                label3.setText("Error: Empty Password");
            }
        };

        // Login Button and Signup Button
        JButton button1 = new JButton("Log in");
        button1.setBounds(50,250,95,30);
        button1.addActionListener(actionListener1);
        frame1.add(button1);

        ActionListener actionListener2 = actionEvent -> {
            boolean Debit_Op = radioButton1.isSelected();
            boolean Credit_Op = radioButton2.isSelected();
            if (!(Debit_Op || Credit_Op)){
                label4.setForeground(new Color(255, 0, 0));
                label4.setText("Error: You have not selected a registration card option");
            } else {
                label4.setForeground(new Color(0, 255, 0));
                label4.setText("Processing...");
                if (radioButton1.isSelected()){
                    Registration.scene3(Balance_List, Bank_Database);
                } else if (radioButton2.isSelected()){
                    Registration.scene4();
                }
            }
        };

        JButton button2 = new JButton("Sign up");
        button2.setBounds(50,400,95,30);
        button2.addActionListener(actionListener2);
        frame1.add(button2);

        JButton button3 = new JButton("Visit Bank Branches");
        button3.setBounds(50,500,180,30);
        frame1.add(button3);

        JButton button4 = new JButton("Book an appointment");
        button4.setBounds(250,500,180,30);
        frame1.add(button4);

        JButton button5 = new JButton("Contact us");
        button5.setBounds(450,500,180,30);
        frame1.add(button5);

        JButton button6 = new JButton("Write Questionnaire");
        button6.setBounds(50,600,180,30);
        frame1.add(button6);

        JLabel head8 = new JLabel();
        ImageIcon brandLock = new ImageIcon("src\\icon\\icon_lock.png");
        Image brand2 = brandLock.getImage();
        brand2 = brand2.getScaledInstance(60, 60,  Image.SCALE_SMOOTH);
        brandLock = new ImageIcon(brand2);
        head8.setIcon(brandLock);
        Dimension size2 = head1.getPreferredSize();
        head8.setBounds(30, 680, size2.width, size2.height);
        frame1.add(head8);

        JLabel head9 = new JLabel("Your security always comes first.");
        head9.setBounds(90,670,400,30);
        head9.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        head9.setForeground(new Color(0, 0, 0));
        frame1.add(head9);

        JLabel label6 = new JLabel("We are using advanced security technologies " +
                "that keep your money and information safe.");
        label6.setBounds(95,690, 600,40);
        frame1.add(label6);

        JLabel hyperlink = new JLabel("Learn more about how we protect you.");
        hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setBounds(95,710, 600,40);
        hyperlink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                Protection.scene_protection_policy_pg1();
            }

            @Override
            public void mouseEntered(MouseEvent e){
                hyperlink.setForeground(Color.PINK.darker());
            }

            @Override
            public void mouseExited(MouseEvent e){
                hyperlink.setForeground(Color.BLUE.darker());
            }
        });
        frame1.add(hyperlink);

        //Language Option Brand
        ImageIcon brandLing = new ImageIcon("src\\icon\\icon_language.png");
        Image brand1 = brandLing.getImage();
        brand1 = brand1.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        brandLing = new ImageIcon(brand1);
        JButton button_ling = new JButton(brandLing);
        button_ling.setBounds(720, 20, 50, 50);
        final var ref1 = new Object() {
            boolean isEnglish = true;
        };
        button_ling.addActionListener(e -> {
            if (ref1.isEnglish){
                head2.setText("Banque MoMo");
                head2.setBounds(70,15,300,30);
                head3.setText("Nous sommes ici pour aider");
                head3.setBounds(400,15,230,30);
                head4.setText("Ouverture de session – Services bancaires en ligne");
                head4.setBounds(50,100,500,30);
                head5.setText("Inscrire une nouvelle carte");
                head5.setBounds(50,300,500,30);
                head6.setText("Avoir des questions?");
                head6.setBounds(50,450,400,30);
                head7.setText("Fournir une réponse");
                head7.setBounds(50,550,400,30);
                ref1.isEnglish = false;
            } else {
                head2.setText("MoMo Bank");
                head2.setBounds(70,15,240,30);
                head3.setText("We are here to help");
                head3.setBounds(350,15,230,30);
                head4.setText("Sign in to Online Banking");
                head4.setBounds(50,100,300,30);
                head5.setText("Register for Online Banking");
                head5.setBounds(50,300,300,30);
                head6.setText("Have Questions?");
                head6.setBounds(50,450,300,30);
                head7.setText("Provide Feedback");
                head7.setBounds(50,550,300,30);
                ref1.isEnglish = true;
            }
        });
        frame1.add(button_ling);

        //Sound Option Brand
        ImageIcon brandSound1 = new ImageIcon("src\\icon\\icon_sound_on.png");
        ImageIcon brandSound2 = new ImageIcon("src\\icon\\icon_sound_off.png");
        Image soundOn = brandSound1.getImage();
        Image soundOff = brandSound2.getImage();
        soundOn = soundOn.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        soundOff = soundOff.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        brandSound1 = new ImageIcon(soundOn);
        brandSound2 = new ImageIcon(soundOff);
        JButton button_Sound = new JButton(brandSound1);
        ImageIcon finalBrandSound1 = brandSound1;
        ImageIcon finalBrandSound2 = brandSound2;
        button_Sound.setBounds(720, 90, 50, 50);
        final boolean[] soundIsOn = {true};
        button_Sound.addMouseListener((new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (soundIsOn[0]){
                    soundIsOn[0] = false;
                    button_Sound.setIcon(finalBrandSound2);
                    clip.get().stop();
                } else {
                    soundIsOn[0] = true;
                    button_Sound.setIcon(finalBrandSound1);
                    clip.get().start();
                }
            }
        }));
        frame1.add(button_Sound);

        //Music Option Brand
        ImageIcon brandMusic = new ImageIcon("src\\icon\\icon_music.png");
        Image brand_Music = brandMusic.getImage();
        brand_Music = brand_Music.getScaledInstance(50, 50,  Image.SCALE_SMOOTH);
        brandMusic = new ImageIcon(brand_Music);
        JButton button_Music = new JButton(brandMusic);
        button_Music.setBounds(720, 160, 50, 50);

        var ref = new Object() {
            boolean Music = true;
        };

        button_Music.addActionListener(e -> {
            if (ref.Music) {
                ref.Music = false;
                clip.get().stop();
                soundName.set("src\\music\\StarWars60.wav");
                try {
                    audioInputStream.set(AudioSystem.getAudioInputStream(new File(String.valueOf(soundName)).getAbsoluteFile()));
                } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                    unsupportedAudioFileException.printStackTrace();
                }
                try {
                    clip.set(AudioSystem.getClip());
                    clip.get().open(audioInputStream.get());
                } catch (LineUnavailableException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            } else {
                ref.Music = true;
                clip.get().stop();
                soundName.set("src\\music\\CantinaBand60.wav");
                try {
                    audioInputStream.set(AudioSystem.getAudioInputStream(new File(String.valueOf(soundName)).getAbsoluteFile()));
                } catch (UnsupportedAudioFileException | IOException unsupportedAudioFileException) {
                    unsupportedAudioFileException.printStackTrace();
                }
                try {
                    clip.set(AudioSystem.getClip());
                        clip.get().open(audioInputStream.get());
                } catch (LineUnavailableException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            }
            clip.get().start();
        });
        frame1.add(button_Music);

        frame1.setSize(800,800);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }

    public GUI6() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            Record Record1 = new Record("1520298043025567", "1234567890", "Jingze Dai");
            Record Record2 = new Record("1502756788294430", "abc12345", "daij24");
            Record Record3 = new Record("1111222233334444", "qwer7890", "daijingz");
            Database Bank_Database = new Database(10, "MoMo Bank Database");
            Bank_Database.add_Record_List(Record1, Record2, Record3);
            Login_Page(Bank_Database);
        } catch(Exception e) {
            exit_Page();
        }
    }

    // Main Function
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new GUI6();
    }
}