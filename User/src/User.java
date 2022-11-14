public class User{
    private int id;
    private String username;
    private User userType;
    private String password;
    private String email;
    private String phoneNumber;

    public boolean deleteUser(int id, String token) {
        return true;
    }

    public boolean createUser(String username, User userType, String password, String email,String phoneNumber) {
        return true;
    }

    public boolean updateUser(int id, String username, User userType, String password, String email,String phoneNumber) {
        return true;
    }

    public User(int id, String username, User userType, String password, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.userType = userType;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUserType() {
        return userType;
    }

    public void setUserType(User userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}