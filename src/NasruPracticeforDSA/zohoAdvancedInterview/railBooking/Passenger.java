package NasruPracticeforDSA.zohoAdvancedInterview.railBooking;

public class Passenger {
    String name;
    int age;
    String gender;
    String berthPreference;
    String ticketId;
    String allottedBerth;

    public Passenger(String name,int age,String gender,String berthPreference,String ticketId,String allotedBirth){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.allottedBerth=allotedBirth;
        this.ticketId=ticketId;
        this.berthPreference=berthPreference;
    }
    @Override
    public String toString(){
return "TicketId: "+ ticketId + ", Gender :"+gender+", Age: "+age+", Name :"+name+", Berth Preferrence :"+berthPreference+
        ", allotted Berth: "+allottedBerth;
    }

}
