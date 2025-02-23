package dev.augusto.java10x.CadastroDeNinjas.Missoes.Repository;

import dev.augusto.java10x.CadastroDeNinjas.Missoes.Models.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
