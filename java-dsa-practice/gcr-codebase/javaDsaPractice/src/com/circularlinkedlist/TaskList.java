package com.circularlinkedlist;

public class TaskList {

	    private Task head;
	    private Task tail;
	    private Task current; 

	    //Adding task at the beginning
	    public void addAtBeginning(int id, String name, int priority, String dueDate) {

	        Task node = new Task(id, name, priority, dueDate);

	        if (head == null) {
	            head = tail = node;
	            node.next = head;
	        } 
	        else {
	            node.next = head;
	            tail.next = node;
	            head = node;
	        }
	        System.out.println("Task added at the beginning");
	    }

	    //Adding task at the end
	    public void addAtEnd(int id, String name, int priority, String dueDate) {

	        Task node = new Task(id, name, priority, dueDate);

	        if (head == null) {
	            head = tail = node;
	            node.next = head;
	        }
	        else {
	            tail.next = node;
	            node.next = head;
	            tail = node;
	        }
	        System.out.println("Task added at the end");
	    }

	    //Adding task at a specific position
	    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {

	        if (position == 1) {
	            addAtBeginning(id, name, priority, dueDate);
	            return;
	        }

	        Task node = new Task(id, name, priority, dueDate);
	        Task temp = head;

	        for (int i = 1; i < position - 1 && temp.next != head; i++) {
	            temp = temp.next;
	        }

	        node.next = temp.next;
	        temp.next = node;

	        if (temp == tail) {
	            tail = node;
	        }

	        System.out.println("Task added at position " + position);
	    }

	    //Removing task by Task ID
	    public void removeByTaskId(int id) {

	        if (head == null) {
	            System.out.println("No tasks are available");
	            return;
	        }

	        Task temp = head;
	        Task prev = tail;

	        do {
	            if (temp.taskId == id) {

	                if (temp == head && temp == tail) {
	                    head = tail = null;
	                } else {
	                    prev.next = temp.next;
	                    if (temp == head)
	                        head = temp.next;
	                    if (temp == tail)
	                        tail = prev;
	                }

	                System.out.println("Task is removed successfully");
	                return;
	            }
	            prev = temp;
	            temp = temp.next;

	        } 
	        while (temp != head);

	        System.out.println("Task is not found");
	    }

	    //View current task and move to next
	    public void viewNextTask() {

	        if (head == null) {
	            System.out.println("No tasks are available");
	            return;
	        }

	        if (current == null) {
	            current = head;
	        }

	        displayTask(current);
	        current = current.next;
	    }

	    // 6. Display all tasks
	    public void displayAllTasks() {

	        if (head == null) {
	            System.out.println("No tasks are available");
	            return;
	        }

	        Task temp = head;
	        System.out.println("\nAll Tasks are:");

	        do {
	            displayTask(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    //Searching task by priority
	    public void searchByPriority(int priority) {

	        if (head == null) {
	            System.out.println("No tasks are available");
	            return;
	        }

	        Task temp = head;
	        boolean found = false;

	        do {
	            if (temp.priority == priority) {
	                displayTask(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } 
	        while (temp != head);

	        if (!found) {
	            System.out.println("No task is found with given priority");
	        }
	    }

	    //Helper method to display one task
	    private void displayTask(Task t) {
	        System.out.println("Task ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority + ", Due Date: " + t.dueDate);
	    }
	}

