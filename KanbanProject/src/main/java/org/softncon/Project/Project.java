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



}
