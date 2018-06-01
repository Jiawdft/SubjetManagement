package fr.isep.sujetMng.ihm;

import fr.isep.sujetMng.Database;
import fr.isep.sujetMng.ihm.teacher.TeacherListsIHM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame {

    private JPanel mainPanel = new JPanel();
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
        mainPanel.add(indexLabel);
        mainPanel.setLayout(null);

        //************Teacher button settings----------------
        teacherButton.setBounds(400,400,100,50);
        teacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherListsIHM.show(database, mainPanel);
            }
        });
        mainPanel.add(teacherButton);

        //************Teacher button settings----------------
        studentButton.setBounds(700,400,100,50);
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO student view
                System.out.println("Student view");
            }
        });
        mainPanel.add(studentButton);

        //--------------display frame------------------
        this.setContentPane(mainPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
