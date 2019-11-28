package assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestOrder {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);//initializing a scanner
	
		System.out.println("Please enter four integers: ");//user prompt

		//storing the integer values in 4 integer variables
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();
		
		//order of integers check
		if((i1>i2)&&(i2>i3)&&(i3>i4)){
			System.out.println("Descending");
		}else if ((i4>i3)&&(i3>i2)&&(i2>i1)) {
			System.out.println("Ascending");
		}else {
			System.out.println("Not-ordered");
		}
}
}

