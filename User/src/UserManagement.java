import java.sql.SQLException;

public class UserManagement {


    private Database db;

    public UserManagement() {
        this.db = new Database("data.db");
        this.db.createTableIfNotExists();
    }


    public boolean deleteUser(Integer id, Integer operatorId, UserType operatorRole) {   //token is the id of the operator
        try {
            if (operatorId.equals(id) || operatorRole == UserType.Admin) {
                this.db.deleteUser(id);
            }else {
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean createUser(String username, UserType userType, String password, String email,String phoneNumber) {
        try {
            if (this.db.checkIfUserExist(username) || this.db.checkIfEmailExist(email)){
                return false;
            } else {
                this.db.insertIntoTable(username, userType, password, email, phoneNumber);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateUser(Integer id, String username, String password, String email,String phoneNumber) {
        try {
            this.db.updateUser(id, username, password, email, phoneNumber);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean suspendUser(Integer id, UserType operatorRole) {
        if (operatorRole == UserType.Admin) {
            try {
                this.db.suspendUser(id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                return false;
            }
            return true;
        }
        return false;
    }
}