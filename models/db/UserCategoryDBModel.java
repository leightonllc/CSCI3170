package models.db;

import java.sql.*;

public class UserCategoryDBModel {
    private int ucid;
    private int max;
    private int period;

    public UserCategoryDBModel(int ucid, int max, int period) {
        this.ucid = ucid;
        this.max = max;
        this.period = period;
    }

    public void insertToDatabase(Connection conn) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO usercategory (ucid, max, period) VALUES (?, ?, ?)");
            stmt.setInt(1, ucid);
            stmt.setInt(2, max);
            stmt.setInt(3, period);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("[Error] " + e);
        }
    }
}