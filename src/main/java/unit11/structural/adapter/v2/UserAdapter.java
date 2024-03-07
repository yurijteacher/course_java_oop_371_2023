package unit11.structural.adapter.v2;

public class UserAdapter extends Users implements UserDetails{
    @Override
    public String setUsername() {
        return getUser();
    }

    @Override
    public String setPassword() {
        return getPass();
    }
}
