package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Exam;

public class ExamRunner {
public static void main(String args[]) {
	Exam exam1 = new Exam();
	Exam exam2 = new Exam("Aptitude","MCQ",100,true,1000);

if(exam2 !=null) {
	System.out.println("Object is not null");
}
exam2.displayStaff();
}
}