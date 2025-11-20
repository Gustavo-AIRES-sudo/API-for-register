package dev.jav10x.UserRegister.Responsabilities;

import dev.jav10x.UserRegister.User.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsabilitiesRepository extends JpaRepository<UserModel, Long> { //TODO: SE O DB DER ERRO, VOLTAR PARA "UserResponsabilitiesModel".

}
