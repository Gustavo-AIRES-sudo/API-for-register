package dev.jav10x.UserRegister.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome") //Isso faz com que o método "welcome()" seja executado quando uma solicitação HTTP Get seja feita na URL/welcome
    public String welcome(){
        return "Welcome to this route";
    }

    // Adicionar usuário (Create)
    //TODO: COMPLETE
    @PostMapping("/add")
    public String userAdd() {
        return "User created";
    }

    // Procurar usuário por ID (Read)
    //TODO: COMPLETE
    @GetMapping("/searchWithId")
    public String get_user_whit_id(){
        return "Users: ";
    }

    // Mostrar todos os usuários (Read)
    //TODO: COMPLETE
    @GetMapping("/showAll")
    public String get_all_users(){
        return "All users: ";
    }

    // Alterar dados dos usuários (Update)
    //TODO: COMPLETE
    @PutMapping("/alterUserInfo")
    public String alter_user_info() {
        return "Alter user info.";
    }

    // Deletar usuário (Delete)
    //TODO: COMPLETE
    @DeleteMapping("/deleteID")
    public String delete_user_id() {
        return "User deleted";
    }
}
