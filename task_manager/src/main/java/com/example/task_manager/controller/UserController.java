package com.example.task_manager.controller;

import com.example.task_manager.service.UserService;
import com.example.task_manager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("user", new User());
        return "users";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public String createUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("user", new User());
        return "redirect:/users";
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.PUT, RequestMethod.POST})
    public String updateUser(@PathVariable Long id, @ModelAttribute User user, Model model) {
        if (id == null) {
            throw new IllegalArgumentException("User id must not be null");
        }
        userService.updateUser(id, user);
        model.addAttribute("user", new User());
        return "redirect:/users";
    }

    @PostMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id, Model model) {
        userService.deleteUser(id);
        model.addAttribute("user", new User());
        return "redirect:/users";
    }
}