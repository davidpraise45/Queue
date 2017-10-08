/**
 *
 * @author David
 */
public class Queue {

    // Global Variables
    private QueueElement first; // Top
    private QueueElement last; // Bottom
    int size;

    // Constructor
    public Queue() {
        first = last = null;
        size = 0;
    }

    // Methods
    // Add integers to the Queue.
    public void add(int x) {
        QueueElement queue = new QueueElement(x);
        if (isEmpty()) {
            first = last = queue;
        } else {
            last.next = queue;
            last = queue;
        }
        this.size++;
    }

    // Display the first number in the Queue.
    public int peek() {
        return first.value;
    }

    // Remove an Element in a Queue 'FIFO'.
    public void remove() {
        if (isEmpty()) { // Check if first and last == null.
            throw new NullPointerException("The queue is Empty.");
        } else {
            poll(); // Call the "pop" method to remove
        }
    }

    // Removes the first Element in the Queue.
    public void poll() {
        QueueElement remove;
        remove = first;
        first = first.next;
        this.size--;
        System.out.println("The value " + remove.value + " was removed.");
    }

    // Check if the Queue is Empty.
    public boolean isEmpty() {
        return this.first == null;
    }

    // Returns the size of the Queue. From 1-n.
    public int getSize() {
        return this.size;
    }

    // Print the reverseColl and the printQueue.
    public void getValues() {
        int[] out = new int[size];
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
        } else {
            QueueElement current = this.first;
            for (int i = size - 1; i >= 0; i--) {
                out[i] = current.value;
                current = current.next;
            }
            printQueue(out);
            reverseCollection(out);
        }
    }

    // Print out all Elements from an Array in Reversed Order.
    public void reverseCollection(int[] x) {
        System.out.println("Reverse copy of the Queue!");
        System.out.print("[ ");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }

    // Print ArrayElements in Ascending Order.
    public void printQueue(int[] x) {
        System.out.println("The Queue: ");
        System.out.print(" => { ");
        for (int a : x) {
            System.out.print(a + " ");
        }
        System.out.print("} => ");
    }

    // Print the Queue.
    public void print() {
        System.out.print("{ ");
        for (QueueElement queue = first; queue != null; queue = queue.next) {
            System.out.print(queue.value + " ");
        }
        System.out.println("}");
    }

    // Compares two numbers and picks the greatest then test them with other.
    public int[] horizontalSearch() {
        QueueElement current = this.first;
        int pairValue[] = new int[2];
        int index = 0;
        if (isEmpty()) {
            pairValue[0] = 0;
            pairValue[1] = 0;
            return pairValue;
        } else {
            for (int i = size - 1; i > 0; i--) {
                if (current.next.value > current.value) {
                    current = current.next;
                    index = i;
                } else {
                    current.next = current.next.next;
                }
            }
            pairValue[0] = index; // Stores my index;
            pairValue[1] = current.value; // Stores myVar.
            return pairValue;
        }
    }

    // Return the maximum number.
    public int getMax() {
        return horizontalSearch()[1];
    }

    // Returns the index of the maximum number.
    public int getIndex() {
        return horizontalSearch()[0];
    }
}