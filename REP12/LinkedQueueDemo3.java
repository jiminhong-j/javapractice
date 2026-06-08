/*
 * LinkedQueueDemo.java
 *
 * Solution to Project 11
 */


public class LinkedQueueDemo3 {
    public static void main(String[] args) {
        LinkedQueue3<String> q = new LinkedQueue3<String>();
        q.addToQueue("One");
        q.addToQueue("Two");
        q.addToQueue("Three");
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");

        String data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue " + data);
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");

        System.out.println("Is the queue empty? " + q.isEmpty());

        data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue " + data);
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
        System.out.println("Is the queue empty? " + q.isEmpty());


        data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue " + data);
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
        System.out.println("Is the queue empty? " + q.isEmpty());



        data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue " + data);
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
        System.out.println("Is the queue empty? " + q.isEmpty());

        q.addToQueue("Four");
        System.out.println("\nAdded Four to end of queue ");
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");

        q.addToQueue("Five");
        System.out.println("\nAdded Five to end of queue ");
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
        
        System.out.println("Peek at the front item: " + q.peek());
        

        data = q.removeFromQueue();
        System.out.println("\nRemoved the front item from the queue " + data);
        System.out.println("Queue has " + q.length() +
                " entries.");
        System.out.println("Start of queue:");
        q.showQueue();
        System.out.println("End of queue.");
        System.out.println("Is the queue empty? " + q.isEmpty());
        System.out.println();
        
        System.out.println("Peek at the front item: " + q.peek());
        
        System.out.println();
        q.clearQueue();
        System.out.println("Queue cleared.");
        System.out.println("Is the queue empty? " + q.isEmpty());

    }
}

