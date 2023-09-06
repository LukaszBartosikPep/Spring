package eu.pepco.lbartosik.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
//@Component("controller")
public class Controll {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
//    Long idn=null;
//    public Integer idn;
    Users users=new Users();
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    public BookService bookService;
    @GetMapping("/getIDs")

    public String retrieveID(@RequestParam(value = "ID", defaultValue = "2") Long idn) {

    users.setId(idn);
//    int ids=3;

//		if(id.equals("4")){
//			book="Lemons";
//		}
//    showUsers();

        return "redirect:/showusers";
    }
//    @ResponseBody
    @GetMapping("/showusers")
    public String showUsers(){
       Long idn= users.getId();
       logger.info("set test");
        return getUserById(idn);  //Zwraca String singleUser
    }
public String getUserById(Long  id) {

//    List<Users> users = new ArrayList<>();
//    userRepository.findById(id).forEach(users::add);
    String singleUser= String.valueOf(userRepository.findById(id));


//    .findById(id));
//    users.addAll(singleUser);
    return singleUser;
}




}
