package fr.isep.sujetMng;

import fr.isep.sujetMng.ihm.MainFrame;

public class SujetManagementApplication {
    public static void main(String[] args) {
        //----------Mock data base-------------
        Database database = new Database();

        //----------Run application------------
        MainFrame run = new MainFrame(database);
    }
}
