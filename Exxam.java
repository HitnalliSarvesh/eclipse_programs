package com.xworkz.instancemethod.things;

public class Exxam {
	private String typeOfExam;
	private int duration;
	private String date;
	private int numberOfQuestions;
	private String examName;
	private int candidates;
	private boolean negative;
	private int score;
	
	public Exxam() {
		System.out.println("No-Argument constructor");
	}
	public Exxam(String typeOfExam,int duration,String date,int numberOfQuestions,String examName,int candidates,boolean negative,int score) {
		System.out.println("All-Argument constructor");
		this.typeOfExam=typeOfExam;
		this.duration=duration;
		this.date=date;
		this.numberOfQuestions=numberOfQuestions;
		this.examName=examName;
		this.candidates=candidates;
		this.negative=negative;
		this.score=score;
		
	}
	public void setTypeOfExam(String typeOfExam) {          
		this.typeOfExam=typeOfExam;
	}
	public String getTypeOfExam() {
		return typeOfExam;
	}
	public void setDuration(int duration) {          
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDate(String date) {          
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	public void setNumberOfQuestions(int numberOfQuestions) {          
		this.numberOfQuestions=numberOfQuestions;
	}
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	public void setExamName(String examName) {          
		this.examName=examName;
	}
	public String getExamName() {
		return examName;
	}
	public void setCandidates(int candidates) {          
		this.candidates=candidates;
	}
	public int getCandidates() {
		return candidates;
	}
	public void setNegative(boolean negative) {          
		this.negative=negative;
	}
	public boolean isNegative() {
		return negative;
	}
	public void setScore(int score) {          
		this.score=score;
	}
	public int getScore() {
		return score ;
	}
	
	//Methods
	public void writing() {
		System.out.println("This is writing method");
	}
	
	public String result(int score) {
		
		if(score>100) {
			return "Invalid";
		}if(score>=35) {
			return "Pass";
		}else {
			return "Fail";
		}
	}
	public int getTotalScore(int numberOfAns) {
		return numberOfAns*2;
	}

}
