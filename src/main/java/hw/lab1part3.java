import java.util.Scanner;
import org.junit.Assert;

public class lab1part3 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);

	   System.out.println("Please enter a number and I will make a Fizz buzz sequence for you");
       int n = keyboard.nextInt();
       String []a = new String[n];
	   a = fizztest(n);
	   for (int i = 0; i < a.length; i++) {
		   System.out.println(a[i]);
	   }
    }
	public static String[] lab1part3test(int n){
        int i;
		String [] output = new String [n];
        for(i=1; i < n+1; i++) {
             if(i % 15 == 0){
                 output[i-1] = "fizzbuzz";
            }
             else if((i % 5) == 0){
                 output[i-1] = "buzz";
             }
             else if(( i % 3) == 0){
                 output[i-1] = "fizz";
             }
             else{
                 output[i-1] = i + "";
             }
         }
		 return output;
	}
}
