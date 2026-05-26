import java.time.LocalDate; 
import java.text.DecimalFormat; 

public class Payment{
    
    private final static DecimalFormat df = new DecimalFormat("0.00");
    private String transactionID, bankName, bankUsername, bankPassword, numberBankAccount;
    private LocalDate paymentDate;
    private double amount;
    
    //default constructor
    public Payment(){
        transactionID = null;
        paymentDate = null;
        bankName = null;
        bankUsername = null;
        bankPassword = null;
        numberBankAccount = null;
        amount = 0.0;
    }
    
    //normal constructor
    public Payment(String t, LocalDate pd, String bn, String bun, String bp, String nba, double a){
        transactionID = t;
        paymentDate = pd;
        bankName = bn;
        bankUsername = bun;
        bankPassword = bp;
        numberBankAccount = nba;
        amount = a;
    }
    
    
    //mutator
    public void setTransactionnID(String t){
        transactionID = t;
    }
    public void setPaymentDate(LocalDate pd){
        paymentDate = pd;
    }
    public void setBankName(String bn){
        bankName = bn;
    }
    public void setBankUsername(String bun){
        bankUsername = bun;
    }
    public void setBankPassword(String bp){
        bankPassword = bp;
    }
    public void setNumberBankAccount(String nba){
        numberBankAccount = nba;
    }
    public void setPayment(String t, LocalDate pd, String bn, String bun, String bp, String nba, double a){
        transactionID = t;
        paymentDate = pd;
        bankName = bn;
        bankUsername = bun;
        bankPassword = bp;
        numberBankAccount = nba;
        amount = a;
    }
   
    
    //accessor
    public String getTransactionID(){
        return transactionID;
    }
    public LocalDate getPaymentDate(){
        return paymentDate;
    }
    public String getBankName(){
        return bankName;
    }
    public String getBankUsername(){
        return bankUsername;
    }
    public String getBankPassword(){
        return bankPassword;
    }
    public String getNumberBankAccount(){
        return numberBankAccount;
    }
    public double getAmount(){
        return amount;
    }
    
    
    
    
    //printReceipt gold ticket method
    String ticketCategory;
    String seatType;
    public void printReceiptGold(String origin, String destination, String departure, String returnDate, String name, char category, double amount, int pax, String ticketType, char packages, char seat){
        
       
        if(category == 'A' || category == 'a'){
            
            ticketCategory = "Adult";
            
        }else if(category == 'C' || category == 'c'){
            
            ticketCategory = "Child";
        }
    
        if(seat == 'H' || seat == 'h'){
            seatType = "Hard Seat";
        }else if(seat == 'S' || seat == 's'){
            seatType = "Soft Seat";
        }else if(seat == 'N' || seat == 'n'){
            seatType = "None";
        }
        
        if(ticketType.equalsIgnoreCase("Gold")){
            
        
             System.out.println("\n\n\nRECEIPT");
             System.out.println("_______________________________________________________________________");
             System.out.println("                     " + origin + "-" + destination + "                ");
             System.out.println("_______________________________________________________________________");
             System.out.println("Departure Date      : " + departure);
             System.out.println("Return Date         : " + returnDate);
             System.out.println("Name                : " + name);
             System.out.println("Category            : " + ticketCategory);
             System.out.println("Package             : " + packages);
             System.out.println("Seat Type           : " + seatType);
             System.out.println("Ticket Type         : " + ticketType);
             System.out.println("Transaction Id      : " + transactionID);
             System.out.println("Payment Date        : " + paymentDate);
             System.out.println("Bank Name           : " + bankName);
             System.out.println("Number Bank Account : " + numberBankAccount);
             System.out.println("_______________________________________________________________________");
             System.out.println("                                                    Total: RM" + df.format(amount));
             System.out.println("_______________________________________________________________________");
             System.out.println("*Any requires or problems please contact : 05-5079-555                 ");
        }
        
    }
    
    
    
    
    
    //method print receipt for silver ticket
    String isStudent;
    String seniorCitizen;
    public void printReceiptSilver(String origin, String destination, String departure, String returnDate, String name, char category, double amount, int pax, String ticketType, boolean student, boolean sCitizen){
        
       
        if(category == 'A' || category == 'a'){
            
            ticketCategory = "Adult";
            
        }else if(category == 'C' || category == 'c'){
            
            ticketCategory = "Child";
        }
    
        if(student == true){
            isStudent = "Student";
        }else{
            isStudent = "Not a Student";
        }
        
        if(sCitizen == true){
            seniorCitizen = "Senior Citizen";
        }else{
            seniorCitizen = "Not a Senior Citizen";
        }
        
        
        if(ticketType.equalsIgnoreCase("Silver")){
            
              System.out.println("\n\n\nRECEIPT");
              System.out.println("_______________________________________________________________________");
              System.out.println("                     " + origin + "-" + destination + "                ");
              System.out.println("_______________________________________________________________________");
              System.out.println("Departure Date      : " + departure);
              System.out.println("Return Date         : " + returnDate);
              System.out.println("Name                : " + name);
              System.out.println("Category            : " + ticketCategory);
              System.out.println("Is Student          : " + isStudent);
              System.out.println("is Senior Citizen   : " + seniorCitizen);
              System.out.println("Ticket Type         : " + ticketType);
              System.out.println("Transaction Id      : " + transactionID);
              System.out.println("Payment Date        : " + paymentDate);
              System.out.println("Bank Name           : " + bankName);
              System.out.println("Number Bank Account : " + numberBankAccount);
              System.out.println("_______________________________________________________________________");
              System.out.println("                                                    Total: RM" + df.format(amount));
              System.out.println("_______________________________________________________________________");
              System.out.println("*Any requires or problems please contact : 05-5079-555                 ");
        }
    }
    
    
    
    
    
    

}