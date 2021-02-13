package am.basic.jdbc;

import am.basic.jdbc.model.User;
import am.basic.jdbc.repository.UserRepository;
import am.basic.jdbc.repository.impl.UserRepositoryImpl;

public class Main {


    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        User user = userRepository.getByUsername("ruben.manukyan");
        System.out.println(user);
        user.setPassword("newPassword");
        userRepository.update(user);

        user = userRepository.getByUsername("ruben.manukyan");

        System.out.println(user);

        System.out.println("Hello world");
    }
}
