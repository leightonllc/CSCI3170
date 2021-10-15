package models.file;

import java.sql.Connection;

import models.db.BookCategoryDBModel;

public class BookCategoryFileModel implements FileModelInterface{
    private int bookcategoryID;
    private String bookcatname;

    public void parseFromLine(String inputLine) {
        String[] splitted = inputLine.split("\t");
        this.bookcategoryID = Integer.parseInt(splitted[0]);
        this.bookcatname = splitted[1];
    }

    public void saveToDatabase(Connection conn) {
        BookCategoryDBModel bookcategory = new BookCategoryDBModel(bookcategoryID, bookcatname);
        bookcategory.insertToDatabase(conn);
    }
}