package Epam;

import java.util.Scanner;

public class Calci{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob = new Calculator();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter your choice:\n"
				+ "1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
		int op = sc.nextInt();
		switch(op){
		case 1: x=ob.addition(a, b);
		        break;
		case 2: x=ob.subtract(a, b);
		        break;
		case 3: x=ob.multiply(a, b);
		        break;
		case 4: x=ob.divide(a, b);
		        break;
		default:System.out.println("Error!Enter correct choice");        
		}
		System.out.println(x);
	}
}
