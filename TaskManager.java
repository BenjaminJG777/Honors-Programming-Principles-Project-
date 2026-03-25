import java.util.ArrayList;

public class TaskManager {
    // ArrayList for dynamic data storage
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Modular Method Design
    public void addTask(String title, String dueDate, int priority) {
        tasks.add(new Task(title, dueDate, priority));
    }

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

    public void markDone(int index) {
        // Selection logic for validation
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Task marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void showSummary() {
        int completed = 0;
        // Iteration through the list
        for (Task t : tasks) {
            if (t.isCompleted()) completed++;
        }
        System.out.println("\n--- Progress Summary ---");
        System.out.println("Total: " + tasks.size() + " | Done: " + completed + " | Pending: " + (tasks.size() - completed));
    }
}
