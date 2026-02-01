package com.streamapi.filteringexpiringmemberships;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GymMembership {

    public static void main(String[] args) {

        //Creating list of gym members
        List<Member> members = Arrays.asList(
            new Member("Sanvi", LocalDate.now().plusDays(10)),
            new Member("Annu", LocalDate.now().plusDays(40)),
            new Member("Sandip", LocalDate.now().plusDays(25)),
            new Member("Priyanshu", LocalDate.now().plusDays(5))
        );

        //Today's date
        LocalDate today = LocalDate.now();

        //Date after 30 days
        LocalDate next30Days = today.plusDays(30);

        //Filtering members whose membership expires within 30 days
        List<Member> expiringMembers =
                members.stream()                    
                       .filter(m -> 
                           m.getExpiryDate().isAfter(today) &&
                           m.getExpiryDate().isBefore(next30Days)
                       )
                       .collect(Collectors.toList()); 
        
        //Printing result
        System.out.println("Members expiring within 30 days:\n");

        for (Member m : expiringMembers) {
            System.out.println(m);
            System.out.println();
        }
    }
}
