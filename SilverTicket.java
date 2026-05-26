
public class SilverTicket extends Ticket{
    private boolean isStudent;
    private boolean seniorCitizen;
    
    //constructor
    public SilverTicket(){
        super();
        isStudent = false;
        seniorCitizen = false;
    }
    
    public SilverTicket(String tt, String o, String d, String dd, String rd, int p, char tc, boolean s, boolean sc){
        super(tt, o, d, dd, rd, p, tc);
        isStudent = s;
        seniorCitizen = sc;
    }
    
      //mutator
    public void setTicketType(String tt){
        super.setTicketType(tt);
    }
    public void setOrigin(String o){
        super.setOrigin(o);
    }
    public void setDestination(String d){
        super.setDestination(d);
    }
    public void setDepartureDate(String dd){
        super.setDepartureDate(dd);
    }
    public void setReturnDate(String rd){
        super.setReturnDate(rd);
    }
    public void setPax(int p){
        super.setPax(p);
    }
    public void setTicketCategory(char tc){
        super.setTicketCategory(tc);
    }
    public void setIsStudent(boolean s){
        isStudent = s;
    }
    public void setSeniorCitizen(boolean sc){
        seniorCitizen = sc;
    }
    
    
    //accessor
    public String getTicketType(){
        return super.getTicketType();
    }
    public String getOrigin(){
        return super.getOrigin();
    }
    public String getDestination(){
        return super.getDestination();
    }
    public String getDepartureDate(){
        return super.getDepartureDate();
    }
    public String getReturnDate(){
        return super.getReturnDate();
    }
    public int getPax(){
        return super.getPax();
    }
    public char getTicketCategory(){
        return super.getTicketCategory();
    }
    public boolean getIsStudent(){
        return isStudent;
    }
    public boolean getSeniorCitizen(){
        return seniorCitizen;
    }
    
    
    
    //toString
    public String toString(){
        return(super.toString() + "\nIs Student: " + isStudent + "\nSenior Citizen: " + seniorCitizen);
    }
    
    
    
    
    
