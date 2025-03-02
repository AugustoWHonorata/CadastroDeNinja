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
    public NinjaModel createNinja(@RequestBody NinjaModel ninja){
        return ninjaService.createNinja(ninja);
    }

    @GetMapping("/list/{id}")
    public NinjaModel getNinjaById(@PathVariable Long id){
        return ninjaService.listNinjaById(id);
    }

    @GetMapping("/list")
    public List<NinjaModel> getAllNinjas(){
        return ninjaService.listNinjas();
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
