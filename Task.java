public class Task {
    private String title;
    private String dueDate;
    private int priority;
    private boolean isCompleted;

    // Constructor for Object Creation
    public Task(String title, String dueDate, int priority) {
        this.title = title;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = false;
    }

    // getters and setters 
    public String getTitle() { return title; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { this.isCompleted = completed; }

    // This is the method to display task details with string formatting
    public void displayTask(int id) {
        String status = isCompleted ? "[X]" : "[ ]";
        System.out.printf("%d. %s %-15s | Due: %-8s | Priority: %d\n", 
                          id, status, title, dueDate, priority);
    }
}
