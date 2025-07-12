import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Form {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("IIT Football League Registration");
        myFrame.setSize(600, 650);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set icon and background
        ImageIcon image = new ImageIcon("logo.png");
        myFrame.setIconImage(image.getImage());
        myFrame.getContentPane().setBackground(new Color(145, 218, 232));

        // Name
        JLabel nameLabel = new JLabel("Player's Name:");
        nameLabel.setBounds(30, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 250, 25);
        myFrame.add(nameLabel);
        myFrame.add(nameField);

        // Phone
        JLabel phnLabel = new JLabel("Mobile:");
        phnLabel.setBounds(30, 60, 100, 25);
        JTextField phnField = new JTextField();
        phnField.setBounds(150, 60, 250, 25);
        myFrame.add(phnLabel);
        myFrame.add(phnField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 100, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 250, 25);
        myFrame.add(emailLabel);
        myFrame.add(emailField);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 140, 100, 25);
        JTextField addressField = new JTextField();
        addressField.setBounds(150, 140, 250, 25);
        myFrame.add(addressLabel);
        myFrame.add(addressField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 180, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 180, 70, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 180, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        myFrame.add(genderLabel);
        myFrame.add(male);
        myFrame.add(female);

        // Degree
        JLabel degreeLabel = new JLabel("Degree:");
        degreeLabel.setBounds(30, 220, 100, 25);
        String[] degrees = {"BSSE", "MSSE", "Alumni"};
        JComboBox<String> degreeBox = new JComboBox<>(degrees);
        degreeBox.setBounds(150, 220, 250, 25);
        myFrame.add(degreeLabel);
        myFrame.add(degreeBox);

        // Date of Birth
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(30, 260, 100, 25);
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = new String[50];
        for (int i = 0; i < 50; i++) years[i] = String.valueOf(2025 - i);
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(150, 260, 50, 25);
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(210, 260, 70, 25);
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(290, 260, 70, 25);
        myFrame.add(dobLabel);
        myFrame.add(dayBox);
        myFrame.add(monthBox);
        myFrame.add(yearBox);

        // Position
        JLabel positionLabel = new JLabel("Preferred Position:");
        positionLabel.setBounds(30, 300, 120, 25);
        String[] positions = {"Goalkeeper", "Defender", "Midfielder", "Forward"};
        JComboBox<String> positionBox = new JComboBox<>(positions);
        positionBox.setBounds(150, 300, 250, 25);
        myFrame.add(positionLabel);
        myFrame.add(positionBox);

        // Departmental competition radio
        JLabel radioLabel = new JLabel("Played in Inter-Dept. Match?");
        radioLabel.setBounds(30, 340, 200, 25);
        JRadioButton yesBtn = new JRadioButton("Yes");
        yesBtn.setBounds(210, 340, 60, 25);
        JRadioButton noBtn = new JRadioButton("No");
        noBtn.setBounds(280, 340, 60, 25);
        ButtonGroup group = new ButtonGroup();
        group.add(yesBtn);
        group.add(noBtn);
        myFrame.add(radioLabel);
        myFrame.add(yesBtn);
        myFrame.add(noBtn);

        //Experience
        JLabel expLabel = new JLabel("Experience(in years/months):");
        expLabel.setBounds(30, 380, 190, 25);
        JTextField expField = new JTextField();
        expField.setBounds(200, 380, 250, 25);
        myFrame.add(expLabel);
        myFrame.add(expField);

        //Played for any club or team
        JLabel clubLabel = new JLabel("Played for any club/team?");
        clubLabel.setBounds(30, 420, 200, 25);
        JRadioButton clubyes = new JRadioButton("Yes");
        clubyes.setBounds(210, 420, 60, 25);
        JRadioButton clubno = new JRadioButton("No");
        clubno.setBounds(280, 420, 60, 25);
        ButtonGroup clubgroup = new ButtonGroup();
        clubgroup.add(clubyes);
        clubgroup.add(clubno);
        myFrame.add(clubLabel);
        myFrame.add(clubyes);
        myFrame.add(clubno);

        // Skills (Checkbox)
        JLabel skillLabel = new JLabel("Skills:");
        skillLabel.setBounds(30, 460, 100, 25);
        JCheckBox passingBox = new JCheckBox("Passing");
        passingBox.setBounds(150, 460, 100, 25);
        JCheckBox shootingBox = new JCheckBox("Shooting");
        shootingBox.setBounds(250, 460, 100, 25);
        JCheckBox dribblingBox = new JCheckBox("Dribbling");
        dribblingBox.setBounds(350, 460, 100, 25);
        myFrame.add(skillLabel);
        myFrame.add(passingBox);
        myFrame.add(shootingBox);
        myFrame.add(dribblingBox);

        // File upload
        JLabel fileLabel = new JLabel("Profile Photo:");
        fileLabel.setBounds(30, 500, 100, 25);
        JButton fileButton = new JButton("Choose File");
        fileButton.setBounds(150, 500, 120, 25);
        JLabel filePathLabel = new JLabel();
        filePathLabel.setBounds(280, 500, 180, 25);
        myFrame.add(fileLabel);
        myFrame.add(fileButton);
        myFrame.add(filePathLabel);

        final String[] selectedFilePath = {""};
        fileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(myFrame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                selectedFilePath[0] = file.getAbsolutePath();
                filePathLabel.setText(file.getName());
            }
        });

        // Register Button
        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(180, 550, 120, 30);
        myFrame.add(registerBtn);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phnField.getText();
            String email = emailField.getText();
            String address = addressField.getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
            String degree = (String) degreeBox.getSelectedItem();
            String dob = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
            String position = (String) positionBox.getSelectedItem();
            String deptMatch = yesBtn.isSelected() ? "Yes" : (noBtn.isSelected() ? "No" : "");
            String experience = expField.getText();
            String club = clubyes.isSelected() ? "Yes" : (clubno.isSelected() ? "No" : "");
            String skills = "";
            if (passingBox.isSelected()) skills += "Passing ";
            if (shootingBox.isSelected()) skills += "Shooting ";
            if (dribblingBox.isSelected()) skills += "Dribbling ";

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || address.isEmpty() || experience.isEmpty() || gender.equals("") || deptMatch.equals("") || club.equals("")) {
                JOptionPane.showMessageDialog(myFrame, "Please fill all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(myFrame,
                        "Registered Successfully!\n\n" +
                                "Name: " + name +
                                "\nPhone: " + phone +
                                "\nEmail: " + email +
                                "\nAddress: " + address +
                                "\nGender: " + gender +
                                "\nDegree: " + degree +
                                "\nDOB: " + dob +
                                "\nPosition: " + position +
                                "\nDept Match: " + deptMatch +
                                "\nExperience: " + experience +
                                "\nClub/Team: " + club +
                                "\nSkills: " + (skills.isEmpty() ? "None" : skills) +
                                "\nPhoto: " + (selectedFilePath[0].isEmpty() ? "Not uploaded" : filePathLabel.getText()),
                        "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        myFrame.setVisible(true);
    }
}
