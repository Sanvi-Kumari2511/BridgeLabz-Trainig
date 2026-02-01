package com.streamapi.insuranceclaimanalysis;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

    	//Creating a list of insurance claims
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Health", 30000),
            new Claim("Vehicle", 20000),
            new Claim("Vehicle", 40000),
            new Claim("Life", 100000)
        );

        //Group claims by type and calculate average amount
        Map<String, Double> averageClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                    	  c -> c.getClaimType(),
                          Collectors.averagingDouble(c -> c.getAmount())
                      ));

        //Displaying average claim amount for each claim type
        System.out.println("Average Claim Amount by Type:\n");

        
        averageClaimAmount.forEach((type, avg) ->
            System.out.println("Claim Type : " + type + 
                               "\nAverage Amount : " + avg + "\n")
        );
    }
}
