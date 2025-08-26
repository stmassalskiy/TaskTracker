package org;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Task {

    private int id; // id задачи
    private String title; // наименование задачи
    private String description; // описание задачи
    private Status status; //Текущий статус задачи
    private Priority priority; // Приоритет задачи
    private LocalDateTime createdAt; // дата создания
    private LocalDateTime updatedAt; // дата обновления

    private LocalDateTime dueAt; // Срок выполнения задачи
    private LocalDateTime completedAt; // Дата и время завершения задачи
    private User createdBy; // Пользователь, создавший задачу
    private User assignedTo; // Пользователь, на которого назначена задача
    private Project project; // Проект, к которому относится задача
    private int estimatedTime; // Оценочное время выполнения
    private int spentTime; // Фактически затраченное время в минутах

    private List<Tag> tags = new ArrayList<>(); // Список тегов, связанныгх с задачей
    private List<Comment> comments = new ArrayList<>(); // Список комментариев к задаче
    private Task parentTask; // Родительская задача (для иерархии подзадач)
    private List<Task> subTasks = new ArrayList<>(); //Список подзадач


    public Task(int id, String title, String description, Status status, Priority priority, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime dueAt, LocalDateTime completedAt, User createdBy, User assignedTo, Project project, int estimatedTime, int spentTime, List<Tag> tags, List<Comment> comments, Task parentTask, List<Task> subTasks) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dueAt = dueAt;
        this.completedAt = completedAt;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.project = project;
        this.estimatedTime = estimatedTime;
        this.spentTime = spentTime;
        this.tags = tags;
        this.comments = comments;
        this.parentTask = parentTask;
        this.subTasks = subTasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }

    public List<Task> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<Task> subTasks) {
        this.subTasks = subTasks;
    }
}
