package ru.itacademy.officeproject.service;

import org.springframework.stereotype.Service;
import ru.itacademy.officeproject.model.User;

@Service
public class TelegramServiceImpl implements TelegramService{
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("I am telegram service. I am going to send message" + message + " to user with id = " + user.getId());
    }
}
