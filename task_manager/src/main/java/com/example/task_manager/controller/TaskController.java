package com.example.task_manager.controller;

import com.example.task_manager.service.TaskService;
import com.example.task_manager.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String listUsers(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        model.addAttribute("task", new Task());
        model.addAttribute("taskItem", new Task()); // Add this line
        return "tasks";
    }

    @PostMapping
    public String createUser(@ModelAttribute Task task, Model model) {
        taskService.saveTask(task);
        model.addAttribute("task", new Task());
        return "redirect:/tasks";
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.PUT, RequestMethod.POST})
    public String updateTask(@PathVariable Optional<Long> id, @ModelAttribute Task task, Model model) {
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Task id must not be null");
        }
        taskService.updateTask(id.get(), task);
        model.addAttribute("task", new Task());
        return "redirect:/tasks";
    }

    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id, Model model) {
        taskService.deleteTask(id);
        model.addAttribute("task", new Task());
        return "redirect:/tasks";
    }
}