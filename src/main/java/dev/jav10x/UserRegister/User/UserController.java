package dev.jav10x.UserRegister.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//LOCALHOST:8080/(route)
@RestController
@RequestMapping("/user")

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/welcome") //Isso faz com que o método "welcome()" seja executado quando uma solicitação HTTP Get seja feita na URL/welcome
    public String welcome(){
        return "Welcome to this route";
    }

    // Adicionar usuário (Create)
    //TODO: COMPLETE
    @PostMapping("/add")
    public String user_add() {
        return "User created";
    }

    // Procurar usuário por ID (Read)
    //TODO: COMPLETE
    @GetMapping("/searchId")
    public String get_user_by_id(){
        return "Users: ";
    }

    // Mostrar todos os usuários (Read)
    //TODO: COMPLETE
    @GetMapping("/show")
    public List<UserModel> get_all_users(){
        return userService.get_all_users();
    }

    // Alterar dados dos usuários (Update)
    //TODO: COMPLETE
    @PutMapping("/alter")
    public String alter_user_info() {
        return "Alter user info.";
    }

    // Deletar usuário (Delete)
    //TODO: COMPLETE
    @DeleteMapping("/deleteId")
    public String delete_user_id() {
        return "User deleted";
    }
}
