import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int numberGuessed = 0;

        // BufferReader reads in a line (String)
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        while(number != numberGuessed){
            System.out.println("Hello User, guess a number.");
            // Validating the input
            // *TRIES* to parse an integer
            // *CATCHES* an error if it happens
            try {
                // Records number that you put in
                numberGuessed = Integer.parseInt(bfn.readLine());
            }
            catch(Exception e) {
                System.out.println("You entered a non-numeric value. Try again. (You shall be fined)");
            }
            if(numberGuessed < number){
                System.out.println("Your guess is lower try again");
            } else if(numberGuessed > number) {
                System.out.println("Your guess is too high. Try again.");
            } else{
                System.out.println("You got it! Good job!");
            }
        }
    }
}



