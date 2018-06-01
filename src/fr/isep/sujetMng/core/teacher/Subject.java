package fr.isep.sujetMng.core.teacher;

import fr.isep.sujetMng.core.student.Student;

import java.util.List;

public class Subject {
    private String name;
    private String description;
    private List<Student> listStudentFirstChoice;
    private List<Student> listStudentSecondChoice;

    public Subject() {
    }

    public Subject(String name, String description, List<Student> listStudentFirstChoice, List<Student> listStudentSecondChoice) {
        this.name = name;
        this.description = description;
        this.listStudentFirstChoice = listStudentFirstChoice;
        this.listStudentSecondChoice = listStudentSecondChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getListStudentFirstChoice() {
        return listStudentFirstChoice;
    }

    public void setListStudentFirstChoice(List<Student> listStudentFirstChoice) {
        this.listStudentFirstChoice = listStudentFirstChoice;
    }

    public List<Student> getListStudentSecondChoice() {
        return listStudentSecondChoice;
    }

    public void setListStudentSecondChoice(List<Student> listStudentSecondChoice) {
        this.listStudentSecondChoice = listStudentSecondChoice;
    }
}
