import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice = 0;

        // Iteration (Main Program Loop)
        while (choice != 5) {
            System.out.println("\n--- Task Tracker Menu ---");
            System.out.println("1. Add Task\n2. View Tasks\n3. Complete Task\n4. Summary\n5. Exit");
            System.out.print("Select an option: ");

            // Basic Exception Handling/Input Validation
            if (!input.hasNextInt()) {
                System.out.println("Error: Please enter a valid number (1-5).");
                input.next(); // Clear invalid input
                continue;
            }
            
            choice = input.nextInt();
            input.nextLine(); // Clear buffer

            // Decision-making
            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = input.nextLine();
                    System.out.print("Due (MM/DD): ");
                    String d = input.nextLine();
                    System.out.print("Priority (1-5): ");
                    int p = input.nextInt();
                    manager.addTask(t, d, p);
                    break;
                case 2:
                    manager.showTasks();
                    break;
                case 3:
                    manager.showTasks();
                    System.out.print("Enter number to complete: ");
                    int num = input.nextInt();
                    manager.markDone(num - 1);
                    break;
                case 4:
                    manager.showSummary();
                    break;
                case 5:
                    System.out.println("System exiting.");
                    break;
            }
        }
        input.close();
    }
}
