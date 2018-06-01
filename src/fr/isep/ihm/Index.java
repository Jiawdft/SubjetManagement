package fr.isep.ihm;

import fr.isep.Database;

import javax.swing.*;
import java.awt.*;

public class Index extends JFrame {

    private JPanel indexPanel = new JPanel();
    private JLabel indexLabel = new JLabel("Je suis:");
    JButton teacherButton = new JButton("Teacher");
    JButton studentButton = new JButton("Student");

    public Index(Database database){

        //Frame : select role
        //---------------Main frame configuration--------------
        this.setSize(1200,800);
        this.setResizable(false);
        this.setTitle("Sujets Management");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //--------------Index Panel---------------------------
        indexLabel.setBounds(570,250,200,100);
        indexPanel.add(indexLabel);
        indexPanel.setLayout(null);

        //************Teacher button settings----------------
        teacherButton.setBounds(400,400,100,50);
        indexPanel.add(teacherButton);

        //************Teacher button settings----------------
        studentButton.setBounds(700,400,100,50);
        indexPanel.add(studentButton);



        //--------------display frame------------------
        this.setContentPane(indexPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
