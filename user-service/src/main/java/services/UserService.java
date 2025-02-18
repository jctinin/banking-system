package services;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.UserRepository;

import java.util.Optional;
import java.util.Random;

public class UserService {

    private UserRepository userRepository;

    public User createUser(User user){
        user.setBalance(0.0);
        user.setAccount_number(generateAccountNumber());
        return user;
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    private String generateAccountNumber() {
        return String.valueOf(new Random().nextInt(1_000_000_000) + 1_000_000_000);
    }

    public Optional<User> getUserById(String accountNumber){
        return userRepository.findByAccountNumber(accountNumber);
    }

    public User updateBalance(Long id, double amount){
        Optional<User> user = userRepository.findById(id);
        return null;
    }

}
