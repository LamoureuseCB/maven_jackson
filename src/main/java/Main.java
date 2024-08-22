import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File userJson = new File("src/main/java/user.json");
        User user = objectMapper.readValue(userJson, User.class);
        System.out.println("Информация о пользователе из JSON файла:");
        System.out.println("ID: " + user.getId());
        System.out.println("Имя: " + user.getName());
        System.out.println("Возраст " + user.getAge());
        System.out.println("Наличие подписки: " + user.isHasSubscription());
    }
}
