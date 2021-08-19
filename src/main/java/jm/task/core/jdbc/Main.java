package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Кот", "Котофеев", (byte) 5);
        userService.saveUser("Иван", "Иванов", (byte) 35);
        userService.saveUser("Сидор", "Сидоров", (byte) 46);
        userService.saveUser("Пётр","Петров", (byte) 43);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
