package dev.augusto.java10x.CadastroDeNinjas.Missoes.Models;

import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nome;
    private String dificuldade;

    @OneToMany
    private NinjaModel ninja;
}
