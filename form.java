import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class form {

    public static void login_page() {
        JFrame loginFrame = new JFrame("Login");

        // Background Image
        try {

            Image backgroundImage = ImageIO.read(new File("Baby Blue.jpg"));
            BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage);
            loginFrame.setContentPane(backgroundPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel userLabel = new JLabel("Username  :");
        userLabel.setFont(new Font("ROG Fonts", Font.PLAIN, 20));
        userLabel.setBounds(100, 150, 200, 30);

        JLabel passwordLabel = new JLabel("Password  :");
        passwordLabel.setFont(new Font("ROG Fonts", Font.PLAIN, 20));
        passwordLabel.setBounds(100, 250, 200, 30);

        JTextField userTextField = new JTextField();
        userTextField.setBounds(300, 150, 150, 30);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(300, 250, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        loginButton.setBounds(200, 350, 120, 40);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passwordField.getPassword());

                if (isValidLogin(username, password)) {
                    loginFrame.dispose();
                    menu();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid username or password", "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFrame.add(userLabel);
        loginFrame.add(passwordLabel);
        loginFrame.add(userTextField);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);

        loginFrame.setSize(600, 650);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isValidLogin(String username, String password) {
        return username.equals("Admin") && password.equals("admin@123");
    }

    public static void menu() {
        JFrame menuFrame = new JFrame("Menu");

        // Background Image
        try {

            Image backgroundImage = ImageIO.read(new File("Baby Blue.jpg"));
            BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage);
            menuFrame.setContentPane(backgroundPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JButton addButton = new JButton("Add Record");
        addButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        addButton.setBounds(200, 150, 220, 40);

        JButton displayButton = new JButton("Display Record");
        displayButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        displayButton.setBounds(200, 215, 220, 40);

        JButton searchButton = new JButton("Search Record");
        searchButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        searchButton.setBounds(200, 280, 220, 40);

        JButton updateButton = new JButton("Update Record");
        updateButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        updateButton.setBounds(200, 345, 220, 40);

        JButton deleteButton = new JButton("Delete Record");
        deleteButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        deleteButton.setBounds(200, 410, 220, 40);

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        exitButton.setBounds(200, 475, 220, 40);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // menuFrame.dispose();
                add_record();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display_records();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search_records();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.dispose();

            }
        });

        menuFrame.add(addButton);
        menuFrame.add(displayButton);
        menuFrame.add(searchButton);
        menuFrame.add(updateButton);
        menuFrame.add(deleteButton);
        menuFrame.add(exitButton);

        menuFrame.setSize(600, 700);
        menuFrame.setLayout(null);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setVisible(true);

    }

    public static void add_record() {
        JFrame f = new JFrame("Registeration Form");

        // Background Image
        try {

            Image backgroundImage = ImageIO.read(new File("Baby Blue.jpg"));
            BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage);
            f.setContentPane(backgroundPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel l1;
        l1 = new JLabel("Registration   Form");
        l1.setFont(new Font("ROG Fonts", Font.PLAIN, 30));
        l1.setBounds(550, 30, 450, 70);

        JLabel l2, l3;
        l2 = new JLabel("Student  Details");
        l2.setFont(new Font("ROG Fonts", Font.PLAIN, 16));
        l2.setBounds(80, 100, 450, 70);
        l3 = new JLabel("________________________________________");
        l3.setBounds(80, 105, 450, 70);

        JLabel l4;
        l4 = new JLabel("First name *");
        l4.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l4.setBounds(150, 170, 150, 30);
        JTextField t1;
        t1 = new JTextField();
        t1.setBounds(400, 170, 250, 25);

        JLabel l5;
        l5 = new JLabel("Last Name");
        l5.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l5.setBounds(800, 170, 150, 30);
        JTextField t2;
        t2 = new JTextField();
        t2.setBounds(1050, 170, 250, 25);

        JLabel l6;
        l6 = new JLabel("Date of Birth *");
        l6.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l6.setBounds(150, 220, 150, 30);
        String dob[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        JComboBox cb1 = new JComboBox(dob);
        cb1.setBounds(400, 220, 60, 25);

        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        JComboBox cb2 = new JComboBox(month);
        cb2.setBounds(475, 220, 80, 25);

        String year[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
                "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021", "2022", "2023" };
        JComboBox cb3 = new JComboBox(year);
        cb3.setBounds(568, 220, 80, 25);

        JLabel l7;
        l7 = new JLabel("Gender *");
        l7.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l7.setBounds(800, 220, 150, 30);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(1050, 220, 70, 30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(1140, 220, 70, 30);
        JRadioButton r3 = new JRadioButton("Other");
        r3.setBounds(1230, 220, 70, 30);
        ButtonGroup bg = new ButtonGroup();

        // ******************************************************************

        JLabel l8, l9;
        l8 = new JLabel("Parent  Details");
        l8.setFont(new Font("ROG Fonts", Font.PLAIN, 16));
        l8.setBounds(80, 260, 450, 70);
        l9 = new JLabel("________________________________________");
        l9.setBounds(80, 265, 450, 70);

        JLabel l10;
        l10 = new JLabel("Father Name ");
        l10.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l10.setBounds(150, 330, 150, 30);
        JTextField t3;
        t3 = new JTextField();
        t3.setBounds(400, 330, 250, 25);

        JLabel l11;
        l11 = new JLabel("Father Profession");
        l11.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l11.setBounds(800, 330, 150, 30);
        JTextField t4;
        t4 = new JTextField();
        t4.setBounds(1050, 330, 250, 25);

        JLabel l12;
        l12 = new JLabel("Mother Name ");
        l12.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l12.setBounds(150, 380, 150, 30);
        JTextField t5;
        t5 = new JTextField();
        t5.setBounds(400, 380, 250, 25);

        JLabel l13;
        l13 = new JLabel("Mother Profession");
        l13.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l13.setBounds(800, 380, 150, 30);
        JTextField t6;
        t6 = new JTextField();
        t6.setBounds(1050, 380, 250, 25);

        JLabel l14;
        l14 = new JLabel("Father Contact No ");
        l14.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l14.setBounds(150, 430, 150, 30);
        JTextField t7;
        t7 = new JTextField();
        t7.setBounds(400, 430, 250, 25);

        JLabel l15;
        l15 = new JLabel("Mother Contact No");
        l15.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l15.setBounds(800, 430, 150, 30);
        JTextField t8;
        t8 = new JTextField();
        t8.setBounds(1050, 430, 250, 25);

        // ******************************************************************

        JLabel l16, l17;
        l16 = new JLabel("Other  Details");
        l16.setFont(new Font("ROG Fonts", Font.PLAIN, 16));
        l16.setBounds(80, 470, 450, 70);
        l17 = new JLabel("________________________________________");
        l17.setBounds(80, 475, 450, 70);

        JLabel l18;
        l18 = new JLabel("Mobile Number * ");
        l18.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l18.setBounds(150, 540, 150, 30);
        JTextField t9;
        t9 = new JTextField();
        t9.setBounds(400, 540, 250, 25);

        JLabel l19;
        l19 = new JLabel("Email Address *");
        l19.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l19.setBounds(800, 540, 150, 30);
        JTextField t10;
        t10 = new JTextField();
        t10.setBounds(1050, 540, 250, 25);

        JLabel l20;
        l20 = new JLabel("City");
        l20.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l20.setBounds(150, 590, 150, 30);
        JTextField t11;
        t11 = new JTextField();
        t11.setBounds(400, 590, 250, 25);

        JLabel l21;
        l21 = new JLabel("State");
        l21.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l21.setBounds(800, 590, 150, 30);
        JTextField t12;
        t12 = new JTextField();
        t12.setBounds(1050, 590, 250, 25);

        JLabel l22;
        l22 = new JLabel("Country");
        l22.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l22.setBounds(150, 640, 150, 30);
        JTextField t13;
        t13 = new JTextField();
        t13.setBounds(400, 640, 250, 25);

        JLabel l23;
        l23 = new JLabel("Postal Code");
        l23.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l23.setBounds(800, 640, 150, 30);
        JTextField t14;
        t14 = new JTextField();
        t14.setBounds(1050, 640, 250, 25);

        JLabel l24;
        l24 = new JLabel("Full Address");
        l24.setFont(new Font("Times new Roman", Font.PLAIN, 16));
        l24.setBounds(150, 690, 150, 30);
        JTextArea area = new JTextArea();
        area.setBounds(400, 690, 250, 60);

        JButton b = new JButton("Submit");
        b.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        b.setBounds(1180, 700, 120, 30);

        String[] columns = { "First Name", "Last Name", "", "Date of Birth", "Gender", "Father Name",
                "Father Profession", "Mother Name", "Mother Profession", "Father Contact No", "Mother Contact No",
                "Mobile No", "Email Address", "City", "State", "Country", "Postal Code", "Full Address" };
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("details.txt", true))) {
                        FileWriter w = new FileWriter("details.txt", true);
                        String s1 = t1.getText();
                        String s2 = t2.getText();
                        String s3 = cb1.getSelectedItem() + "/" + cb2.getSelectedItem() + "/" + cb3.getSelectedItem()
                                + "";
                        String s4 = r1.isSelected() ? "Male" : "";
                        String s5 = r2.isSelected() ? "Female" : "";
                        String s6 = r3.isSelected() ? "Other" : "";
                        String s7 = t3.getText();
                        String s8 = t4.getText();
                        String s9 = t5.getText();
                        String s10 = t6.getText();
                        String s11 = t7.getText();
                        String s12 = t8.getText();
                        String s13 = t9.getText();
                        String s14 = t10.getText();
                        String s15 = t11.getText();
                        String s16 = t12.getText();
                        String s17 = t13.getText();
                        String s18 = t14.getText();

                        String s19 = area.getText();

                        writer.write(String.format(
                                "%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n",
                                s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19));
                        w.close();
                        tableModel.addRow(new Object[] { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14,
                                s15, s16, s17, s18, s19 });

                        t1.setText("");
                        t2.setText("");

                        cb1.setSelectedIndex(0);
                        cb2.setSelectedIndex(0);
                        cb3.setSelectedIndex(0);

                        r1.isSelected();
                        r2.isSelected();
                        r3.isSelected();

                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        t7.setText("");
                        t8.setText("");
                        t9.setText("");
                        t10.setText("");
                        t11.setText("");
                        t12.setText("");
                        t13.setText("");
                        t14.setText("");

                        area.setText("");

                        JOptionPane.showMessageDialog(f, "Successfully Saved The Details");
                    } catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
            }

        });

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(l15);
        f.add(l16);
        f.add(l17);
        f.add(l18);
        f.add(l19);
        f.add(l20);
        f.add(l21);
        f.add(l22);
        f.add(l23);
        f.add(l24);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(t9);
        f.add(t10);
        f.add(t11);
        f.add(t12);
        f.add(t13);
        f.add(t14);

        f.add(area);

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        f.add(r1);
        f.add(r2);
        f.add(r3);

        f.add(b);

        f.setSize(1530, 800);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void display_records() {
        JFrame displayFrame = new JFrame("Display Records");

        String[] columns = { "First Name", "Last Name", "Date of Birth", "Gender", "Father Name", "Father Profession",
                "Mother Name", "Mother Profession", "Father Contact No", "Mother Contact No", "Mobile No",
                "Email Address", "City", "State", "Country", "Postal Code", "Full Address" };
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        try (BufferedReader reader = new BufferedReader(new FileReader("details.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\s+");

                tableModel.addRow(fields);
            }

            JTable table = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

            displayFrame.add(scrollPane);
            displayFrame.setSize(1530, 800);
            displayFrame.setLocationRelativeTo(null);
            displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            displayFrame.setVisible(true);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public static void search_records() {
        JFrame searchFrame = new JFrame("Search Records");

        JLabel searchLabel = new JLabel("Enter Mobile No  :");
        searchLabel.setFont(new Font("ROG Fonts", Font.PLAIN, 20));
        searchLabel.setBounds(50, 50, 300, 30);

        JTextField searchField = new JTextField();
        searchField.setBounds(400, 50, 200, 30);

        JButton searchButton = new JButton("Search");
        searchButton.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
        searchButton.setBounds(600, 50, 150, 30);

        String[] columns = { "First Name", "Last Name", "Date of Birth", "Gender", "Father Name", "Father Profession",
                "Mother Name", "Mother Profession", "Father Contact No", "Mother Contact No", "Mobile No",
                "Email Address", "City", "State", "Country", "Postal Code", "Full Address" };
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchValue = searchField.getText();
                tableModel.setRowCount(0);
                search_records_from_file(searchValue, tableModel);

                // search_records_from_file(searchValue, tableModel);
            }
        });

        searchFrame.add(searchLabel);
        searchFrame.add(searchField);
        searchFrame.add(searchButton);
        searchFrame.add(scrollPane);

        searchFrame.setSize(1530, 800);
        searchFrame.setLayout(null);
        searchFrame.setLocationRelativeTo(null);
        searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        searchFrame.setVisible(true);
    }

    public static void search_records_from_file(String searchValue, DefaultTableModel tableModel) {
        try (BufferedReader reader = new BufferedReader(new FileReader("details.txt"))) {
            tableModel.setRowCount(0); // Clear the existing table

            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\s+");
                for (String field : fields) {
                    if (field.equalsIgnoreCase(searchValue)) {
                        tableModel.addRow(fields);
                        break; // Break after adding the row to avoid duplicate entries
                    }
                }
            }
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    // Background image
    static class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        //menu();
        login_page();

    }

}