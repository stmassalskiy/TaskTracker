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


}
