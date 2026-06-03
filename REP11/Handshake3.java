import java.util.Scanner;

public class Handshake3 {
    public static int handshake(int n){
        if(n <= 1) return 0;
        else if(n == 2) return 1;
        else {
            return handshake(n - 1) + (n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        String again;

        do {
            System.out.print("Enter the number of people in the room: ");
            n = s.nextInt();

            if(n < 2){
                System.out.println("The number of people should be 2 or more.");
            } else {
                System.out.println("Total handshakes for " + n + " people: " + handshake(n));
            }

            System.out.print("Do you want to play again? (yes/no): ");
            again = s.next();
        } while(again.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");

        s.close();
    }
}