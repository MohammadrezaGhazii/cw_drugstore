package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Item extends BaseEntity<Long> {
    private int number;
    @ManyToOne
    private Medicine medicine;
    @ManyToOne
    private Prescription prescription;

    public Item(Long aLong, int number, Medicine medicine, Prescription prescription) {
        super(aLong);
        this.number = number;
        this.medicine = medicine;
        this.prescription = prescription;
    }
}
