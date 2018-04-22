package ru.itacademy.officeproject.service;

import ru.itacademy.officeproject.model.User;

public interface TelegramService {
    void notifyUser(User user, String message);
}
