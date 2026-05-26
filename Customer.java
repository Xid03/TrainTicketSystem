
public class Customer{
    private String customerName, customerId, phoneNumber, icNumber, feedback;
    private int age, rating;
    private char gender;
    
    //default constructor
    public Customer(){
        customerName = null;
        customerId = null;
        phoneNumber = null;
        icNumber = null;
        age = 0;
        gender = '-';
        feedback = null;
    }
    
    //normal cosntructor
    public Customer(String cn, String cid, String pn, String ic, int a, char g, String f, int rt){
        customerName = cn;
        customerId = cid;
        phoneNumber = pn;
        icNumber = ic;
        age = a;
        gender = g;
        feedback = f;
        rating  = rt;
    }
    
    
    
    //mutator
    public void setCustomerName(String cn){
        customerName = cn;
    }
    public void setCustomerId(String cid){
        customerId = cid;
    }
    public void setPhoneNumber(String pn){
        phoneNumber = pn;
    }
    public void setIcNumber(String ic){
        icNumber = ic;
    }
    public void setAge(int a){
        age = a;
    }
    public void setGender(char g){
        gender = g;
    }
    public void setFeedback(String f){
        feedback = f;
    }
    public void setRating(int rt){
        rating = rt;
    }
    public void setCustomer(String cn, String cid, String pn, String ic, int a, char g, String f, int rt){
        customerName = cn;
        customerId = cid;
        phoneNumber = pn;
        icNumber = ic;
        age = a;
        gender = g;
        feedback = f;
        rating  = rt;
    }
    
    
    //accessor
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerId(){
        return customerId;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getIcNumber(){
        return icNumber;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getFeedback(){
        return feedback;
    }
    public int getRating(){
        return rating;
    }
    
    
    
    //toString
    String genderName;
    public String toString(){
        
        if(gender == 'M' || gender == 'm'){
            genderName = "Male";
        }else if(gender == 'F' || gender == 'f'){
            genderName = "Female";
        }
        
        return("\nCustomer Name: " + customerName + "\nCustomer ID: " + customerId + "\nPhone Number: " + phoneNumber + 
        "\nIC Number: " + icNumber + "\nAge: " + age + "\nGender: " + genderName);
    }
    
    
    //deletecustomer method
    public void deleteCustomer(){
        customerName = null;
        customerId = null;
        phoneNumber = null;
        icNumber = null;
        age = 0;
        gender = '-';
        feedback = null;
    }
    
    
    //edit customer info method
    public void  editCustomerInfo(String cn, String pn, String ic, int a, char g){
        customerName = cn;
        phoneNumber = pn;
        icNumber = ic;
        age = a;
        gender = g;
    }

}