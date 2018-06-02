package fr.isep.sujetMng.ihm;

import fr.isep.sujetMng.Database;
import fr.isep.sujetMng.core.teacher.ListSubjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class MainFrame extends JFrame {
    private Database database;

    public MainFrame(Database database){
        this.database = database;
        //---------------Main frame configuration--------------
        this.setSize(800,600);
        this.setResizable(false);
        this.setTitle("Sujets Management");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        indexIHM();

        //--------------display frame------------------
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void indexIHM(){
        JPanel indexPanel = new JPanel();
        indexPanel.setLayout(null);
        JLabel indexLabel = new JLabel("Je suis:");
        JButton teacherButton = new JButton("Teacher");
        JButton studentButton = new JButton("Student");
        //--------------IndexIHM Panel---------------------------
        indexLabel.setBounds(360, 150, 200, 100);
        indexPanel.add(indexLabel);

        //************Teacher button settings----------------
        teacherButton.setBounds(230, 300, 100, 50);
        teacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teacherIHM();
            }
        });
        indexPanel.add(teacherButton);

        //************Teacher button settings----------------
        studentButton.setBounds(450, 300, 100, 50);
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentIHM();
            }
        });
        indexPanel.add(studentButton);

        this.setContentPane(indexPanel);
    }

    public void teacherIHM(){
        this.getContentPane().removeAll();
        this.revalidate();
        this.repaint();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        /*TODO add a HOME logo
        behavior : when action -> go to indexIHM
        */

        /*TODO add a button : Créer une nouvelle liste
        behavior : when action -> call createList() method
         */


        //TODO add a scroll bar for listsPanel
        JPanel listsPanel = new JPanel();
        listsPanel.setLayout(null);
        listsPanel.setBounds(50,125,500,400);
        //-----------------Radio group : lists----------------
        ButtonGroup buttonGroup = new ButtonGroup();
        for (Map.Entry<String, ListSubjects> entry: database.getListSubjectsTreeMap().entrySet()
             ) {
            JRadioButton radioButton = new JRadioButton(entry.getKey());
            buttonGroup.add(radioButton);
            listsPanel.add(radioButton);
            /*TODO action on radioButton
            call  subjectsIHM method with the selected listSubjects (entry.getValue())  as parameter
             */
        }

        mainPanel.add(listsPanel);
        this.setContentPane(mainPanel);
        this.setVisible(true);
    }

    public void createList(){
        this.getContentPane().removeAll();
        this.revalidate();
        this.repaint();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        /*TODO create a JPanel as container
            behavior :
            given :
            -create text field for collecting the name of the new list
            -set a submit button
            -set a cancel button
            when :
            -action on submit -> call create method of ListSubjectsService with name as parameter, then teacherIHM method (go back to previous view)
            -action on cancel -> call teacherIHM method
         */


        this.setContentPane(mainPanel);
        this.setVisible(true);
    }

    public void subjectsIHM(ListSubjects selectedListSubjects){
        this.getContentPane().removeAll();
        this.revalidate();
        this.repaint();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        //TODO create go back button -> to teacherIHM
        /*TODO create a JPanel as container
            Display list of subjects for the selected ListSubjects
         */
        //TODO create a button : Modifier la liste
        //action : call modifyListIHM with selectedListSubjects as parameter

        //TODO create a button : Visualiser les résultats
        //action : call displayResultIHM with selectedListSubjects as parameter


        this.setContentPane(mainPanel);
        this.setVisible(true);
    }

    public void modifyListIHM(){
        //TODO configure Frame

        //TODO go back button - > to subjectsIHM

        //TODO Create form for collecting subject name and subject description
        //action on submit -> call addSubjects method of ListSubjectsService with as parameters a list of subjects collected and the selectedListSubjects
        //then go back to subjectsIHM

        //TODO create a button : Supprimer un sujet
        //use method deleteSubject(ListSubjects selectedListSubjects, Subject subjectSelectedToDrop) of ListSubjectsService
    }

    public void displayResultIHM(ListSubjects selectedListSubjects){
        //TODO configure Frame

        // TODO create go back button - > to subjectsIHM(

        //TODO display for each subject of the selectedListSubjects the lists of
        // List<Student> listStudentFirstChoice: with getListStudentFirstChoice()
        // List<Student> listStudentSecondChoice; with getListStudentSecondChoice()
        //Bonus : display the length of each List

    }

    public void studentIHM(){
        //TODO configure Frame

        //TODO Create home button -> to indexIHM
        /*TODO create a form with
        -text field for collecting nom et prénom
        -List for Voeux 1 : display name for each Subject, bonus : length of listStudentFirstChoice and length listStudentSecondChoice of each subject
        -List for Voeux 2 : same excluding subject selected in Voeux 1
         */
        //TODO create button :Terminer
        //call add(Student inputStudent) method of StudentService class
    }
}
