package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listNinjas() {
        return ninjaRepository.findAll();
    }
    public NinjaModel listNinjaById(Long id){
        Optional<NinjaModel> ninjaFound = ninjaRepository.findById(id);
        return ninjaFound.orElse(null);
    }

    public NinjaModel createNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id){
            ninjaRepository.deleteById(id);
    }
    public NinjaModel updateNinja(Long id, NinjaModel ninja){
        if (ninjaRepository.existsById(id)){
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }
        return null;
    }
}
