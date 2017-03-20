package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	private static int avg;
	private static ArrayList<Staff> employees = new ArrayList();
	
	@BeforeClass
	public static void setup() {
		double sum = 0;
		Date g = new Date(2500, 1, 4);
		Date nu = null;
		Staff a = new Staff(" ", " ", " ", nu, " ", " ", " ", " ", 0, 50, nu, null);
		employees.add(a);
		Staff b = new Staff(" ", " ", " ", nu, " ", " ", " ", " ", 0, 100, nu, null);
		employees.add(b);
		Staff c = new Staff(" ", " ", " ", nu, " ", " ", " ", " ", 0, 150, nu, null);
		employees.add(c);
		Staff d = new Staff(" ", " ", " ", nu, " ", " ", " ", " ", 0, 200, nu, null);
		employees.add(d);
		Staff e = new Staff(" ", " ", " ", nu, " ", " ", " ", " ", 0, 250, nu, null);
		employees.add(e);
		for(Staff h : employees){
			sum+=h.getSalary();
		}
		avg = (int) (sum/5);
	}
	@Test
	public void test() {
		assertEquals(avg,150);
	}
	@Test
	public void test2(){
		Date g = new Date(2500, 1, 4);
		Date k = new Date(2017, 1, 4);
		Staff a = new Staff(" ", " ", " ", k, " ", " ", " ", " ", 0, 50, k, null);
		assertEquals(a.setDOB(g),true);
	}

}
