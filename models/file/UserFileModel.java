package models.file;

import java.sql.Connection;

import models.db.LibuserDBModel;

public class UserFileModel implements FileModelInterface{
    private String userID;
    private String name;
    private int age;
    private String address;
    private int categoryID;

    public void parseFromLine(String inputLine) {
        String[] splitted = inputLine.split("\t");
        this.userID = splitted[0];
        this.name = splitted[1];
        this.age = Integer.parseInt(splitted[2]);
        this.address = splitted[3];
        this.categoryID = Integer.parseInt(splitted[4]);
    }

    public void saveToDatabase(Connection conn) {
        LibuserDBModel user = new LibuserDBModel(userID, name, age, address, categoryID);
        user.insertToDatabase(conn);
    }
}