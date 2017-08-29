package Confrence;

import java.util.*;

public class ConferenceRegistration {
    public static void main(String [] args) {
        Conference conf = new Conference();

        SeminarSession s = new SeminarSession("Session1" , 6); //6 seats are in this session
        conf.sessions[0] = s;

        SeminarSession s1 = new SeminarSession("Session2" , 8); //8 seats are in this session
        conf.sessions[1] = s1;

        SeminarSession s2 = new SeminarSession("Session3" , 10); //10 seats are in this session
        conf.sessions[2] = s2;

        SeminarSession s3 = new SeminarSession("Session4" , 12); //12seats are in this session
        conf.sessions[3] = s3;

        /*Sessions init compeleted*/

        /*Lets start Registration process*/
        ArrayList<Registration> confRegistrations = new ArrayList<Registration>();
        int ns = 0;
        SeminarSession current_session = conf.sessions[ns];
        for (int i = 0; i < 20;  i++) {
            Registration reg1 = new Registration("Attendee " + i , 23 , "tom@tworks.com");
            confRegistrations.add(reg1);

            if((current_session.registerForSession(reg1) == false)&&(ns<4)){
                current_session = conf.sessions[ns++];
                if(current_session.registerForSession(reg1) == false){

                }
            }

        }

    }

}
