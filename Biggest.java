//create a class biggest that contains a single dimensional array as a data member and a method display()to find display the largest element of array
class Biggest {

    private int[] num;

    // Constructor to initialize the array
    public Biggest(int[] numbers) {
        this.num = numbers;
    }

    // Method to find and display the
    // largest element in the array
    public void display() {
        if (num== null || num.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int l = num[0];
        for (int n : num) {
            if (n > l) {
                l = n;
            }
        }
        System.out.println("The largest element in the array is: " + l);
    }

    // Main method to test the Biggest class
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 25};
        Biggest b = new Biggest(arr);
        b.display();
    }
}