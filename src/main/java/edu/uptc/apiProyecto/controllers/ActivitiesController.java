package edu.uptc.apiProyecto.controllers;

import edu.uptc.apiProyecto.entities.Activities;
import edu.uptc.apiProyecto.entities.Subjects;
import edu.uptc.apiProyecto.services.ActivitiesService;
import edu.uptc.apiProyecto.services.SubjectsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/activities")
public class ActivitiesController {
    private ActivitiesService activitiesService;
    private SubjectsService subjectsService;

    public ActivitiesController(ActivitiesService activitiesService, SubjectsService subjectsService) {
        this.activitiesService = activitiesService;
        this.subjectsService = subjectsService;
    }

    @GetMapping
    public List<Activities> getActivities(){return  activitiesService.getActivities();}
    @GetMapping("/{id}")
    public Activities findById(@PathVariable int id){return  activitiesService.findById(id);}

    @PostMapping
    public Activities save(@RequestBody Activities activities){
        Subjects subject = subjectsService.findById(activities.getSubject().getId());
        if(subject != null) {
            return activitiesService.save(new Activities(activities.getDescription(),activities.getDateDelivery(),activities.getQual(), activities.getPercent(), activities.getStatusAct(), subject));
        }
        return null;
    }

    @PutMapping
    public Activities update(@RequestBody Activities activities){
        return activitiesService.update(activities);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id){
        return activitiesService.delete(findById(id));
    }
}
