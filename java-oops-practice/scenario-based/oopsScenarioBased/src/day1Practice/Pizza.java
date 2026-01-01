package day1Practice;

 class Pizza extends Food {
	
        //Constructor of Pizza class
	    Pizza(String name, double price) {
	        super(name, price);
	    }

	    //Override
	    public void showFood() {
	        System.out.println("Pizza -> " + name + " : " + price);
	    }
	}


