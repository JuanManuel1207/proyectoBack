package edu.uptc.apiProyecto.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "activity")
public class Activities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private LocalDateTime dateDelivery;
    private double qual;
    private double percent;
    @Column(name = "statusAct", columnDefinition = "BOOLEAN")
    private boolean statusAct;
    @ManyToOne
    private Subjects subject;

    public Activities() {
    }

    public Activities(String description, LocalDateTime dateDelivery, double qual, double percent, boolean statusAct, Subjects subject) {
        this.description = description;
        this.dateDelivery = dateDelivery;
        this.qual = qual;
        this.percent = percent;
        this.statusAct = statusAct;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDateTime dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public double getQual() {
        return qual;
    }

    public void setQual(double qual) {
        this.qual = qual;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public boolean getStatusAct() {
        return statusAct;
    }

    public void setStatusAct(boolean statusAct) {
        this.statusAct = statusAct;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
