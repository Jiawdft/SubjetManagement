package fr.isep.sujetMng.core.student;

import fr.isep.sujetMng.core.teacher.Subject;

public class Student {
    private String name;
    private String prenom;
    private Subject firstChoice;
    private Subject secondChoice;

    public Student() {
    }

    public Student(String name, String prenom, Subject firstChoice, Subject secondChoice) {
        this.name = name;
        this.prenom = prenom;
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Subject getFirstChoice() {
        return firstChoice;
    }

    public void setFirstChoice(Subject firstChoice) {
        this.firstChoice = firstChoice;
    }

    public Subject getSecondChoice() {
        return secondChoice;
    }

    public void setSecondChoice(Subject secondChoice) {
        this.secondChoice = secondChoice;
    }
}
