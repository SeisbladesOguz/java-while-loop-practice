import java.util.Scanner;
public class whileLoops {
	public static void main (String [] args) {
		double averageScore = 0;
		double sum = 0;
		int count = 0; //Think of this as a limiting/control variable for the loop.
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter -1 when you need quit: ");
		int grade = in.nextInt(); //Priming read.
		
		while (grade !=-1) {
			sum = sum + grade;
			count++;
			System.out.println("Please enter -1 when you need quit: ");
			grade = in.nextInt();
		}
		   
			if(count !=0) {
				averageScore = (double) sum / count;			
		 }
			System.out.println("The average is: " + averageScore);
		
		in.close();
	  
	}
}





