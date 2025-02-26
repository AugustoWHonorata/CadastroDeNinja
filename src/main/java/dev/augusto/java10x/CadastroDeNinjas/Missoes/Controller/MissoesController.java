package dev.augusto.java10x.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @PostMapping("/create")
    public String createMission(){
        return "Missao criada";
    }

    @PutMapping("/update")
    public String updateMission(){
        return "Missao Atualizada";
    }

    @GetMapping("/get-by-id")
    public String getMissioById(){
        return "Missao pelo id";
    }

    @GetMapping("/list-all")
    public String getMission(){
        return "Missoes listadas";
    }

    @DeleteMapping("/delete")
    public String deleteMission(){
        return "Missao deletada";
    }
}
