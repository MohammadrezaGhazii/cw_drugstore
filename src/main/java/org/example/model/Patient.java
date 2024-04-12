package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Patient extends BaseEntity<Long> {
    private String nationalId;
    private String name;
    @OneToMany(mappedBy = "patient")
    private List<Prescription> prescriptions = new ArrayList<>() ;

    public Patient(Long aLong, String nationalId, String name, List<Prescription> prescriptions) {
        super(aLong);
        this.nationalId = nationalId;
        this.name = name;
        this.prescriptions = prescriptions;
    }
}
