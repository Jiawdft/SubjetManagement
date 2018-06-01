package fr.isep.sujetMng;

import fr.isep.sujetMng.ihm.Index;

public class SujetManagementApplication {
    public static void main(String[] args) {
        //----------Mock data base-------------
        Database database = new Database();

        //----------Run application------------
        Index run = new Index(database);
    }
}
