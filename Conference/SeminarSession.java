package Confrence;

import java.util.*;

public class SeminarSession {
    private String sessionName;
    private int seats;

    private List<Registration> seminarRegistrations = new ArrayList<Registration>();

    SeminarSession(String sessionName , int seats) {
        this.seats = seats;
        this.sessionName = sessionName;
    }

    public String getSessionName() {

        return sessionName; // We could use Session ID for better identification
    }

    public boolean registerForSession(Registration r) {
        // Check if Seats are available for this session
        if (seats <= 0) {
            return false; //Registration failed
        }

        r.confirmSeat(true);
        //If available, allow registrations
        seminarRegistrations.add(r);

        //reduce availability of seats
        seats = seats - 1;

        return true; //Registration successful
    }

    public int printAllRegistrations() {
        int n = 0;

        for (Registration tmpreg : seminarRegistrations) {
            tmpreg.printRegistration();
             n++;
        }

        return n;
    }

}
