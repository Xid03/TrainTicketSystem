
public class Admin{
    private String adminName; 
    private String adminUsername;
    private String adminPassword;
    
    //defeault constructor
    public Admin(){
        adminName = null;
        adminUsername = "admin123";
        adminPassword = "admin123";
    }
    
    //normal constructor
    public Admin(String an, String au, String ap){
        adminName = an;
        adminUsername = au;
        adminPassword = ap;
    }
    
    //mutator
    public void setAdminName(String an){
        adminName = an;
    }
    public void setAdminUsername(String au){
        adminUsername = au;
    }
    public void setAdminPassword(String ap){
        adminPassword = ap;
    }
    public void setAdmin(String an,String au, String ap){
        adminName = an;
        adminUsername = au;
        adminPassword = ap;
    }
    
    
    //accessor
    public String getAdminName(){
        return adminName;
    }
    public String getAdminUsername(){
        return adminUsername;
    }
    public String getAdminPassword(){
        return adminPassword;
    }
    
    //toString
    public String toString(){
        return("\nAdmin Name: " + adminName + "\nAdmin Username: " + adminUsername + "\nAdmin Password: " + adminPassword); 
    }
    
    
   
    
}