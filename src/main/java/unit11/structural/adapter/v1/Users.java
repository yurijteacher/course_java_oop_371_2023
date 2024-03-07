package unit11.structural.adapter.v1;

public class Users implements UserDetails{

    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String setUsername() {
        return user;
    }

    @Override
    public String setPassword() {
        return pass;
    }
}
