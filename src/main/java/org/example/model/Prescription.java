package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prescription extends BaseEntity<Long> {
    private double totalPrice;
    @ManyToOne
    private Patient patient ;
    @OneToMany(mappedBy = "prescription")
    private List<Item> items = new ArrayList<>();
    private boolean confirm;

    public Prescription(Long aLong, double totalPrice, Patient patient, List<Item> items, boolean confirm) {
        super(aLong);
        this.totalPrice = totalPrice;
        this.patient = patient;
        this.items = items;
        this.confirm = confirm;
    }
}
