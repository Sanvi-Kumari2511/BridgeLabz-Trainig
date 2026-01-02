package com.circularlinkedlist;

public class RoundRobinScheduler {
	

	    private Process head = null;
	    private Process tail = null;
	    private int processCount = 0;

	    //Adding process at the end
	    public void addProcess(int pid, int burstTime, int priority) {

	        Process node = new Process(pid, burstTime, priority);

	        if (head == null) {
	            head = tail = node;
	            node.next = head;
	        } 
	        else {
	            tail.next = node;
	            tail = node;
	            tail.next = head;
	        }

	        processCount++;
	        System.out.println("Process " + pid + " added.");
	    }

	    //Removing process by ID
	    private void removeProcess(Process prev, Process current) {

	        if (current == head && current == tail) {
	            head = tail = null;
	        } 
	        else if (current == head) {
	            head = head.next;
	            tail.next = head;
	        } 
	        else if (current == tail) {
	            tail = prev;
	            tail.next = head;
	        } 
	        else {
	            prev.next = current.next;
	        }

	        processCount--;
	    }

	    //Displaying processes
	    public void displayProcesses() {

	        if (head == null) {
	            System.out.println("No processes in queue.");
	            return;
	        }

	        Process temp = head;
	        System.out.print("Process Queue: ");

	        do {
	            System.out.print("[PID: " + temp.processId +
	                             ", RT: " + temp.remainingTime + "] -> ");
	            temp = temp.next;
	        } 
	        while (temp != head);

	        System.out.println("(Back to Head)");
	    }

	    //Round Robin Scheduling Simulation
	    public void schedule(int timeQuantum) {

	        if (head == null) {
	            System.out.println("No processes to schedule.");
	            return;
	        }

	        int currentTime = 0;
	        double totalWaitingTime = 0;
	        double totalTurnaroundTime = 0;

	        Process current = head;
	        Process prev = tail;

	        while (processCount > 0) {

	            displayProcesses();

	            if (current.remainingTime > timeQuantum) {

	                currentTime += timeQuantum;
	                current.remainingTime -= timeQuantum;

	            }
	            else {

	                currentTime += current.remainingTime;
	                current.remainingTime = 0;

	                current.turnaroundTime = currentTime;
	                current.waitingTime =
	                        current.turnaroundTime - current.burstTime;

	                totalWaitingTime += current.waitingTime;
	                totalTurnaroundTime += current.turnaroundTime;

	                System.out.println("Process " + current.processId + " completed.");

	                removeProcess(prev, current);
	                current = prev.next;
	                continue;
	            }

	            prev = current;
	            current = current.next;
	        }

	        System.out.println("\nScheduling completed.");
	        System.out.println("Average Waiting Time: " +
	                (totalWaitingTime / (totalTurnaroundTime == 0 ? 1 : (totalWaitingTime + processCount))) );
	        System.out.println("Average Turnaround Time: " +
	                (totalTurnaroundTime / (totalTurnaroundTime == 0 ? 1 : (totalWaitingTime + processCount))) );
	    }
	}

