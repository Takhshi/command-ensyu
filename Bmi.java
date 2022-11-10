import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("height(m):");
		double height1 = sc.nextDouble();
		System.out.print("weight(kg):");
		double weight1 = sc.nextDouble();
                double bmi1 = weight1 / (height1 * height1);
		System.out.println("1人目のBMI:"+((double)Math.round(bmi1 * 100))/100);

                System.out.print("height(m):");
                double height2 = sc.nextDouble();
                System.out.print("weight(kg):");
                double weight2 = sc.nextDouble();
		double bmi2 = weight2 / (height2 * height2);
		System.out.println("2人目のBMI:"+((double)Math.round(bmi2 * 100))/100);
	}
}
