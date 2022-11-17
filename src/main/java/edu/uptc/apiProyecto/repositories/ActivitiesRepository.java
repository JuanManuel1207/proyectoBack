package edu.uptc.apiProyecto.repositories;

import edu.uptc.apiProyecto.entities.Activities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivitiesRepository extends JpaRepository<Activities, Integer> {
}
