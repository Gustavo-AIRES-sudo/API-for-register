package dev.jav10x.UserRegister.Responsabilities;

import dev.jav10x.UserRegister.User.UserModel;
import jakarta.persistence.*;

import java.util.List;

//TODO RELACIONAR TABELAS;

@Entity
@Table(name = "tb_user_responsability")

public class UserResposabilitiesModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nameOfResponsability;
    private Difficulty difficulty;
    private List<UserResposabilitiesModel> responsabilityOfUser;
    private UserModel user;

    public UserResposabilitiesModel(List<UserResposabilitiesModel> responsabilityOfUser) {
        this.responsabilityOfUser = responsabilityOfUser;
    }

    public UserResposabilitiesModel(Long ID, String nameOfResponsability, Difficulty difficulty, List<UserResposabilitiesModel> responsabilityOfUser, UserModel user) {
        this.ID = ID;
        this.nameOfResponsability = nameOfResponsability;
        this.difficulty = difficulty;
        this.responsabilityOfUser = responsabilityOfUser;
        this.user = user;
    }

    public UserResposabilitiesModel() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNameOfResponsability() {
        return nameOfResponsability;
    }

    public void setNameOfResponsability(String nameOfResponsability) {
        this.nameOfResponsability = nameOfResponsability;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public List<UserResposabilitiesModel> getResponsabilityOfUser() {
        return responsabilityOfUser;
    }

    public void setResponsabilityOfUser(List<UserResposabilitiesModel> responsabilityOfUser) {
        this.responsabilityOfUser = responsabilityOfUser;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
