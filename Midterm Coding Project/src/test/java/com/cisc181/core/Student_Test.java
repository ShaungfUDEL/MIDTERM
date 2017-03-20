package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private static int GradePoints = 0;
	@BeforeClass
	public static void setup() {
		ArrayList<Course> courses = new ArrayList();
		ArrayList<Semester> semesters = new ArrayList();
		ArrayList<Section> sections = new ArrayList();
		ArrayList<Student> students = new ArrayList();
		Date y = new Date(2016, 9, 10);
		Date u = new Date(2016,12,17);
		Date j = new Date(2017, 1, 06);
		Date k = new Date(2017, 5,24);
		Course a = new Course(UUID.randomUUID(),"Economics",3, eMajor.BUSINESS);
		Course b = new Course(UUID.randomUUID(),"Theorictal Physics",4, eMajor.PHYSICS);
		Course c = new Course(UUID.randomUUID(),"CISC 181",4, eMajor.COMPSI);
		Semester d = new Semester(UUID.randomUUID(),y,u);
		Semester f = new Semester(UUID.randomUUID(),j,k);
		Section g = new Section(a.getCourseID(),d.getSemesterID(),UUID.randomUUID(),100);
		Section e = new Section(a.getCourseID(),f.getSemesterID(),UUID.randomUUID(),210);
		Section w = new Section(b.getCourseID(),d.getSemesterID(),UUID.randomUUID(),178);
		Section q = new Section(b.getCourseID(),f.getSemesterID(),UUID.randomUUID(),115);
		Section n = new Section(c.getCourseID(),d.getSemesterID(),UUID.randomUUID(),130);
		Section m = new Section(c.getCourseID(),f.getSemesterID(),UUID.randomUUID(),320);
		Student bill = new Student("Bill","Gregory","Gander", u, eMajor.CHEM, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student bil = new Student("Bill","Gregory","Gander", u, eMajor.COMPSI, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student big = new Student("Bill","Gregory","Gander", u, eMajor.BUSINESS, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student bob = new Student("Bill","Gregory","Gander", u, eMajor.BUSINESS, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student bass = new Student("Bill","Gregory","Gander", u, eMajor.NURSING, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student burg = new Student("Bill","Gregory","Gander", u, eMajor.PHYSICS, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student bort = new Student("Bill","Gregory","Gander", u, eMajor.BUSINESS, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student jack = new Student("Bill","Gregory","Gander", u, eMajor.NURSING, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student frank = new Student("Bill","Gregory","Gander", u, eMajor.CHEM, "Blah", "732-856-9504","Don'tCare@gmail.com");
		Student randy = new Student("Bill","Gregory","Gander", u, eMajor.CHEM, "Blah", "732-856-9504","Don'tCare@gmail.com");
		randy.setMajor(eMajor.COMPSI);
		courses.add(a);
		courses.add(b);
		courses.add(c);
		semesters.add(d);
		semesters.add(f);
		sections.add(g);
		sections.add(e);
		sections.add(w);
		sections.add(q);
		sections.add(n);
		sections.add(m);
		students.add(bill);
		students.add(bil);
		students.add(big);
		students.add(bob);
		students.add(bass);
		students.add(burg);
		students.add(bort);
		students.add(jack);
		students.add(frank);
		students.add(randy);
		for(Course o : courses){
			GradePoints += o.getGradePoints()*2;
		}
		
	}

	@Test
	public void test() {
		Student bill = new Student("Bill","Gregory","Gander", new Date(2016, 14, 5), eMajor.CHEM, "Blah", "732-856-9504","Don'tCare@gmail.com");
		bill.addGradeValue(4.0);
		bill.addGradeValue(3.5);
		bill.addGradeValue(4.0);
		bill.addGradeValue(3.5);
		bill.addGradeValue(3.0);
		bill.addGradeValue(4.0);
		
	}
}