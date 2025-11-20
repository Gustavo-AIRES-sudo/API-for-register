package dev.jav10x.UserRegister.User;

import dev.jav10x.UserRegister.Responsabilities.ResponsabilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private ResponsabilitiesRepository responsabilitiesRepository;

    public UserService(ResponsabilitiesRepository responsabilitiesRepository) {
        this.responsabilitiesRepository = responsabilitiesRepository;
    }

    //List all users
    public List<UserModel> get_all_users() {
        return responsabilitiesRepository.findAll();
    }

}
