package eu.pepco.lbartosik.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Component("controller")
public class Controller {

    @Autowired
    public BookService bookService;
    @GetMapping("/hello")

    public String getID(@RequestParam(value = "ID", defaultValue = "Example") String id) {
        String book="test";


//		if(id.equals("4")){
//			book="Lemons";
//		}
        return book;
    }
//    @ResponseBody
    @GetMapping("/getusers")
    public List<Users> showUsers(){

        return bookService.getAllUsers();
    }





}
