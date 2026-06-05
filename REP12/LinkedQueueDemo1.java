public class LinkedQueueDemo1 {
    public static void main(String[] args) {
        LinkedQueue1<String> q = new LinkedQueue1<String>();
        q.addToQueue("One");
        q.addToQueue("Two");
        q.addToQueue("Three");
        System.out.println("Queue has " + q.length() + " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");

        String data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue: " + data);
        System.out.println("Queue has " + q.length() + " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
    }
}
