package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Controllers;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    @PostMapping("/create")
    public String createNinja(){
        return "Ninja criado";
    }

    @GetMapping("/get-by-id")
    public String getNinjaById(){
        return "Mostrar Ninja por id";
    }

    @GetMapping("/list-all")
    public List<NinjaModel> getAllNinjas(){
        return ninjaService.listarNinjas();
    }

    @PutMapping("/update")
    public String updateNinja(){
        return "Altera Ninja";
    }

    @DeleteMapping("/delete")
    public String deleteNinja(){
        return "Ninja deletado";
    }
}
