package eu.pepco.lbartosik.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    @Autowired
    Controller controller;
    String id= controller.getID(String id);
    public List<Books> getBookById() {
        List<User> users = new ArrayList<>();
        userRepository.findById(id).forEach(users::add);
        return users;
    }





}


