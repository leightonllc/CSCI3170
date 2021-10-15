package models.file;

import java.sql.Connection;

import models.db.UserCategoryDBModel;

public class UserCategoryFileModel implements FileModelInterface{
    private int usercategoryID;
    private int maxBooks;
    private int loanPeriod;

    public void parseFromLine(String inputLine) {
        String[] splitted = inputLine.split("\t");
        this.usercategoryID = Integer.parseInt(splitted[0]);
        this.maxBooks = Integer.parseInt(splitted[1]);
        this.loanPeriod = Integer.parseInt(splitted[2]);
    }

    public void saveToDatabase(Connection conn) {
        UserCategoryDBModel usercategory = new UserCategoryDBModel(usercategoryID, maxBooks, loanPeriod);
        usercategory.insertToDatabase(conn);
    }
}