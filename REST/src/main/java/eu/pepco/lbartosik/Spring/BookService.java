package eu.pepco.lbartosik.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//import javax.persistence.*;

@Service
public class BookService {

    @Autowired
    private UserRepository userRepository;



//    @GetMapping("/getusers")
    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

//        System.out.println(users);
        return users;
    }
//    public String retrieveID(String id) {
//        // You can perform logic here, if needed
//        return id;
//    }
//    @Autowired
//    Controller controller;
//    String id= controller.getID(String id);
//    public List<Books> getBookById() {
//        List<User> users = new ArrayList<>();
//        userRepository.findById(id).forEach(users::add);
//        return users;
//    }





}


