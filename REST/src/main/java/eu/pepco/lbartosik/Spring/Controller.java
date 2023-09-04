package eu.pepco.lbartosik.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Component("controller")
public class Controller {
//    Long idn=null;
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    public BookService bookService;
    @GetMapping("/getIDs")

    public int getID(@RequestParam(value = "ID", defaultValue = "2") int idn) {

//    int ids=3;

//		if(id.equals("4")){
//			book="Lemons";
//		}
        return idn;
    }
//    @ResponseBody
    @GetMapping("/getusers")
    public String showUsers(){

        return getUserById(id);
    }
public String getUserById(Long id) {

//    List<Users> users = new ArrayList<>();
//    userRepository.findById(id).forEach(users::add);
    String singleUser= String.valueOf(userRepository.findById(id));


//    .findById(id));
//    users.addAll(singleUser);
    return singleUser;
}




}
