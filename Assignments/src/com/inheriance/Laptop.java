package com.inheriance;

public class Laptop {
    
    private int noOfUSBPort;
    private int processorSpeed;

    
    public int getNoOfUSBPort() {
        return noOfUSBPort;
    }

    
    public void setNoOfUSBPort(int noOfUSBPort) {
        this.noOfUSBPort = noOfUSBPort;
    }

    
    public int getProcessorSpeed() {
        return processorSpeed;
    }

   
    public void setProcessorSpeed(int processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

   
    public static void main(String[] args) {
       
        Laptop myLaptop = new Laptop();

       
        myLaptop.setNoOfUSBPort(3);
        myLaptop.setProcessorSpeed(2500);

       
        System.out.println("Number of USB Ports: " + myLaptop.getNoOfUSBPort());
        System.out.println("Processor Speed: " + myLaptop.getProcessorSpeed() + " MHz");
    }







	}


