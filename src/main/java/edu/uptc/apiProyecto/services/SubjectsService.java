package edu.uptc.apiProyecto.services;

import edu.uptc.apiProyecto.entities.Subjects;
import edu.uptc.apiProyecto.repositories.SubjectsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectsService {
    private SubjectsRepository subjectsRepository;

    public SubjectsService(SubjectsRepository subjectsRepository) {
        this.subjectsRepository = subjectsRepository;
    }
    public List<Subjects> getSubjects(){return subjectsRepository.findAll();}

    public Subjects save(Subjects subjects){return subjectsRepository.save(subjects);}

    public Subjects findById(int id){
        Optional<Subjects> optional = subjectsRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    public Subjects update(Subjects subjects){
        if(findById(subjects.getId()) != null){
            return subjectsRepository.save(subjects);
        }else{
            return null;
        }
    }

    public boolean delete(Subjects subjects){
        if (subjects != null) {
            subjectsRepository.delete(subjects);
            return true;
        }
        return false;
    }
}
