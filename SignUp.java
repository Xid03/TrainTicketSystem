
public class SignUp{
    private String email, password;
    
    
    //constructor
    public SignUp(){
        email = null;
        password = null;
    }
    
    public SignUp(String e, String p){
        email = e;
        password = p;
    }
    
    
    //mutator
    public void setEmail(String e){
        email = e;
    }
    public void setPassword(String p){
        password = p;
    }
    public void setSignUp(String e, String p){
        email = e;
        password = p;
    }
    
    //accessor
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    
    
    //toString method
    public String toString(){
        return("\n" + "Email: " + email + "Password: " + password);
    }
    
    
}