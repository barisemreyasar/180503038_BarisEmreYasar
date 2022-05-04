package com.company;

import java.sql.*;
import java.util.ArrayList;

public class DBImporter {
    static String jdbcURL = "jdbc:mysql://localhost:3306/202projekt";
    static String username = "root";
    static String password = "password";
    Connection con;

    PreparedStatement pst;

    ResultSet rs;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, username, password);
    }

    public void ShowError(SQLException exception) {
        System.out.printf("Error: " + exception.getMessage());
        System.out.printf("Error Code: " + exception.getErrorCode());
    }

    public User getUserObjekt(String uname, String pass) {
        if (uname.equals("") || pass.equals("")) {
            return null;
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = this.getConnection();
                pst = con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
                pst.setString(1, uname);
                pst.setString(2, pass);
                rs = pst.executeQuery();
                if (rs.next()) {
                    return new User(uname, pass);
                } else {
                    return null;
                }
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Besitzer getPatientObject(int id) {
        if (id == 0) {
            return null;
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = this.getConnection();
                pst = con.prepareStatement("SELECT * FROM besitzer WHERE id=?");
                pst.setInt(1, id);
                rs = pst.executeQuery();
                if (rs.next()) {
                    return new Besitzer(id, rs.getString(2), rs.getString(3), rs.getString(4));
                } else {
                    return null;
                }
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public ArrayList<Besitzer> getPatienten(){
        ArrayList<Besitzer> patienten = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = this.getConnection();
            pst = con.prepareStatement("SELECT * FROM besitzer");
            rs = pst.executeQuery();
            while (rs.next()){
                Besitzer patient = new Besitzer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                patienten.add(patient);
            }
            return patienten;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int addTiere(int id, String name,String nname,String tn,int cn){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = this.getConnection();
            pst = con.prepareStatement("SELECT COUNT(*) FROM besitzer WHERE id=?");
            pst.setInt(1,id);
            rs = pst.executeQuery();
            rs.next();
            if (rs.getInt(1) != 0){
                return -1;
            } else {
                pst = con.prepareStatement("INSERT INTO besitzer VALUES (?,?,?,?,?)");
                pst.setInt(1,id);
                pst.setString(2,name);
                pst.setString(3,nname);
                pst.setString(4,tn);
                pst.setInt(5,cn);
                pst.executeUpdate();
                return 0;
            }
        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
}
