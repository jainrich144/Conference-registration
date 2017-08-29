package Confrence;

public class Registration {
    private String attendeeName;
    private int age;
    private String email;
    boolean isSeatConfirmed;

    Registration(String attendeeName, int age, String email){
        this.attendeeName = attendeeName;
        this.age = age;
        this.email = email;
        this.isSeatConfirmed = false;
    }

    public void confirmSeat(boolean status){
        this.isSeatConfirmed = true;
    }

    public boolean isValidEmailId() {
       // We will check if email id is valid
        return true;
    }

    public void printRegistration(){
        System.out.println("\nName: " + this.attendeeName + "\nAge: " + this.age + "\nEMail: " + this.email + "\ncontact No." +"\n");
    }
}
