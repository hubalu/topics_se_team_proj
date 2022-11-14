import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class Database {
    private Connection conn;

    public Database(String database_path) {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:./lib/" + database_path);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createTableIfNotExists() {
        //TODO 4. Use the sqlite connection to create a new table named with the coin_name
        //only if it doesn't already exist.
        //This table should have three columns: a integer primary key, a timestamp, and a price.
        //This timestamp can be insertion time and doesn't have to be the actual fetch time
        String sql = "CREATE TABLE IF NOT EXISTS User (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	username String NOT NULL,\n"
                + "	userType String NOT NULL,\n"
                + "	password String NOT NULL,\n"
                + "	email String NOT NULL,\n"
                + "	phoneNumber String NOT NULL,\n"
                + ");";
        try (Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertIntoTable(User user) {
        //TODO 5. Use the sqlite connection to insert a new record into the
        //the database.
        //The timestamp can be insertion time and doesn't have to be the actual
        //fetch time
        String sql = "INSERT INTO User (username,userType,password,email,phoneNumber) VALUES(?,?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getUserType().toString());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getPhoneNumber());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
