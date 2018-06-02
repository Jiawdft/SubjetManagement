package fr.isep.sujetMng.core.teacher;

import fr.isep.sujetMng.Database;

import java.util.List;
import java.util.TreeMap;

public class ListSubjectsService {
    private Database database;

    public ListSubjectsService(Database database) {
        this.database = database;
    }

    //method : add a  list of subjects in the listSubjectsTreeMap of database
    public void create(String name){
        ListSubjects listSubjects = new ListSubjects();
        listSubjects.setName(name);
        database.getListSubjectsTreeMap().put(name,listSubjects);
    }
    public void addSubjects(List<Subject> subjectList, ListSubjects selectedListSubjects){
        for (int i = 0; i < subjectList.size(); i++) {
            database.getListSubjectsTreeMap().get(selectedListSubjects.getName()).getSubjectTreeMap().put(subjectList.get(i).getName() ,subjectList.get(i));
        }
    }
    public void deleteSubject(ListSubjects selectedListSubjects, Subject subject){
        database.getListSubjectsTreeMap().get(selectedListSubjects.getName()).getSubjectTreeMap().remove(subject.getName());
    }
}
