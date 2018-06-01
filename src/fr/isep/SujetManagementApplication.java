package fr.isep;

import fr.isep.ihm.Index;

public class SujetManagementApplication {
    public static void main(String[] args) {
        //----------Mock data base-------------
        Database database = new Database();

        //----------Run application------------
        Index run = new Index(database);
    }
}
