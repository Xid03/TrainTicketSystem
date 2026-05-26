import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.Random;
import java.text.DecimalFormat;  

public class TicketTrainApp{
    private final static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        
        //variable declaration
        String email = "-";
        String password = "-";
        String emailAdmin;
        String passwordAdmin;
        boolean success = false;
        boolean whichSite = true;
        int totalsold = 0 ;
        int returnOption = 0;
        int sold = 0;
        int pax = 0;
        double totalSales = 0.0;
        double amount = 0.0;
        double totalPayment = 0.0;
        int ticketAns = 0;
        boolean seniorCitizen = false;
        String ticketType = null;
        String feedback = null;
        int rating = 0;
        int newPax = 0;
        int loop = 0;
        
       
        
        // create an object of Random class
        Random random = new Random();
        //create an object of SignUp class
        SignUp custSignUp = new SignUp();
        //Ticket soldTicket = new Ticket();
        Payment payment = new Payment();
        
      
        //create array 
        Customer[] arrCust = new Customer[0];
        Ticket[] Ticket = new Ticket[0];
        double[] custAmount = new double[0];
        
        
        while(whichSite){
            

        totalPayment = 0;
        loop = loop + pax;
        
        //enter want to go which site or page
        String strWebsiteQuestion = JOptionPane.showInputDialog(null, "Enter [C-Customer/A-Admin]: ", "Main Menu",     JOptionPane.QUESTION_MESSAGE);
        char websiteQuestion = strWebsiteQuestion.charAt(0);
        
        
        // customer page or site
        if(websiteQuestion == 'C' || websiteQuestion == 'c'){
            










            //Sign up
            JOptionPane.showMessageDialog(null, "Welcome to Train Ticket Booking System", "Welcome", JOptionPane.INFORMATION_MESSAGE);
            int signUpAnswer = JOptionPane.showConfirmDialog(null,"Do you already sign up (Yes/No)?");
        
            if(signUpAnswer == 1){
                  JOptionPane.showMessageDialog(null, "Sign Up", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
                  //enter input for sign up
                  email = JOptionPane.showInputDialog(null, "Enter email: ", "Sign Up", JOptionPane.QUESTION_MESSAGE);
                  password = JOptionPane.showInputDialog(null, "Enter password: ", "Sign Up", JOptionPane.QUESTION_MESSAGE);
            
                  //set sign up
                  custSignUp.setSignUp(email, password);
                  success = false;
            
            }else if(signUpAnswer == 0){
                  success = false;
            }
            
            
            //log in
         
            while(!success){
                  JOptionPane.showMessageDialog(null, "Log in", "Log in", JOptionPane.INFORMATION_MESSAGE);
                  email = JOptionPane.showInputDialog(null, "Enter email: ", "Log in", JOptionPane.QUESTION_MESSAGE);
                  password = JOptionPane.showInputDialog(null, "Enter password: ", "Log in", JOptionPane.QUESTION_MESSAGE);
            
                  //create an object for login class
                  LogIn custLogIn = new LogIn(email, password);
            
                  //verify log in
                  boolean verify = custLogIn.verifyLogin(custSignUp.getEmail(), custSignUp.getPassword());
                  
                  if(verify){
                      success = true;
                  }else{
                      success = false;
                  }
            }
        
            
            
            
            //customer info
            int no = 0;
            if(success){
                
                JOptionPane.showMessageDialog(null, "Customer Info", "Customer Info", JOptionPane.INFORMATION_MESSAGE);
             
                //enter pax
                pax = Integer.parseInt(JOptionPane.showInputDialog("Enter pax: "));
             
                //create object for customer 
                newPax = loop + pax;
                arrCust = new Customer[newPax];
                
               
               
                //enter customer info
                for(int i=loop; i<newPax; i++){
                    
                     
                      no++;
                      String custName = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Name:", "Customer Info", JOptionPane.QUESTION_MESSAGE);
                      String  custPhoneNum = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Phone Number: ", "Customer Info", JOptionPane.QUESTION_MESSAGE);
                      String custIC = JOptionPane.showInputDialog(null, "Enter Customer " + no + " IC Number: ", "Customer Info", JOptionPane.QUESTION_MESSAGE);
                      int  age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Customer " + no + " age(ticket category base on customer age!): ", "Customer Info", JOptionPane.QUESTION_MESSAGE));
                      String stringGender = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Gender [M-Male/F-Female]: ", "Customer Info", JOptionPane.QUESTION_MESSAGE);
                      char gender = stringGender.charAt(0);
                 

                     
                       // create a string of all characters
                       String id = "abcd12345";
                       
                       // specify length of random string
                       int lengths = 5;
                       
                       //create of object for StringBuilder class
                       StringBuilder sbCustID = new StringBuilder();

                       for(int a = 0; a < lengths; a++) {

                           // generate random index number
                           int indexs = random.nextInt(id.length());

                           // get character specified by index
                           // from the string
                           char randomchar = id.charAt(indexs);

                           //append the character to string builder
                           sbCustID.append(randomchar);
                       } 
                       
                      
                      String custID = sbCustID.toString();
                      
                      //create object for customer
                      arrCust[i] =  new Customer(custName, custID, custPhoneNum, custIC, age, gender, feedback, rating);
                 
                 
                }
                
                
                
                
                //customer info
                int custInformation = JOptionPane.showConfirmDialog(null,"Do you want to see customer information [Yes/No]");
                if(custInformation == 0){
                    no = 1;
                    for(int i=loop; i<newPax; i++){
                        JOptionPane.showMessageDialog(null, "   [Customer " + no + " info] " + arrCust[i].toString(), "Customer Info", JOptionPane.INFORMATION_MESSAGE);
                        no++;
                    }
                }
                
                
                
                
                //edit information 
                int editInformation = JOptionPane.showConfirmDialog(null,"Do you want to edit Customer information [Yes/No]");
                while(editInformation == 0){
                    
                    no = 1;
                    for(int i=loop; i<newPax; i++){
                            
                      String custName = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Name:", "Edit Customer Info", JOptionPane.QUESTION_MESSAGE);
                      String  custPhoneNum = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Phone Number: ", "Edit Customer Info", JOptionPane.QUESTION_MESSAGE);
                      String custIC = JOptionPane.showInputDialog(null, "Enter Customer " + no + " IC Number: ", "Edit Customer Info", JOptionPane.QUESTION_MESSAGE);
                      int  age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Customer " + no + " age(ticket category base on customer age!): ", "Edit Customer Info", JOptionPane.QUESTION_MESSAGE));
                      String stringGender = JOptionPane.showInputDialog(null, "Enter Customer " + no + " Gender [M-Male/F-Female]: ", "Edit Customer Info", JOptionPane.QUESTION_MESSAGE);
                      char gender = stringGender.charAt(0);
                      
                  
                      arrCust[i].editCustomerInfo(custName, custPhoneNum, custIC, age, gender);
                            
                      no++;
                    }
                   
                    



                    //display customer info
                    custInformation = JOptionPane.showConfirmDialog(null,"Do you want to see customer information [Yes/No]");
                    if(custInformation == 0){
                        no = 1;
                        for(int i=loop; i<newPax; i++){
                            JOptionPane.showMessageDialog(null, "   [Customer " + no + " info] " + arrCust[i].toString(), "Customer Info",    JOptionPane.INFORMATION_MESSAGE);
                            no++;
                        }
                    }
                    
                    editInformation = JOptionPane.showConfirmDialog(null,"Do you want to edit customer information again[Yes/No]");
                }
                
                
                //browsing ticket
                int browsingAnswer= JOptionPane.showConfirmDialog(null,"Do you want to Browsing ticket (Yes/No)?");
        
                if(browsingAnswer == 0){
                      GoldTicket browsingTicket = new GoldTicket();
                      browsingTicket.browsingTicket();
                }
             
                
                
                
                       
                //choose ticket base on origin, destination, departure date and return date
                String origin = JOptionPane.showInputDialog(null, "Choose Origin (Ipoh/Kuala Lumpur/Tapah/Kajang): ", "Ticket Option", JOptionPane.QUESTION_MESSAGE);
                String destination = JOptionPane.showInputDialog(null, "Choose Destination (Ipoh/Kuala Lumpur/Tapah/Kajang): ", "Ticket Option", JOptionPane.QUESTION_MESSAGE);
                String departureDate = JOptionPane.showInputDialog(null, "Enter departure date (dd-mm-yyyy): ", "Ticket Option", JOptionPane.QUESTION_MESSAGE);
                String returnDate;
                 
                returnOption = JOptionPane.showConfirmDialog(null,"Do you want to buy return ticket also (Yes/No)?");
                if(returnOption == 0){
                        returnDate = JOptionPane.showInputDialog(null, "Enter return date (dd-mm-yyyy): ", "Ticket Option", JOptionPane.QUESTION_MESSAGE);
                }else{
                        returnDate = "None";
                }
             
                
                
                
                
                
                //ticket category
                char ticketCategory;
                
                //creat arraat for ticket
                Ticket = new Ticket[newPax];
                for(int i=loop; i<newPax; i++){
                    
                      //determine ticketcategory base  on age
                      if(arrCust[i].getAge() >= 18){
                           ticketCategory = 'A';
                      }else{
                           ticketCategory = 'C';
                      }
                      
                      













                      //enter ticket type
                      ticketType = JOptionPane.showInputDialog(null, "Enter Ticket Type for " + arrCust[i].getCustomerName() + " (Gold/Silver): ", "Ticket Option", JOptionPane.QUESTION_MESSAGE);
                      
                      
                      if(ticketType.equalsIgnoreCase("Gold")){
                          
                          //browsing ticket info for gold
                          int browsingGold= JOptionPane.showConfirmDialog(null,"Do you want to Browsing Gold ticket Information (Yes/No)?");
        
                          if(browsingGold == 0){
                                GoldTicket goldTicketInfo = new GoldTicket();
                                goldTicketInfo.browsingTicketInfo();
                          }
                          
                          char packageType = JOptionPane.showInputDialog(null, "Enter package (A-have foods/B-have foods and drinks/N-None): ", "Ticket Option(Gold)", JOptionPane.QUESTION_MESSAGE).charAt(0);
                          char seatType = JOptionPane.showInputDialog(null, "Enter seat type (H-Hard seat/S-Soft seat): ", "Ticket Option(Gold)", JOptionPane.QUESTION_MESSAGE).charAt(0);
                          
                          //create object for ticket gold
                          Ticket[i] = new GoldTicket(ticketType, origin, destination, departureDate, returnDate, pax, ticketCategory, packageType, seatType);
                          
                          
                          
                      }else if(ticketType.equalsIgnoreCase("Silver")){
                          
                           //browsing ticket info for silver
                           int browsingSilver = JOptionPane.showConfirmDialog(null,"Do you want to Browsing Silver ticket Information (Yes/No)?");
        
                           if(browsingSilver == 0){
                                SilverTicket silverTicketInfo = new SilverTicket();
                                silverTicketInfo.browsingTicketInfo();
                           }
                          
                           boolean isStudent = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Student or not? (true/false): ", "Ticket Option(Silver)", JOptionPane.QUESTION_MESSAGE));
                           
                           //determine if the customer is senior citizen or not base on age
                           if(arrCust[i].getAge() >= 60){
                               seniorCitizen = true;
                           }else{
                               seniorCitizen = false;
                           }
                           
                           //create array for ticket silver
                           Ticket[i] = new SilverTicket(ticketType, origin, destination, departureDate, returnDate, pax, ticketCategory, isStudent, seniorCitizen);
                          
                      }
                      
                }
                
                
                
                
          
               
                
                













                
                // make a payment
                JOptionPane.showMessageDialog(null, "Make Payment", "Payment", JOptionPane.INFORMATION_MESSAGE);
                 
                    
                // create a string of all characters
                String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
                
                // specify length of random string
                int length = 10;
                
                // create object for String builder class
                StringBuilder sbTicket = new StringBuilder();

                for(int i = 0; i < length; i++) {

                     // generate random index number
                     int index = random.nextInt(alphabet.length());

                     // get character specified by index
                     // from the string
                     char randomChar = alphabet.charAt(index);

                     //append the character to string builder
                     sbTicket.append(randomChar);
                } 

                String transactionID = sbTicket.toString();
                 
                //create object for payment date use class localDate
                LocalDate paymentDate = LocalDate.now();
                 
                String bankName =  JOptionPane.showInputDialog(null, "Enter Bank Name: ", "Payment", JOptionPane.QUESTION_MESSAGE);
                String bankUsername = JOptionPane.showInputDialog(null, "Enter Bank Username: ", "Payment", JOptionPane.QUESTION_MESSAGE);
                String bankPassword = JOptionPane.showInputDialog(null, "Enter Bank Password: ", "Payment", JOptionPane.QUESTION_MESSAGE);
                String bankNumberAccount = JOptionPane.showInputDialog(null, "Enter Bank Number Account: ", "Payment", JOptionPane.QUESTION_MESSAGE);
                
                //create object for  goldticket and silver ticket
                GoldTicket objGold = new GoldTicket();
                SilverTicket objSilver = new SilverTicket();
                
                //set array length for custAmount array
                custAmount = new double[newPax];
                for(int i=loop; i<newPax; i++){
                    
                     //calculate amount
                     amount = Ticket[i].calculateAmount(returnOption);
                     
                     //set payment
                     payment.setPayment(transactionID, paymentDate, bankName, bankUsername, bankPassword, bankNumberAccount, amount);
                     
                     if(Ticket[i] instanceof GoldTicket){
                         objGold = (GoldTicket) Ticket[i];
                         
                         if(Ticket[i].getTicketType().equalsIgnoreCase("Gold")){
                             
                               //print receipt for gold ticket
                               payment.printReceiptGold(origin, destination, departureDate, returnDate, arrCust[i].getCustomerName(), Ticket[i].getTicketCategory(), payment.getAmount(), pax, Ticket[i].getTicketType(), objGold.getPackageType(), objGold.getSeatType());
                         }
                         
                     }else if(Ticket[i] instanceof SilverTicket){
                         objSilver  = (SilverTicket) Ticket[i];
                         
                         if(Ticket[i].getTicketType().equalsIgnoreCase("Silver")){
                             
                               //print receipt for silver ticket
                               payment.printReceiptSilver(origin, destination, departureDate, returnDate, arrCust[i].getCustomerName(), Ticket[i].getTicketCategory(), payment.getAmount(), pax, Ticket[i].getTicketType(), objSilver.getIsStudent(), objSilver.getSeniorCitizen());
                         }
                    
                     }
                     
                     
                     //calculate total payment
                     totalPayment += payment.getAmount();
                    
                     
                     //assign custAmount array to amount
                     custAmount[i] = payment.getAmount();
                }
                
                
                //calculate total sales for admin
                totalSales = totalSales + totalPayment;
                
                
                //input for give a feedback and rating
                int feedbackAns = JOptionPane.showConfirmDialog(null,"Do you want to give a feedback and rating?");
                
                if(feedbackAns == 0){
                    feedback = JOptionPane.showInputDialog(null, "Type feedback: ", "Feedback", JOptionPane.QUESTION_MESSAGE);
                    rating = Integer.parseInt(JOptionPane.showInputDialog(null, "Type rating[1/2/3/4/5]: ", "Rating", JOptionPane.QUESTION_MESSAGE));
                    
                    for(int i=loop; i<newPax; i++){
                        arrCust[i].setFeedback(feedback); 
                        arrCust[i].setRating(rating);
                    }
                    
                }
                
                
                 
                
                //calculate total ticket sold
                int totalSold = 0;
                totalSold = totalSold + pax;
                sold = totalSold;
            
            
                
                
               
               
                //display output for total payment      
                System.out.println("\n\n\n-----------------------------------------------------------------------------------------");
                System.out.println("                                      Payment                                              ");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Total amount to pay: RM" + df.format(totalPayment));
                System.out.println("Total ticket       :   " + sold);
                System.out.println("-----------------------------------------------------------------------------------------");
                     
                JOptionPane.showMessageDialog(null, "Thank you for purchase!", "Exit", JOptionPane.INFORMATION_MESSAGE);
        
            }
        
         
        
            
            
            
            
            
           //admin page or site 
        }else if(websiteQuestion == 'A' || websiteQuestion == 'a'){
            
             //create an object for login class
             LogIn adminLogIn = new LogIn(email, password);
             Admin admin = new Admin();
             
             //declaration variable
             String adminName = null;
             boolean successAdmin = false;
              

             
             //admin login
             while(!successAdmin){
                 JOptionPane.showMessageDialog(null, "Log in", "Log in Admin", JOptionPane.INFORMATION_MESSAGE);
                 emailAdmin = JOptionPane.showInputDialog(null, "Enter Username: ", "Log in Admin", JOptionPane.QUESTION_MESSAGE);
                 passwordAdmin = JOptionPane.showInputDialog(null, "Enter password: ", "Log in Admin", JOptionPane.QUESTION_MESSAGE);
            
                
                 adminLogIn.setLogIn(emailAdmin, passwordAdmin);
                 
            
                 //verify log in
                 boolean verify = adminLogIn.verifyLogin(admin.getAdminUsername(), admin.getAdminPassword());
                  
                if(verify){
                    successAdmin = true;
                }else{
                    successAdmin = false;
                }
                
             }
            
            
             
             
             //if success login
             if(successAdmin){
                 
               //enter admin name  
               adminName = JOptionPane.showInputDialog(null, "Enter admin name: ", "Admin name", JOptionPane.QUESTION_MESSAGE);
               admin.setAdminName(adminName);
               
               
               //
               System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------------------------");
               System.out.println("                                                    Admin Page                                                                 ");
               System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
               
               //declare variable
               boolean searchBool = false;
               
               
               
               //search customer
               int searchAns = JOptionPane.showConfirmDialog(null,"Do you want to search customer?");
               if(searchAns == 0){
                   searchBool = true;
               }
               
               while(searchBool){
                     
                     String searchName = JOptionPane.showInputDialog("Enter Customer name to search: ");
                    
                     boolean found = false;
                     int index = -1;
                     String strr = "";
                     
                    
                     
                     for(int i=0; i<newPax; i++){
                         
                         if(arrCust[i].getCustomerName().equalsIgnoreCase(searchName)){
                            found = true;
                            index = i;
                         }
                         
                         
                     }
                     






                     if(found){
                         JOptionPane.showMessageDialog(null, arrCust[index].toString(), "Search Customer", JOptionPane.INFORMATION_MESSAGE);
                     }else{
                         JOptionPane.showMessageDialog(null, " Not found", "Search Customer", JOptionPane.INFORMATION_MESSAGE);
                     }
                     

                
                     searchAns = JOptionPane.showConfirmDialog(null,"Do you want to search customer again?");
                     
                     if(searchAns == 1){
                         searchBool = false;
                     }
                     
                     
                     
            
               }    
                
               
               
               
                
               //display feedback
               int feedbackOutput = JOptionPane.showConfirmDialog(null,"Do you want to display feedback from customer?");
               System.out.println("\nFeedback fromm Customer:");
               if(feedbackOutput == 0){
                     
                     int no = 1;
                     for(int i=0; i<newPax; i++){
                    
                         System.out.println(no + ") "+ arrCust[i].getCustomerName() + ": " + arrCust[i].getFeedback());
                         no++;
                     }
                     
               }
               
               
               //display rating
               int ratingOutput = JOptionPane.showConfirmDialog(null,"Do you want to display rating from customer?");
               System.out.println("\nRating from Customer:");
               if(ratingOutput == 0){
                   
                     int no = 1;
                     for(int i=0; i<newPax; i++){
                    
                         System.out.println(no + ") "+ arrCust[i].getCustomerName() + ": " + arrCust[i].getRating());
                         no++;
                     }
                     
               }
               
                
                
                
            
                
               //total customer buy gold or silver ticket
               GoldTicket objGold = new GoldTicket();
               SilverTicket objSilver = new SilverTicket();
               int totalGold = 0;
               int totalSilver = 0;
               for(int i=0; i<newPax; i++){
                   
                     if(Ticket[i] instanceof GoldTicket){
                         objGold = (GoldTicket) Ticket[i];
                         
                         if(Ticket[i].getTicketType().equalsIgnoreCase("Gold")){
                              totalGold++;
                              
                         }
                         
                     }else if(Ticket[i] instanceof SilverTicket){
                         objSilver  = (SilverTicket) Ticket[i];
                         
                         if(Ticket[i].getTicketType().equalsIgnoreCase("Silver")){
                              totalSilver++;
                         }
                    
                     }
                     
               }
                 
               
               
               
               //display output admin information
               int salesInformation = JOptionPane.showConfirmDialog(null,"Do you want to display sales information?");  
               if(salesInformation == 0){
                    System.out.println("\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("                                                    Sales Information                                                                ");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Total ticket sold        : " + sold);
                    System.out.println("Total Gold ticket sold   : " + totalGold);
                    System.out.println("Total Silver ticket sold : " + totalSilver);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("                                                                                           Total sales: RM" + df.format(totalSales));
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n\n\n\n");
            
                   
               }
               
               
               
               
               //delete or cancel ticket
               int deleteTicket = JOptionPane.showConfirmDialog(null,"Do you want to delete or cancel customer purchased?");  

               while(deleteTicket == 0){
                   String deleteCustName = JOptionPane.showInputDialog("Enter Customer name to delete the ticket: ");
                   String deleteCustPhoneNum = JOptionPane.showInputDialog("Enter Customer phone number to delete the ticket: ");
                   
                   for(int i=0; i<newPax; i++){
                       
                       
                       
                       if(deleteCustName.equalsIgnoreCase(arrCust[i].getCustomerName()) && deleteCustPhoneNum.equals(arrCust[i].getPhoneNumber())){
                           arrCust[i].deleteCustomer();
                           
                           if(Ticket[i] instanceof GoldTicket){
                                objGold = (GoldTicket) Ticket[i];
                         
                                if(Ticket[i].getTicketType().equalsIgnoreCase("Gold")){
                                    Ticket[i].deleteTicket();
                                    totalGold-=1;
                                    
                                    totalSales = totalSales - (custAmount[i] * 0.8);
                                    sold-=1;
                                }
                                 
                                JOptionPane.showMessageDialog(null, "Delete ticket Successfull!", "Delete Ticket", JOptionPane.INFORMATION_MESSAGE);
                         
                           }else if(Ticket[i] instanceof SilverTicket){
                                objSilver  = (SilverTicket) Ticket[i];
                         
                                if(Ticket[i].getTicketType().equalsIgnoreCase("Silver")){
                                    Ticket[i].deleteTicket();
                                    totalSilver-=1;
                                    
                                    totalSales = totalSales - (custAmount[i] * 0.8);
                                    sold-=1;
                                }
                                
                                JOptionPane.showMessageDialog(null, "Delete ticket Successfull!", "Delete Ticket", JOptionPane.INFORMATION_MESSAGE);
                    
                           }
                           
                       }
                       
                       
                   }
                   
                   
                   //displat sales info afteer delete
                   System.out.println("\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("                                                    Sales Information                                                          ");
                   System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("Total ticket sold        : " + sold);
                   System.out.println("Total Gold ticket sold   : " + totalGold);
                   System.out.println("Total Silver ticket sold : " + totalSilver);
                   System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("                                                                                           Total sales: RM" + df.format(totalSales));
                   System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("                                                                                            Admin Name: " + admin.getAdminName() + "\n\n\n\n\n");
                   
                   deleteTicket = JOptionPane.showConfirmDialog(null,"Do you want to delete customer purchased again?");
               }
               
               
               
               
              
             }
        }
        
     
        
      
        
        //display output to ask user if want to go to main menu or not
        int menuAns = JOptionPane.showConfirmDialog(null,"Do you want to go to main menu?");
        if(menuAns == 1){
            whichSite = false;
        }
        
    }
   
        
    
                 
        
        
     
        
        
        
        
       
       
    }
}
