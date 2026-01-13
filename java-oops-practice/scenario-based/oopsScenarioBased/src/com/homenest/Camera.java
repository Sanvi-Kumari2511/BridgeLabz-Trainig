package com.homenest;

 class Camera extends Device {
	 public Camera(String deviceId) {
	        super(deviceId, 1.2);
	    }

	    //Override
	    public void reset() {
	        System.out.println("Camera " + deviceId + " reset: Recording restarted.");
	        
	        System.out.println();
	    }
}
