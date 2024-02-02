import java.util.Scanner;

class NotesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        calculateNotes(amount);
    }

    static void calculateNotes(int amount) {
        int noteCount;

        // Checking the amount in various denominations using switch case
        switch (amount) {
            case 2000:
                noteCount = amount / 2000;
                System.out.println("Number of 2000 notes: " + noteCount);
                break;

            case 500:
                noteCount = amount / 500;
                System.out.println("Number of 500 notes: " + noteCount);
                break;

            case 200:
                noteCount = amount / 200;
                System.out.println("Number of 200 notes: " + noteCount);
                break;

            case 100:
                noteCount = amount / 100;
                System.out.println("Number of 100 notes: " + noteCount);
                break;

            case 50:
                noteCount = amount / 50;
                System.out.println("Number of 50 notes: " + noteCount);
                break;

            case 20:
                noteCount = amount / 20;
                System.out.println("Number of 20 notes: " + noteCount);
                break;

            case 10:
                noteCount = amount / 10;
                System.out.println("Number of 10 notes: " + noteCount);
                break;

            default:
                System.out.println("Invalid amount or unsupported denomination.");
        }
    }
}
