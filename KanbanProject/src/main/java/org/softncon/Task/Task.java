package org.softncon.Task;

import org.softncon.User.User;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String Id;
    private String Description;
    private User createdBy;
    private User assignedTo;
    private User reviewedBy;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;
    private TaskStatus status;


}
