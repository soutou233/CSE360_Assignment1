package cse360assignment02;

public class AddingMachine {
    private int total;
    private StringBuffer record; // Buffer which records all the operation action.

    public static void main(String[] args) {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        myCalculator.toString();

    }

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        record = new StringBuffer("0");
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total+=value;
        record.append(" + " + value);
    }

    public void subtract (int value) {
        total-=value;
        record.append(" - " + value);
    }



    public String toString () {
        System.out.println(record);// Print out the operations
        return "";
    }

    public void clear() {
    }
}