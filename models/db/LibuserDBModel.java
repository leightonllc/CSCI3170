package models.db;

import java.sql.*;

public class LibuserDBModel {
    private String libuid;
    private String name;
    private String address;
    private int age;
    private int ucid;

    public LibuserDBModel(String libuid, String name, int age, String address, int ucid) {
        this.libuid = libuid;
        this.name = name;
        this.age = age;
        this.address = address;
        this.ucid = ucid;
    }

    public void insertToDatabase(Connection conn) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO libuser (libuid, name, age, address, ucid) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, libuid);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.setString(4, address);
            stmt.setInt(5, ucid);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("[Error] " + e);
        }
    }
}