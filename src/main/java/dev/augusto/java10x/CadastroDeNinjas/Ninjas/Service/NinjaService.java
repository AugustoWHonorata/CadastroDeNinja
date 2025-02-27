package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }
}