    //calculate amount method
    public double calculateAmount(int returnOption){
        
        double amountAdult = 0.0;
        double amountChild = 0.0;
        double totalAmount = 0.0;
        
        for(int a=0; a<getPax(); a++){
        if((getOrigin().equalsIgnoreCase("Ipoh") && getDestination().equalsIgnoreCase("Kuala Lumpur")) || (getOrigin().equalsIgnoreCase("Kuala Lumpur") && getDestination().equalsIgnoreCase("Ipoh"))){
            
              for(int i=0; i<getPax(); i++){
                    if(getTicketCategory() == 'A'){
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult = 35.00;
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult = 25.00;
                            }
                    }else{
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild = 35.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild = 25.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                    }
              }
            
        
        }else if((getOrigin().equalsIgnoreCase("Ipoh") && getDestination().equalsIgnoreCase("Tapah")) || (getOrigin().equalsIgnoreCase("Tapah") && getDestination().equalsIgnoreCase("Ipoh"))){
            
             for(int i=0; i<getPax(); i++){
                 
                    if(getTicketCategory() == 'A'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult = 16.00;

                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult = 13.00;
                            }
                            
                    }else if(getTicketCategory() == 'C'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild = 16.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild =  13.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                            
                    }
                    
             }
            
        
        }else if((getOrigin().equalsIgnoreCase("Ipoh") && getDestination().equalsIgnoreCase("Kajang")) || (getOrigin().equalsIgnoreCase("Kajang") && getDestination().equalsIgnoreCase("Ipoh"))){
            
             for(int i=0; i<getPax(); i++){
                 
                    if(getTicketCategory() == 'A'){
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult =  38.00;
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult = 29.00;
                            }
                            
                    }else if(getTicketCategory() == 'C'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild = 38.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild =  29.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                            
                    }
                    
             }
            
        
        }else if((getOrigin().equalsIgnoreCase("Kuala Lumpur") && getDestination().equalsIgnoreCase("Tapah")) || (getOrigin().equalsIgnoreCase("Tapah") && getDestination().equalsIgnoreCase("Kuala Lumpur"))){
            
             for(int i=0; i<getPax(); i++){
                 
                    if(getTicketCategory() == 'A'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult =  29.00;
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult =  21.00;
                            }
                            
                    }else if(getTicketCategory() == 'C'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild =  29.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild =  21.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                            
                    }
                    
             }
           
        
        }else if((getOrigin().equalsIgnoreCase("Kuala Lumpur") && getDestination().equalsIgnoreCase("Kajang")) || (getOrigin().equalsIgnoreCase("Kajang") && getDestination().equalsIgnoreCase("Kuala Lumpur"))){
            
             for(int i=0; i<getPax(); i++){
                 
                    if(getTicketCategory() == 'A'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult =  12.00;
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult =  10.00;
                            }
                            
                    }else if(getTicketCategory() == 'C'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild =  12.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild =  10.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                            
                    }
                    
             }
            
        
        }else if((getOrigin().equalsIgnoreCase("tapah") && getDestination().equalsIgnoreCase("Kajang")) || (getOrigin().equalsIgnoreCase("Kajang") && getDestination().equalsIgnoreCase("Tapah"))){
            
             for(int i=0; i<getPax(); i++){
                 
                    if(getTicketCategory() == 'A'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountAdult = 32.00;
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountAdult =  24.00;
                            }
                            
                    }else if(getTicketCategory() == 'C'){
                        
                            if(getTicketType().equalsIgnoreCase("Gold")){
                                 amountChild =  32.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }else if(getTicketType().equalsIgnoreCase("Silver")){
                                 amountChild = 24.00;
                                 amountChild = amountChild - (amountChild*0.3);
                            }
                            
                    }
                    
             }
            
        }
     
             if(getTicketCategory() == 'A'){
                 
                 if(isStudent == true){
                     amountAdult = amountAdult - (amountAdult * 0.05);
                 }
                 
             }else if(getTicketCategory() == 'C'){
                 
                 if(isStudent == true){
                     amountChild = amountChild - (amountChild * 0.05);
                 }

             }
             
             
           
                 
            if(seniorCitizen == true){
                   amountAdult = amountAdult - (amountAdult * 0.05); 
            }
     
        }   
    
   
        if(getTicketCategory() == 'A'){
               totalAmount = totalAmount + amountAdult;
         
               if(returnOption == 0){
                   totalAmount = totalAmount * 2;
               }
        
        }else if(getTicketCategory()==  'C'){
               totalAmount = totalAmount + amountChild;
        
               if(returnOption == 0){
                   totalAmount = totalAmount * 2;
               }
        
        }
        
        

    
        
        
    return totalAmount;
        
    }
    
    
    
    
    
    
    
    //browsing ticket method
    public void browsingTicket(){
        
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("                                     Ticket Available                                         "); 
        System.out.println("______________________________________________________________________________________________");
        System.out.println("         Origin            |           Destination          |         Price each person       ");  
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("           Ipoh            |           Kuala Lumpur         |  Gold-RM35  Silver-RM25 (Adult) "); 
        System.out.println("       Kuala Lumpur        |              Ipoh              |  Gold-RM35  Silver-RM25 (Adult) "); 
        System.out.println("           Ipoh            |              Tapah             |  Gold-RM16  Silver-RM13 (Adult) "); 
        System.out.println("           Tapah           |              Ipoh              |  Gold-RM16  Silver-RM13 (Adult) "); 
        System.out.println("           Ipoh            |             Kajang             |  Gold-RM38  Silver-RM29 (Adult) "); 
        System.out.println("          Kajang           |           Kuala Lumpur         |  Gold-RM38  Silver-RM29 (Adult) "); 
        System.out.println("       Kuala Lumpur        |              Tapah             |  Gold-RM29  Silver-RM21 (Adult) "); 
        System.out.println("           Tapah           |           Kuala Lumpur         |  Gold-RM29  Silver-RM21 (Adult) "); 
        System.out.println("       Kuala Lumpur        |             Kajang             |  Gold-RM12  Silver-RM10 (Adult) "); 
        System.out.println("          Kajang           |           Kuala Lumpur         |  Gold-RM12  Silver-RM10 (Adult) "); 
        System.out.println("           Tapah           |             Kajang             |  Gold-RM32  Silver-RM24 (Adult) "); 
        System.out.println("          Kajang           |              Tapah             |  Gold-RM32  Silver-RM24 (Adult) ");
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("                                                            |       (Child)- Discount 30%     "); 
        System.out.println("----------------------------------------------------------------------------------------------"); 
    }
    
    

    
    
    
    
    //browsing silver ticket info method
      public void browsingTicketInfo(){
          
        System.out.println("\n\n\n\n\n__________________________________________________");
        System.out.println("            Silver Ticket Information             "); 
        System.out.println("__________________________________________________");
        System.out.println("      Student            |   Senior Citizen     | ");   
        System.out.println("--------------------------------------------------");
        System.out.println("     Discount 5%         |     Discount 5%      | ");
        System.out.println("__________________________________________________");
      
        
    }
    
  
    
    
    
    //delete or cancel ticket for silver
    public void deleteTicket(){
         
        super.setTicketType(null);
        super.setOrigin(null);
        super.setDestination(null);
        super.setDepartureDate(null);
        super.setReturnDate(null);
        super.setTicketCategory('-');
        isStudent = false;
        seniorCitizen = false;
    
    }
           
}