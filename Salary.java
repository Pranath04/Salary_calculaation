package Salary_calculator;

import java.util.Scanner;

public class Salary{
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[7];
		int salary=0;
		int total_hours=0;
		for(int i=0;i<7;i++) {
			arr[i]=scan.nextInt();
			total_hours+=arr[i];
		}
		for(int i=1;i<6;i++) {
			if(arr[i]<=8) {
				salary+=arr[i]*100;
			}
			else {
				salary+=(arr[i]*100)+(arr[i]-8)*15;
			}
		}
		salary+=(arr[0]*100)+(arr[0]*100)*0.50;
		salary+=(arr[6]*100)+(arr[6]*100)*0.25;
		
			if(total_hours>40) {
				salary+=((total_hours-40)*25);
			}
		
		System.out.println(salary);
		
		
	}
}