package ru.itacademy.officeproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.*;
import ru.itacademy.officeproject.model.User;
import ru.itacademy.officeproject.service.TelegramService;
import ru.itacademy.officeproject.service.UserService;

import java.util.Optional;


@Controller
public class TaskController {

    @Autowired
    UserService userService;
    @Autowired
    TelegramService telegramService;

    @GetMapping("/user/sendtask")
    public String sendTask(@ModelAttribute("model") ModelMap model) {
        return "task";
    }

    @PostMapping("/user/sendtask")
    public String task(@ModelAttribute("model") ModelMap model, @RequestParam String task, @RequestParam Long userId) {
        Optional<User> user = userService.getUserById(userId);
        if (user.isPresent()) {
            telegramService.notifyUser(user.get(), task);
        } else {
            throw new IllegalArgumentException("No user with id = " + userId + "found");
        }
        return "task";
    }
}
