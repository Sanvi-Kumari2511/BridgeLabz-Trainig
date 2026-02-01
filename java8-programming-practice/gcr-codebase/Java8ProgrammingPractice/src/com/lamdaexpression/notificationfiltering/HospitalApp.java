package com.lamdaexpression.notificationfiltering;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HospitalApp {

    public static void main(String[] args) {

        //Creating a list for alert
        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Heart rate critical", "Emergency"));
        alerts.add(new Alert("Take medicine at 9 PM", "Reminder"));
        alerts.add(new Alert("Doctor appointment tomorrow", "Appointment"));
        alerts.add(new Alert("Severe stomach pain", "Emergency"));

        //Predicate (filter condition)
        Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");

        //Filter and display only emergency alerts
        System.out.println("Emergency Alerts:\n");

        for (Alert a : alerts) {
            if (emergencyOnly.test(a)) {
                System.out.println(a);
                System.out.println();
            }
        }
    }
}
