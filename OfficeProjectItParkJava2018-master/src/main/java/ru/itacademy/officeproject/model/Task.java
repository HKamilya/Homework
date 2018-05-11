package ru.itacademy.officeproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Task {
    @Id
    Long id;
    String telegramId;
    String task;


    public Task(){

    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getTask() {
          return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}



