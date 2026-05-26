
public abstract class Ticket{
    private String ticketType, origin, destination, departureDate, returnDate;
    private int pax;
    private char ticketCategory;
    
    
    //default cosntructor
    public Ticket(){
      
        ticketType = null;
        origin = null;
        destination = null;
        departureDate = null;
        returnDate = null;
        pax = 0;
        ticketCategory = '-';
    }
    
    //normal constructor
    public Ticket(String tt, String o, String d, String dd, String rd, int p, char tc){
       
        ticketType = tt;
        origin = o;
        destination = d;
        departureDate = dd;
        returnDate = rd;
        pax = p;
        ticketCategory = tc;
    }
    
    //mutator
    public void setTicketType(String tt){
        ticketType = tt;
    }
    public void setOrigin(String o){
        origin = o;
    }
    public void setDestination(String d){
        destination = d;
    }
    public void setDepartureDate(String dd){
        departureDate = dd;
    }
    public void setReturnDate(String rd){
        returnDate = rd;
    }
    public void setPax(int p){
        pax = p;
    }
    public void setTicketCategory(char tc){
        ticketCategory = tc;
    }
    
    
    //accessor
    public String getTicketType(){
        return ticketType;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDestination(){
        return destination;
    }
    public String getDepartureDate(){
        return departureDate;
    }
    public String getReturnDate(){
        return returnDate;
    }
    public int getPax(){
        return pax;
    }
    public char getTicketCategory(){
        return ticketCategory;
    }
    
    //toString
    public String toString(){
        return("\nTicket Type: " + ticketType + "\nOrigin: " + origin + "\nDestination: " + destination + "\nDeparture Date: " + departureDate + 
        "\nReturn Date: " + returnDate + "\nPax: " + pax + "\nTicket Category: " + ticketCategory);
    }
    
    
    //browsing ticket method
    public abstract void browsingTicket();
        
      
    //calculate amount method
    public abstract double calculateAmount(int returnOption);
        
    
    //delete or cancel ticket method
    public abstract void deleteTicket();
    
    
    //browsing ticket info method
    public abstract void browsingTicketInfo();

}