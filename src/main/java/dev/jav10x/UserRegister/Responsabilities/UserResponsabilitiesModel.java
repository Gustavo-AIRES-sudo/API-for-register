package dev.jav10x.UserRegister.Responsabilities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.jav10x.UserRegister.User.UserModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_user_responsability")
@Data

public class UserResponsabilitiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name_of_responsability;//TODO: MUDAR PARA "name_of_responsability"
    private Difficulty difficulty;

    //Uma responsabilidade poderá ser aplicada à vários usuários.
    @OneToMany(mappedBy = "responsabilities")
    @JsonIgnore
    private List<UserModel> users;


}