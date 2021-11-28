package models.db;

import java.sql.*;
import java.util.Calendar;

public class BookDBModel {
    private String callnum;
    private String title;
    private Calendar publish;
    private Float rating;
    private int tborrowed;
    private int bcid;

    public BookDBModel(String callnum, String title, Calendar publish, Float rating, int tborrowed, int bcid) {
        this.callnum = callnum;
        this.title = title;
        this.publish = publish;
        this.rating = rating;
        this.tborrowed = tborrowed;
        this.bcid = bcid;
    }

    public void insertToDatabase(Connection conn) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT IGNORE INTO book (callnum, title, publish, rating, tborrowed, bcid) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, callnum);
            stmt.setString(2, title);
            stmt.setDate(3, new Date(publish.getTimeInMillis()));
            if (rating == null){
                stmt.setNull(4, Types.FLOAT);
            } else {
                stmt.setFloat(4, rating);
            }
            stmt.setInt(5, tborrowed);
            stmt.setInt(6, bcid);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("[Error] " + e);
        }
    }
}