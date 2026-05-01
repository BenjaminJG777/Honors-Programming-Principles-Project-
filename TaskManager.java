import java.util.ArrayList;

public class TaskManager {
    // stores all tasks 
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // adds a new task to the list
    public void addTask(String title, String dueDate, int priority) {
        tasks.add(new Task(title, dueDate, priority));
        System.out.println("Task added.");
    }

    // displays all tasks currently in the list
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks currently in the system.");
            return;
        }

        System.out.println("\n--- Current Task List ---");

        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).displayTask(i + 1);
        }
    }

    // marks a task as completed if the number is valid
    public void markDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Task marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // removes a task from the list
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // shows how many tasks are done vs not done
    public void showSummary() {
        int completed = 0;

        // count completed tasks
        for (Task t : tasks) {
            if (t.isCompleted()) {
                completed++;
            }
        }

        System.out.println("\n--- Progress Summary ---");
        System.out.println("Total: " + tasks.size()
                + " | Done: " + completed
                + " | Pending: " + (tasks.size() - completed));
    }
}
