package dev.augusto.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.augusto.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Mapper.NinjaMapper;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import dev.augusto.java10x.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }
    public NinjaDTO listNinjaById(Long id){
        Optional<NinjaModel> ninjaFound = ninjaRepository.findById(id);
        return ninjaFound.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO createNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = new ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void deleteNinja(Long id){
            ninjaRepository.deleteById(id);
    }

    public NinjaDTO updateNinja(Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaFound = ninjaRepository.findById(id);
        if (ninjaFound.isPresent()){
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.set(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }
}
