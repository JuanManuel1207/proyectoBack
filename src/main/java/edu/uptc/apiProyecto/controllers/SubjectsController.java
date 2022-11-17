package edu.uptc.apiProyecto.controllers;

import edu.uptc.apiProyecto.entities.Subjects;
import edu.uptc.apiProyecto.services.SubjectsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/subjects")
public class SubjectsController {
    private SubjectsService subjectsService;

    public SubjectsController(SubjectsService subjectsService) {
        this.subjectsService = subjectsService;
    }

    @GetMapping
    public List<Subjects> getSubjects(){return  subjectsService.getSubjects();}
    @GetMapping("/{id}")
    public Subjects findById(@PathVariable int id){return  subjectsService.findById(id);}

    @PostMapping
    public Subjects save(@RequestBody Subjects subjects){return subjectsService.save(subjects);}

    @PutMapping
    public Subjects update(@RequestBody Subjects subjects){return subjectsService.update(subjects);}

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return subjectsService.delete(findById(id));
    }

}
