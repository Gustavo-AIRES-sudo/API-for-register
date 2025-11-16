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

    @Column(name = "user_FullName")
    private String userFullName;

    @Column (unique = true, name = "user_Gmail")
    private String userGmail;

    @Column (name = "user_Age")
    private int userAge;

    //@ManyToOne: usuário tem uma única resposanbilidade: muitos (nome da classe) terão uma responsabilidade.
    //owning side
    @ManyToOne
    @JoinColumn(name = "responsabilities_id") //TODO: MUDAR PARA "responsabilities_id //Foreing Key/ Chave Estrangeira: Conectar duas tabelas ou mais por uma key(id). Também está definindo a coluna "resposabilities_id" na tabela "tb_user_register"
    private UserResponsabilitiesModel responsabilities;

}