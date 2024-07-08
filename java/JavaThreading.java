public class JavaThreading {

    public static class IncThread implements Runnable {
        private int value;

        public IncThread(int value) {
            this.value = value;
        }

        public void run() {
            while(value < 20) {
                this.value++;
                System.out.print("Incrementing: " + this.value + "\n");
            }
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class DecThread implements Runnable {
        private int value;

        public DecThread(int value) {
            this.value = value;
        }

        public void run() {
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
        System.out.print("CSU - 24SC - CSC450: Programming III - Portfolio Java\n");
        System.out.print("Author: Jeffrey D. Bothel\n");

        int value = 0;
        System.out.print("\nValue before incrementing: " + value + "\n");

        IncThread incThread = new IncThread(value);
        incThread.run();
        value = incThread.getValue();
        System.out.print("\nValue after incrementing: " + value + "\n");

        DecThread decThread = new DecThread(value);
        decThread.run();
        value = decThread.getValue();
        System.out.print("Value after decrementing: " + value + "\n");
    }
}