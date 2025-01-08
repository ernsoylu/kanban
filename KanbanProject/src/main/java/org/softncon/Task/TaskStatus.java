package org.softncon.Task;

import java.util.ArrayList;

public class TaskStatus {
    private int Id;
    private String TaskStatusName;
    private ArrayList<String> TaskStatusList;

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

    public void addStatusDefinition(String StatusName){
        TaskStatusList.add(StatusName);
    }

    public ArrayList<String> getTaskStatusList() {
        return TaskStatusList;
    }

    public void setTaskStatusList(ArrayList<String> taskStatusList) {
        TaskStatusList = taskStatusList;
    }
}
