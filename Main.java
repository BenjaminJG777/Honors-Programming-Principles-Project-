import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice = 0;

        // main loop keeps program running until user exits
        while (choice != 6) {
            System.out.println("\n--- Task Tracker Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Summary");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            // simple input validation using try-catch
            try {
                choice = input.nextInt();
                input.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number (1-6).");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = input.nextLine();

                    System.out.print("Due (MM/DD): ");
                    String d = input.nextLine();

                    int p = 0;

                    while (true) {
                        System.out.print("Priority (1-5): ");

                        if (!input.hasNextInt()) {
                            System.out.println("Enter a valid number.");
                            input.next();
                            continue;
                        }

                        p = input.nextInt();

                        if (p >= 1 && p <= 5) {
                            break;
                        } else {
                            System.out.println("Priority must be between 1 and 5.");
                        }
                    }

                    manager.addTask(t, d, p);
                    break;

                case 2:
                    manager.showTasks();
                    break;

                case 3:
                    manager.showTasks();

                    int num;

                    while (true) {
                        System.out.print("Enter number to complete: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Enter a valid number.");
                            input.next();
                            continue;
                        }

                        num = input.nextInt();
                        break;
                    }

                    manager.markDone(num - 1);
                    break;

                case 4:
                    manager.showTasks();

                    int removeIndex;

                    while (true) {
                        System.out.print("Enter number to remove: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Enter a valid number.");
                            input.next();
                            continue;
                        }

                        removeIndex = input.nextInt();
                        break;
                    }

                    manager.removeTask(removeIndex - 1);
                    break;

                case 5:
                    manager.showSummary();
                    break;

                case 6:
                    System.out.println("System exiting.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}