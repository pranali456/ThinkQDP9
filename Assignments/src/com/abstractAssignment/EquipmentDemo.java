package com.abstractAssignment;

abstract class Equipment {

	public void fill() {
		System.out.println("Equipment is filled.");
	}

	public abstract void mix();
}

class CementMixer extends Equipment {

	@Override
	public void mix() {
		System.out.println("Cement mixer is mixing.");
	}

	public void pour() {
		System.out.println("Cement mixer is pouring.");
	}
}

public class EquipmentDemo {
	public static void main(String[] args) {
		CementMixer cementMixer = new CementMixer();
		cementMixer.fill();
		cementMixer.mix();
		cementMixer.pour();

		Equipment equipment = new CementMixer();

		equipment.fill();
		equipment.mix();

	}

}
