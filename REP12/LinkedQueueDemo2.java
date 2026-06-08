public class LinkedQueueDemo2 {
    public static void main(String[] args) {
        LinkedQueue2<String> q = new LinkedQueue2<String>();
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

        System.out.println("Is the queue empty? " + q.isEmpty());
        q.clearQueue();
        System.out.println("Queue cleared.");
        System.out.println("Is the queue empty? " + q.isEmpty());
    }
}
