package com;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calculate=new Calculate();
		calculate.add(12, 43);
		calculate.sub(43,12);
		calculate.multiply(3,4);
		calculate.divide(10, 2);
	}
}
class Calculate
{
	void add(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println("Addition output is "+result);
	}
	void sub(int num1,int num2)
	{
		int result=num1-num2;
		System.out.println("Subtraction output is "+result);
	}
	void multiply(int num1,int num2)
	{
		int result=num1*num2;
		System.out.println("Multiplication output is "+result);
	}
	void divide(int num1,int num2)
	{
		int result=num1/num2;
		System.out.println("Division output is "+result);
	}
}
//WAP (Write a program) to create 4 methods 1 addition 2 subtraction 3 multiplication 4 division
//non static in a separate class