import java.util.Random;

public class Price {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1;

        // Print the random number
        System.out.println("Random Number: " + randomNumber);
    }
}
