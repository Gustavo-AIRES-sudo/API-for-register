package dev.jav10x.UserRegister.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome") //Isso faz com que o método "welcome()" seja executado quando uma solicitação HTTP Get seja feita na URL/welcome
    public String welcome(){
        return "Welcome to this route";
    }
}
