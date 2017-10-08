import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {

    public Scanner scan = new Scanner(System.in);
    public int maxEntry = 10;

    // Collecting Users Inputs,
    public void Value(Queue queue, boolean loop) {
        System.out.println("Enter 10 number less than 100");
        loop = true;
        int start = 0;
        while (maxEntry > 0 && loop) { // Loop = true
            int currentEntry = scan.nextInt();
            if (currentEntry >= 100) {
                System.out.println("Input an Integer Number Less than 100...");
            } else {
                queue.add(currentEntry);
                if (queue.size == maxEntry) { // if it's false, loop = false
                    loop = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Main a = new Main();
        Queue queue = new Queue();

        // Inputing Elements into an array.
        a.Value(queue, true);

        // Print Out all Elements from the Queue and reverse copy.
        queue.getValues();

        //Returns Maximum number in Index form.
        int pair[] = queue.horizontalSearch(); // The array is written to and never read from.
        System.out.println("Max. Element in the Queue: " + pair[1] + " Its index is: " + pair[0]);

    }
}
