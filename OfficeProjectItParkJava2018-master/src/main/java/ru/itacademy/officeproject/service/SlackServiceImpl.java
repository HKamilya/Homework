package ru.itacademy.officeproject.service;

import org.springframework.stereotype.Service;

import ru.itacademy.officeproject.model.User;

import javax.validation.Payload;
import java.io.IOException;
import java.util.Scanner;

@Service
public static final String WEBHOOK =
public static final String TOKEN = "xoxb-353846860548-xhVxUkPf8odpbn91vEiBzBgp";
public class SlackServiceImpl extends SlackLongPollingBot implements SlackService {

    new

    Thread(SlackServiceImpl::sendMessage).

    start();

 try(
    RTMClient rtm = new Slack().rtm(TOKEN))

    {
    }
    catch(
    IOException e)

    {
        e.printStackTrace();
    }

    private static void sendMessage() {
        Slack slack = Slack.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (!Thread.currentThread().isInterrupted()) {
            System.out.print("Enter message - ");
            String message = scanner.nextLine();

            Payload payload = Payload.builder()
                    .channel("#")
                    .username("")
                    .iconEmoji("::")
                    .text(message)
                    .build();

            try {
                slack.send(WEBHOOK, payload);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
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
