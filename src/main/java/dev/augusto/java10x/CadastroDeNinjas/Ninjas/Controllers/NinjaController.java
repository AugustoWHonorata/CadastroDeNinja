package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Controllers;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
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
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.createNinja(ninja);
    }

    @GetMapping("/list/{id}")
    public NinjaDTO getNinjaById(@PathVariable Long id){
        return ninjaService.listNinjaById(id);
    }

    @GetMapping("/list")
    public List<NinjaDTO> getAllNinjas(){

        return ninjaService.listNinjas();
    }

    @PutMapping("/update/{id}")
    public String updateNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        ninjaService.updateNinja(id, ninjaAtualizado);
        return "Ninja alterado com sucesso";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteNinja(@PathVariable Long id){
        ninjaService.deleteNinja(id);
        return "Ninja deletado com sucesso";
    }
}
