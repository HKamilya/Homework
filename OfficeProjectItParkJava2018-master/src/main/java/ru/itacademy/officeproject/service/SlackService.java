package ru.itacademy.officeproject.service;

import ru.itacademy.officeproject.model.User;

public interface SlackService {
    void notifyUser(User user, String message);
}
