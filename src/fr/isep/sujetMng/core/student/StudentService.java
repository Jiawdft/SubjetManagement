package fr.isep.sujetMng.core.student;

import fr.isep.sujetMng.Database;
import fr.isep.sujetMng.core.teacher.ListSubjects;

import javax.swing.*;
import java.util.Map;

public class StudentService {
    Database database = new Database();

    public StudentService(Database database) {
        this.database = database;
    }
    public void add(Student inputStudent){
        database.getListStudents().add(inputStudent);
        for (Map.Entry<String, ListSubjects> entry: database.getListSubjectsTreeMap().entrySet()
                ) {
            if (entry.getValue().getSubjectTreeMap().containsValue(inputStudent.getFirstChoice())){
                entry.getValue().getSubjectTreeMap().get(inputStudent.getFirstChoice().getName()).getListStudentFirstChoice().add(inputStudent);
            }
            if (entry.getValue().getSubjectTreeMap().containsValue(inputStudent.getSecondChoice())){
                entry.getValue().getSubjectTreeMap().get(inputStudent.getFirstChoice().getName()).getListStudentSecondChoice().add(inputStudent);
            }
        }

    }
}
