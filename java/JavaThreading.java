////////////////////////////////////////////////////////////////////////
/// CSU - 24SC - CSC450: Programming III - Portfolio Project - Java  ///
/// Author: Jeffrey D. Bothel                                        ///
/// Date: 2024-07-07                                                 ///
////////////////////////////////////////////////////////////////////////

public class JavaThreading {

    // Implementing a class that increments a value supplied
    public static class IncThread implements Runnable {
        private int value;

        public IncThread(int value) {
            this.value = value;
        }

        public void run() {
            // Incrementing the value of what was input as a static 20
            while(value < 20) {
                this.value++;
                System.out.print("Incrementing: " + this.value + "\n");
            }
        }

        public int getValue() {
            return this.value;
        }
    }

    // Implementing a class that decrements a value supplied
    public static class DecThread implements Runnable {
        private int value;

        public DecThread(int value) {
            this.value = value;
        }

        public void run() {
            // Decrementing the value of what was input down to 0
            while(value > 0) {
                this.value--;
                System.out.print("Decrementing: " + this.value + "\n");
            }
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        // Introducing the program
        System.out.print("\nCSU - 24SC - CSC450: Programming III - Portfolio Java\n");
        System.out.print("Author: Jeffrey D. Bothel\n");

        // Declaring the value to be incremented and decremented
        int value = 0;
        System.out.print("\nValue before incrementing: " + value + "\n");

        // Creating the threads to increment and decrement the value
        IncThread incThread = new IncThread(value);
        incThread.run();
        value = incThread.getValue();
        System.out.print("\nValue after incrementing: " + value + "\n");

        // Creating the threads to decrement the value
        DecThread decThread = new DecThread(value);
        decThread.run();
        value = decThread.getValue();
        System.out.print("Value after decrementing: " + value + "\n");
    }
}