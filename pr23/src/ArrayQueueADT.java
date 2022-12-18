import java.util.Arrays;

public class ArrayQueueADT implements Queue {
    // ADT реализуется через интерфейс
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    ArrayQueueADT() {
        front = -1;
        rear = -1;
    }
    public boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    public void clear() {
        while (!isEmpty()) {
            deQueue();
        }
    }
    public void deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
        }
    }
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " +
                    front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " +
                    rear);
        }
    }
}
