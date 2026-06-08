public class LinkedQueue2<T> {
    private class Node {
        T item;
        Node next;

        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node front;
    private int count;

    public LinkedQueue2(){
        front = null;
        count = 0;
    }

    public void addToQueue(T item){
        Node newNode = new Node(item);

        if(front == null){
            front = newNode;
        } else {
            Node current = front;

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }

        count++;
    }

    public T removeFromQueue(){
        if(front == null){
            return null;
        }

        T removed = front.item;
        front = front.next;
        count--;

        return removed;
    }

    public void showQueue(){
        Node current = front;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public int length(){
        return count;
    }

    public void clearQueue(){
        while(!isEmpty()){
            removeFromQueue();
        }
    }

    public boolean isEmpty(){
        return count == 0;
    }

}