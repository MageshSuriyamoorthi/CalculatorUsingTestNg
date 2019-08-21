package com.atmecs.task;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Calc {
	Scanner s = new Scanner(System.in);

	@Test (priority=0)
	public void addition() {
		System.out.println("Enter how many values to Add");
		int count;
		count = s.nextInt();
		System.out.println("Enter the values");
		double initialNo, finalInteger = 0;
		for (int i = 0; i < count; i++) {
			initialNo = s.nextInt();
			finalInteger = finalInteger + initialNo;
		}
		System.out.println("Addition:" + finalInteger);
	}

	@Test (priority=1)
	public void subtract() {
		System.out.println("Enter how many values to Subtract");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 0;
		System.out.println("Enter the values");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger - InitialNo;
		}
		if(finalInteger==0 || finalInteger>0)
		{
		System.out.println("Subtraction:" + finalInteger);
		}
	}

	@Test (priority=2)
	public void mul() {
		System.out.println("Enter how many values to multiply");
		int count;
		count = s.nextInt();
		double InitialNo = 0, finalInteger = 1;
		System.out.println("Enter the numbers");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger * InitialNo;
		}
		System.out.println("Multliplication:" + finalInteger);
	}

	@Test (priority=3)
	public void div() {
		System.out.println("Enter how many values to Divide");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 1;
		System.out.println("Enter the values");
		for (int i = 0; i < count; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger / InitialNo;
		}
		System.out.println("Division:" + finalInteger);
	}

	@Test (priority=4)
	public void mod() {
		System.out.println("Enter how many values to modulus");
		int count;
		count = s.nextInt();
		double InitialNo, finalInteger = 0;
		System.out.println("Enter the values");
		finalInteger = s.nextInt();
		for (int i = 0; i < count - 1; i++) {
			InitialNo = s.nextInt();
			finalInteger = finalInteger % InitialNo;
		}
		System.out.println("Modulus:" + finalInteger);

	}

	@Test (priority=5)
	public void sq() {
		System.out.println("enter the no. to sq ");
		double count = 0;
		count = s.nextInt();

		System.out.println(Math.sqrt(count));

	}
}
