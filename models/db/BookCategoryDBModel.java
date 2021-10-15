package models.db;

import java.sql.*;

public class BookCategoryDBModel {
    private int bcid;
    private String bcname;

    public BookCategoryDBModel(int bcid, String bcname) {
        this.bcid = bcid;
        this.bcname = bcname;
    }

    public void insertToDatabase(Connection conn) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO bookcategory (bcid, bcname) VALUES (?, ?)");
            stmt.setInt(1, bcid);
            stmt.setString(2, bcname);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("[Error] " + e);
        }
    }
}