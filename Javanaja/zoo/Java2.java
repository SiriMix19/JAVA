package zoo;

import java.sql.*;
import java.util.Scanner;

public class Java2 {
    public void insertData(String id, String bleed, String name, String birthdate, float weight) {

        // String str="2015-03-31";
        Date bdate = Date.valueOf(birthdate);
        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/petfarm";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String sql = " insert into petfarm (id, bleed, name, birthdate, weight)"
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, bleed);
            ps.setString(3, name);
            ps.setDate(4, bdate);
            // ps.setDate(4, new java.sql.Date(birthdate));
            ps.setFloat(5, weight);
            ps.execute();
            System.out.println("Insert finished.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void showData() {
        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/petfarm";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String sql = "SELECT * FROM petfarm";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Id        : " + rs.getString("id"));
                System.out.println("Bleed     : " + rs.getString("bleed"));
                System.out.println("Name      : " + rs.getString("name"));
                System.out.println("Birth Date: " + rs.getString("birthdate"));
                System.out.println("Weight    : " + String.valueOf(rs.getFloat("weight")));
            }
            System.out.println("End of data.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void updateName(String id, String newName) {

        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/petfarm";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String sql = "UPDATE petfarm SET name=?  WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setString(2, id);
            ps.execute();
            System.out.println("1 record updated.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void deleteData(String id) {

        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/petfarm";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            String sql = "DELETE FROM petfarm WHERE id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            System.out.println("1 record deleted.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please Choose number:");
        System.out.println("1. Insert data");
        System.out.println("2. Show data");
        System.out.println("3. Update name");
        System.out.println("4. Delete data");
        System.out.println("Other to exit...");
        System.out.println("");
        Scanner getData = new Scanner(System.in);
        int ch = Integer.parseInt(getData.nextLine());

        Java2 app = new Java2();
        switch (ch) {
            case 1:
                String id = "100010";
                String bleed = "Lsbardor";
                String name = "XInGua";
                String birthdate = "2022-11-25";
                float weight = 1.5f;
                app.insertData(id, bleed, name, birthdate, weight);
                break;
            case 2:
                app.showData();
                break;
            case 3:
                id = "10017";
                String newname = "Fackandy";
                app.updateName(id, newname);
                break;
            case 4:
                id = "2545";
                app.deleteData(id);
            default: {
            }
        }
    }
}