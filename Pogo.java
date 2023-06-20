package com.xworkz.constructor.things;

public class Pogo {
	public String type;
	public int numOfShows;
	public String animation;
	public String founder;
	public String durationOfEachShow;
	public int viewers;
	public int charge;
	public boolean service;
	public String subscribers;
	public String mode;
	
	public Pogo() {
		System.out.println("No-Argument constructor");
	}
	
	public Pogo(String type,int numOfShows,String animation,String founder,String durationOfEachShow,
			int viewers,int charge,boolean service,String subscribers,String mode) {
		System.out.println("All-Argument constructor");
		this.type=type;
		this.numOfShows=numOfShows;
		this.animation=animation;
		this.founder=founder;
		this.durationOfEachShow=durationOfEachShow;
		this.viewers=viewers;
		this.charge=charge;
		this.service=service;
		this.subscribers=subscribers;
		this.mode=mode;
	}
	
	public void watch() {
		System.out.println("Watch method");
	}
	public void listen() {
		System.out.println("Listen method");
	}
    public void entertainment() {
    	System.out.println("Entertainment method");
    }
    public void learn() {
    	System.out.println("Learn method");
    }
    public void enjoy() {
    	System.out.println("Enjoy method");
    }
}
