package course4.hw26.service;

import course4.hw26.dao.UserDao;
import course4.hw26.model.User;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.findAllUsers().contains(user);
    }
}