package course4.hw26.dao;

import course4.hw26.model.User;

import java.util.List;

public interface UserDao {

    String getUserByName(String name);

    List<User> findAllUsers();
}