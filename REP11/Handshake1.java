
public class Handshake1 {
    public static int handshake(int n){
        if(n <= 1) return 0;
        else if(n == 2) return 1;
        else {
            return handshake(n - 1) + (n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Total handshakes for " + n + " people: " + handshake(n));
    }
}