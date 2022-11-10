import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("height(m):");
		double height = sc.nextDouble();
		System.out.print("weight(kg):");
		double weight = sc.nextDouble();

                double bmi = weight / (height * height);

                System.out.println("BMI:"+((double)Math.round(bmi * 100))/100);
	}
}
