package com.eHealth.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name="patient")
public class PatientEntity {
    @Id
    private int id;
    private LocalDate birthdate;

    public PatientEntity(int id, LocalDate birthdate){
        this.id = id;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }


}
