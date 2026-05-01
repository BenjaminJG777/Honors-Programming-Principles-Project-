public class Task {
    private String title;
    private String dueDate;
    private int priority;
    private boolean isCompleted;

    // creates a task when the user adds one
    public Task(String title, String dueDate, int priority) {
        this.title = title;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = false;
    }

    // getter methods
    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // updates completion status
    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    // displays task information in a cleaner format
    public void displayTask(int id) {
        String status = isCompleted ? "[X]" : "[ ]";

        System.out.printf(
            "%d. %s %-15s | Due: %-8s | Priority: %d\n",
            id,
            status,
            title,
            dueDate,
            priority
        );
    }
}