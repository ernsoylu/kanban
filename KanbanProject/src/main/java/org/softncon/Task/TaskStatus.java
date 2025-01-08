package org.softncon.Task;

public class TaskStatus {
    private int Id;
    private String TaskStatusName;
    private String[] TaskStatusList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTaskStatusName() {
        return TaskStatusName;
    }

    public void setTaskStatusName(String taskStatusName) {
        TaskStatusName = taskStatusName;
    }

    public String[] getTaskStatusList() {
        return TaskStatusList;
    }

    public void setTaskStatusList(String[] taskStatusList) {
        TaskStatusList = taskStatusList;
    }
}
