package fr.isep.sujetMng.ihm.teacher;

import fr.isep.sujetMng.Database;
import fr.isep.sujetMng.core.teacher.ListSubjects;
import fr.isep.sujetMng.core.teacher.Subject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

public class TeacherListsIHM {

    public static void show(Database database, JPanel mainPanel){
        mainPanel.removeAll();

        ButtonGroup buttonGroup = new ButtonGroup();
        for (Map.Entry<String, ListSubjects> entry: database.getListSubjectsTreeMap().entrySet()
             ) {
            JRadioButton radioButton = new JRadioButton(entry.getKey());
            buttonGroup.add(radioButton);
            mainPanel.add(radioButton);
        }

        mainPanel.repaint();
    }
}
