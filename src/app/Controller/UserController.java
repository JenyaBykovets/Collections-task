package app.Controller;

import app.Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users;

    public UserController() {
        users = new ArrayList<>();
        users.add(new User("Alice", "alice@gmail.com"));
        users.add(new User("Bob", "bob@gmail.com"));
        users.add(new User("Charlie", "charlie@gmail.com"));
        users.add(new User("David", "david@gmail.com"));
        users.add(new User("Eve", "eve@gmail.com"));
    }

    public void displayUsers() {
        System.out.println("List of Users:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName() + " - " + users.get(i).getEmail());
        }
    }

    public void displayUser(int index) {
        if (index >= 1 && index <= users.size()) {
            User user = users.get(index - 1);
            System.out.println("User of number " + index + ": " + user.getName() + " - " + user.getEmail());
        } else {
            System.out.println("Choose another number ");
        }
    }
}


