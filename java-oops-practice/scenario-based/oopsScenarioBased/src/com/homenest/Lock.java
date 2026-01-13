package com.homenest;

 class Lock extends Device {
	 public Lock(String deviceId) {
	        super(deviceId, 0.3);
	    }

	    //Override
	    public void reset() {
	        System.out.println("Lock " + deviceId + " reset: Security protocol refreshed.");
	        
	        System.out.println();
	    }
}
