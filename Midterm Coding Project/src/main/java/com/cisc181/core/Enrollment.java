package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollementID;
	private double Grade;
	
	private Enrollment(){}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollementID = UUID.randomUUID();
	}
	
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}
}
