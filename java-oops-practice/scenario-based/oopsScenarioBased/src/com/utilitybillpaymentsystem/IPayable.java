package com.utilitybillpaymentsystem;

public interface IPayable {
	
	//Method to pay bill
    void pay();
    
    //Method to send reminder
    void sendReminder();
}
