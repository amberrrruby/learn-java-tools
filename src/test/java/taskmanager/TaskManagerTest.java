package taskmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskManagerTest {

  @Test
  void addingTaskIncreasesListSize() {
    TaskManager manager = new TaskManager();
    manager.addTask("Buy groceries");
    assertEquals(1, manager.getTasks().size());
  }

  @Test
  void completingTaskSetsCompletedFlag() {
    TaskManager manager = new TaskManager();
    manager.addTask("Buy groceries");
    int id = manager.getTasks().get(0).getId();
    manager.completeTask(id);
    assertTrue(manager.getTasks().get(0).isCompleted());
  }

  @Test
  void completingNonExistentIdDoesNothing() {
    TaskManager manager = new TaskManager();
    manager.addTask("Buy groceries");
    assertDoesNotThrow(() -> manager.completeTask(999));
    assertFalse(manager.getTasks().get(0).isCompleted());
  }

  @Test
  void getTasksReturnsAllTasksRegardlessOfStatus() {
    TaskManager manager = new TaskManager();
    manager.addTask("Task A");
    manager.addTask("Task B");
    manager.completeTask(1);
    assertEquals(2, manager.getTasks().size());
  }

  @Test
  void getTasksOnEmptyManagerReturnsEmptyList() {
    TaskManager manager = new TaskManager();
    assertNotNull(manager.getTasks());
    assertTrue(manager.getTasks().isEmpty());
  }
}
