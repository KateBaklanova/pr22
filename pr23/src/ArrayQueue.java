import java.util.Arrays;

public class ArrayQueue extends AbstractQueue{
    static int SIZE = 5;
    static Object items[] = new Object[SIZE];
    static int front, rear;
    ArrayQueue() {
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

    public void enQueue(Object element) {
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

    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
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
            return (element);
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " +
                    front);
            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            // display the rear of the queue
            System.out.println("\nRear index-> " +
                    rear);
        }
    }

    public void clear() {
        while (!isEmpty()) {
            deQueue();
        }
    }
}

