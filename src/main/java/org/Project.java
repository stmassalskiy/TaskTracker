package org;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private int id; // id проекта
    private String name; // Наименование проекта
    private String description; //
    private User manager; // Руководитель проекта
    private LocalDateTime createdAt; // Дата и время создания проекта
    private LocalDateTime updatedAt; // Дата и время последнего обновления проекта

    private LocalDateTime startDate; // Дата начала проекта
    private LocalDateTime endDate; // Планируемая дата завершения проекта
    private LocalDateTime factDate; // Фактическая дата завершения проекта
    private Status status; //  Статус проекта
    private String version; // Версия проекта
    private String homepage; // Домашняя страница проекта
    private boolean isPublic; // Флаг открытости проекта (виден всем или нет)

    private List<Task> tasks = new ArrayList<Task>(); // Список задач в проекта
    private List<User> projects = new ArrayList<User>(); // Список участников проекта

    public Project(int id, String name, String description, User manager, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime factDate, Status status, String version, String homepage, boolean isPublic, List<Task> tasks, List<User> projects) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manager = manager;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.startDate = startDate;
        this.endDate = endDate;
        this.factDate = factDate;
        this.status = status;
        this.version = version;
        this.homepage = homepage;
        this.isPublic = isPublic;
        this.tasks = tasks;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
        this.updatedAt = LocalDateTime.now();
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

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getFactDate() {
        return factDate;
    }

    public void setFactDate(LocalDateTime factDate) {
        this.factDate = factDate;
        this.updatedAt = LocalDateTime.now();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        this.updatedAt = LocalDateTime.now();
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
        this.updatedAt = LocalDateTime.now();
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
        this.updatedAt = LocalDateTime.now();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<User> getProjects() {
        return projects;
    }

    public void setProjects(List<User> projects) {
        this.projects = projects;
    }
}
