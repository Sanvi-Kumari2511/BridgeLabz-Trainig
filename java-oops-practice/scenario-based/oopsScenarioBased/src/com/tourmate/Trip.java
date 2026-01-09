package com.tourmate;

public class Trip implements IBookable{
   protected String destination;
   protected double budget;
   protected int duration;
  
   protected Transport transport;
   protected Hotel hotel;
   protected Activity activity;

   // Constructor to generate complete trip package
   public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {

       this.destination = destination;
       this.duration = duration;
       this.transport = transport;
       this.hotel = hotel;
       this.activity = activity;

       // Operator usage
       this.budget = transport.getCost()
                   + hotel.getCost()
                   + activity.getCost();
   }

   //Override
   public void book() {
       System.out.println("Trip booked to " + destination);
       System.out.println("Total Budget: ₹" + budget);
   }

   //Override
   public void cancel() {
       System.out.println("Trip cancelled for " + destination);
   
   }
}
