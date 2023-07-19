package day10.practice;

import java.util.ArrayList;

public class UserRegistration {

    private ArrayList<User> userList;

    public UserRegistration() {
        userList = new ArrayList<>();
    }

    public void register(User user) throws UserAlreadyExistsException {
        for (User existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with email ID " + user.emailId + " already exists.");
            }
        }

        userList.add(user);
    }
    
    public int getUserCount() {
        return userList.size();
    }
}
