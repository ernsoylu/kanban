package org.softncon.Project;
import org.softncon.Task.Task;
import org.softncon.User.User;

import java.time.*;
import java.util.ArrayList;

public class Project {
    private String Name;
    private String Id;
    private LocalDateTime creationTime;
    private LocalDateTime dueDate;
    private User createdBy;
    private ArrayList<Task> projectTasks;

    public Project(String id, String name, User user, LocalDateTime dueDate) {
        this.Id = id;
        this.Name = name;
        this.creationTime = LocalDateTime.now();
        this.createdBy = user;
        this.dueDate = dueDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public void addTask(Task task){
        this.projectTasks.add(task);
    }

    public void removeTask(Task task){

    }

    public ArrayList<Task> listTasks(){
        return this.projectTasks;
    }
}
