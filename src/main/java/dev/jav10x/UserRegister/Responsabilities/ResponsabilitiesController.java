package dev.jav10x.UserRegister.Responsabilities;

import org.springframework.web.bind.annotation.*;

//LOCALHOST:8080/(route)
@RestController
@RequestMapping("/responsabilities")

public class ResponsabilitiesController {

    //Get -> request to show responsabilities info.
    @GetMapping("/show")
    public String show_responsabilities() {
        return "Responsabilities of user: ";
    }

    //Post -> request to create a user responsability.
    @PostMapping("/add")
    public String add_responsabilty() {
        return "Sucess to create user responsability";
    }

    //Put -> request to alter an info of user responsability.
    @PutMapping("/alter")
    public String alter_responsability() {
        return "Sucess to alter user responsability";
    }

    //Delete -> request to delete a user responsability.
    @DeleteMapping("/delete")
    public String delete_responsability() {
        return "Sucess to delete user responsability";
    }

}
