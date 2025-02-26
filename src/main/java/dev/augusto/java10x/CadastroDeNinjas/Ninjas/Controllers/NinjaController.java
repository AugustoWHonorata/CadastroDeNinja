package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

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
    public String getAllNinjas(){
        return "Todos os Ninjas";
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
