package pe.edu.unsch.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
    @GetMapping("/index")
	public String index() {
		return "views/tabla/tabla_Docente";
    	//return "views/index";
	}

}

