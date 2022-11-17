package edu.uptc.apiProyecto.services;

import edu.uptc.apiProyecto.entities.Activities;
import edu.uptc.apiProyecto.repositories.ActivitiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivitiesService {
    private ActivitiesRepository activitiesRepository;

    public ActivitiesService(ActivitiesRepository activitiesRepository) {
        this.activitiesRepository = activitiesRepository;
    }
    public List<Activities> getActivities(){return activitiesRepository.findAll();}

    public Activities save(Activities activities){return activitiesRepository.save(activities);}

    public Activities findById(int id){
        Optional<Activities> optional = activitiesRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    public Activities update(Activities activities){
        if(findById(activities.getId()) != null){
            return activitiesRepository.save(activities);
        }else{
            return null;
        }
    }

    public boolean delete(Activities activities){
        if (activities != null) {
            activitiesRepository.delete(activities);
            return true;
        }
        return false;
    }

}
