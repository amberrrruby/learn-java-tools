package taskmanager;

/** Represents a single task with a title and completion status. */
public class Task {
  private final int id;
  private final String title;
  private boolean completed;

  /**
   * Creates a new incomplete task with the given id and title.
   *
   * @param id the unique identifier for the task
   * @param title the title of the task
   */
  public Task(final int id, final String title) {
    this.id = id;
    this.title = title;
    this.completed = false;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(final boolean completed) {
    this.completed = completed;
  }
}
