package dev.jav10x.UserRegister.Responsabilities;

import dev.jav10x.UserRegister.User.UserModel;
import jakarta.persistence.*;

import java.util.List;

//TODO RELACIONAR TABELAS;

@Entity
@Table(name = "tb_user_responsability")

public class UserResposabilitiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nameOfResponsability;
    private Difficulty difficulty;

    //Uma responsabilidade poderá ser aplicada à vários usuários.
    @OneToMany(mappedBy = "responsabilities")
    private List<UserModel> users;


}