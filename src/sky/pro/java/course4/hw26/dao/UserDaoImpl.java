package course4.hw26.dao;

import course4.hw26.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    List<User> userList = new ArrayList<>();

    public UserDaoImpl() {
        userList.add(new User("Evgeniy"));
        userList.add(new User("Vladimir"));
        userList.add(new User("Vitaliy"));
    }

    @Override
    public String getUserByName(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user.getName();
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}