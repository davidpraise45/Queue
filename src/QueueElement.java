/**
 *
 * @author David
 */
public class QueueElement {

        // Global variables
        int value;
        QueueElement next;

        // Constructors
        QueueElement(int value) {
            this.value = value;
            this.next = null;
        }

        // Getters and Setters
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public QueueElement getNext() {
            return next;
        }

        public void setNext(QueueElement next) {
            this.next = next;
        }
}
