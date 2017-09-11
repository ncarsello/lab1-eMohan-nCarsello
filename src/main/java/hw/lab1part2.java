import java.util.Scanner;
public class lab1part2 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
  System.out.println("Please enter a number and I will make a Fizz buzz sequence for you");
       int n = keyboard.nextInt();
       int i;
       for(i=0; i < n; i++) {
            if(i % 15 == 0){
                System.out.println( "fizzbuzz");
           }
            else if((i % 5) == 0){
                System.out.println("buzz");
            }
            else if(( i % 3) == 0){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
