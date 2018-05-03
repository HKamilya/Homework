package ru.itacademy.officeproject.service;

import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.model.Group;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import org.springframework.stereotype.Service;

import ru.itacademy.officeproject.model.User;
import com.github.seratch.jslack.*;
import com.github.seratch.jslack.api.methods.request.channels.*;
import com.github.seratch.jslack.api.methods.response.channels.*;

import java.io.IOException;
import java.util.List;


@Service
public class SlackServiceImpl implements SlackService {

//    private static final String TOKEN="xoxb-354071235825-BlnpmCRl4oZGNDnxncpxhXmA";
    private static final String WEBHOOK="https://hooks.slack.com/services/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";


    @Override
    public void notifyUser(User user, String message) throws IOException {
//        String url = System.getenv(WEBHOOK);

        Payload payload = Payload.builder()
                .channel("#" + user.getSlackId())
                .username("OfficeBot")
                .iconEmoji(":smile_cat:")
                .text("@" + user.getUsername() + message)
                .build();

        Slack slack = Slack.getInstance();
        WebhookResponse response = slack.send(WEBHOOK, payload);
        System.out.println(response.getCode());
    }

    public void notifyGroup(Group group) throws IOException {
        List<User> users;
        for(User user : users ){
            Payload payload = Payload.builder()
                    .channel("#" + group.get())
                    .username("OfficeBot")
                    .iconEmoji(":smile_cat:")
                    .text("@" + group.getName() + message)
                    .build();

        }
    }
}



//   public SlackServiceImpl() {
//        ApiContextInitializer.init(); // Инициализируем апи
//        TelegramBotsApi botapi = new TelegramBotsApi();
//        try {
//            botapi.registerBot((LongPollingBot) this);
//        } catch (SlackApiException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public String getBotToken() {
//        return "529478306:AAFCGdcNs2tgyPwjwweeDyrMw3kQS6ck-08";
//    }
//
//    public String getBotUsername() {
//        return "ProjectOfficeBot";
//    }
//
//    @Override
//    public void notifyUser(User user, String message) {
//        System.out.println("I am slack service. I am going to send message" + message + " to user with id = " + user.getId());
//    }
//
//    public void onUpdateReceived(Update update) {
//        Message msg = update.getMessage(); // Это нам понадобится
//        String firstname = msg.getChat().getFirstName();
//        String txt = msg.getText();
//    }
//
//}