package fr.isep.core.teacher;

import java.util.TreeMap;

public class ListSubjects {
    private TreeMap<String, Subject> subjectTreeMap;

    public ListSubjects() {
    }

    public ListSubjects(TreeMap<String, Subject> subjectTreeMap) {
        this.subjectTreeMap = subjectTreeMap;
    }

    public TreeMap<String, Subject> getSubjectTreeMap() {
        return subjectTreeMap;
    }

    public void setSubjectTreeMap(TreeMap<String, Subject> subjectTreeMap) {
        this.subjectTreeMap = subjectTreeMap;
    }
}
