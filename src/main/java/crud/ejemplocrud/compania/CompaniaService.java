package crud.ejemplocrud.compania;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompaniaService {
    @Autowired
    CompaniaRepository repository;
    public Compania save( Compania entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Compania findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Compania> findAll(){
        return (List<Compania>) repository.findAll();
    }
    
}


