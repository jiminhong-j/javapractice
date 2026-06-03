
public class Handshake2 {
    public static int handshake(int n){
        if(n <= 1) return 0;
        else if(n == 2) return 1;
        else {
            System.out.println("Calculating handshake for " + n + " people...");
            return handshake(n - 1) + (n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        if(n < 2){
            System.out.println("The number of people should be 2 or more.");
        } else {
            System.out.println("Total handshakes for " + n + " people: " + handshake(n));
        }
    }
}