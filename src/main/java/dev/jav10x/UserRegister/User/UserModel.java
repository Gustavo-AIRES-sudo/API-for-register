package dev.jav10x.UserRegister.User;

import dev.jav10x.UserRegister.Responsabilities.UserResponsabilitiesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user_register") //Dentro do escopo temos o nome da Table//
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerando o valor de ID / / IDENTITY: NUMEROS.
    private Long ID;

    private String userFullName;

    @Column (unique = true)
    private String userGmail;

    private int userAge;

    //@ManyToOne: usuário tem uma única resposanbilidade: muitos (nome da classe) terão uma responsabilidade.
    @ManyToOne
    @JoinColumn(name = "resposabilites_id") //Foreing Key/ Chave Estrangeira: Conectar duas tabelas ou mais por uma key(id)
    private UserResponsabilitiesModel responsabilitites;

}