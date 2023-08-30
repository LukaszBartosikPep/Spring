package eu.pepco.lbartosik.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@Component("controller")
public class Controller {

    @GetMapping("/hello")

    public String getID(@RequestParam(value = "ID", defaultValue = "Example") String id) {
        String book="";


//		if(id.equals("4")){
//			book="Lemons";
//		}
        return String.format("The title is %s!", id);
    }




}
