class NumberOperations implements FizzBuzz {
    public void print(int from, int to) {
        int counter;
        boolean isPrinted;

        counter = from;
        isPrinted = false;
        while (counter >= 1 && counter <= to) {
            isPrinted = false;
            if (counter % 3 == 0) {
                System.out.print("Fizz");
                isPrinted = true;
            }
            if (counter % 5 == 0) {
                System.out.print("Buzz");
                isPrinted = true;
            }
            if (!isPrinted)
                System.out.print(counter);
            System.out.println("");
            counter++;
        }
    }
}