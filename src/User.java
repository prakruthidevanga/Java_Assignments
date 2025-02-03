public class User
{
    public String Username;
    private String password;
    public void SetPassword(String pw)
    {
        this.password = pw;
    }
    public String GetPassword(){
        return password;
    }
    //overriding default ctor
    public User(String username)
    {
        this.Username = username;
    }
}

