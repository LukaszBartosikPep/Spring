package eu.pepco.lbartosik.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class Application {

	@Autowired
	private Controller controller;

	@Autowired
	public Application(Controller controller){
		this.controller=controller;
	}
	public void run(){
		controller.getID();
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);



	}









}
