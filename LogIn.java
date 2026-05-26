import javax.swing.JOptionPane;

public class LogIn{
    
    private String emailLogin, passwordLogin;
    
    //constructor
    public LogIn(){
        emailLogin = null;
        passwordLogin = null;
    }
    
    public LogIn(String e, String p){
        emailLogin = e;
        passwordLogin = p;
    }
    
    
    
    //mutator
    public void setEmail(String e){
        emailLogin = e;
    }
    public void setPassword(String p){
        passwordLogin = p;
    }
    public void setSignUp(String e, String p){
        emailLogin = e;
        passwordLogin = p;
    }
    public void setLogIn(String e, String p){
        emailLogin = e;
        passwordLogin = p;
    }
    
    
    //accessor
    public String getEmail(){
        return emailLogin;
    }
    public String getPassword(){
        return passwordLogin;
    }
    
    
    //verify login method
    boolean success = false;
    public boolean verifyLogin(String e, String p){
        
         if(emailLogin.equals(e) && passwordLogin.equals(p)){
                    JOptionPane.showMessageDialog(null, "Login Successfull", "Log in", JOptionPane.INFORMATION_MESSAGE);
                    success = true;
         }else{
                    JOptionPane.showMessageDialog(null, "Login Unsuccessfull", "Log in", JOptionPane.ERROR_MESSAGE);
                    success = false;
         }
         
         return success;
    }
}