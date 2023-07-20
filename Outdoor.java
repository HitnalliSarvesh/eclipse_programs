package com.xworkz.inheritance.things;

public class Outdoor extends Games {
	public int duration;

	public Outdoor() {
		System.out.println("Outdoor No-argument constructor");
	}

	public Outdoor(int duration) {
		this.duration=duration;
		System.out.println("Outdoor 1 argument constructor");
	}

}
