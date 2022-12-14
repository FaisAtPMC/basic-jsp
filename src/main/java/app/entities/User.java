package app.entities;

public class User {
    private String username;
    private String password;
    
    public User() {
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
     @Override
     public boolean equals(Object obj) {
         if(this == obj) return true;
         if(obj == null || getClass() != obj.getClass()) return false;
         User user = (User)obj;
         if (username != null ? !username.equals(user.username) : user.username != null) return false;
         return password != null ? password.equals(user.password) : user.password == null; 
     }
     
     @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
