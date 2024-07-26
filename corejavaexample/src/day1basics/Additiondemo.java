package day1basics;

import java.util.Scanner;

public class Additiondemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
		s.nextLine();
		
		System.out.println("enter the Trainer name:");
		String name;
		name=s.nextLine();
		
		c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" and c="+c);
		System.out.println("Tech Trainer:"+name);
	}

}
