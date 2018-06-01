package fr.isep.sujetMng;

import fr.isep.sujetMng.core.student.Student;
import fr.isep.sujetMng.core.teacher.ListSubjects;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Database {
    private TreeMap<String, ListSubjects> listSubjectsTreeMap;
    private List<Student> listStudents;

    public Database() {
        this.listSubjectsTreeMap = new TreeMap<>();
        this.listStudents = new ArrayList<>();
    }

    public TreeMap<String, ListSubjects> getListSubjectsTreeMap() {
        return listSubjectsTreeMap;
    }

    public void setListSubjectsTreeMap(TreeMap<String, ListSubjects> listSubjectsTreeMap) {
        this.listSubjectsTreeMap = listSubjectsTreeMap;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
}
