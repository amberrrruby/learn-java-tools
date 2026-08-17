package taskmanager;

import java.util.ArrayList;
import java.util.List;

/** Manages a collection of tasks. */
public class TaskManager {
  private final List<Task> tasks = new ArrayList<>();
  private int nextId = 1;

  public void addTask(final String title) {
    tasks.add(new Task(nextId++, title));
  }

  /**
   * Marks the task with the given id as completed.
   *
   * @param id the id of the task to complete
   */
  public void completeTask(final int id) {
    for (Task task : tasks) {
      if (task.getId() == id) {
        task.setCompleted(true);
        return;
      }
    }
  }

  public List<Task> getTasks() {
    return tasks;
  }
}
