package com.assignment6;

public class Box {
	private double length;
    private double width;
    private double height;

    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public double calculateVolume() {
        return length * width * height;
    }

	public static void main(String[] args) {
		 Box myBox = new Box(3.0, 4.0, 5.0);

	      
	        double volume = myBox.calculateVolume();
	        System.out.println("Volume of the box: " + volume);
		

	}

}
