package fr.isep.sujetMng.core.teacher;

import java.util.TreeMap;

public class ListSubjects {
    private String name;
    private TreeMap<String, Subject> subjectTreeMap;

    public ListSubjects() {
        name = new String();
        subjectTreeMap = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeMap<String, Subject> getSubjectTreeMap() {
        return subjectTreeMap;
    }

    public void setSubjectTreeMap(TreeMap<String, Subject> subjectTreeMap) {
        this.subjectTreeMap = subjectTreeMap;
    }
}
