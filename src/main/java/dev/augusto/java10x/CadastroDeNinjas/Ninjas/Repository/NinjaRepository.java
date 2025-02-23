package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Repository;

import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
