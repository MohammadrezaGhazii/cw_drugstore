package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Medicine extends BaseEntity<Long> {
    private String name;
    private double price;
    private int inventory;
    private boolean doesExists;
    @OneToMany(mappedBy = "medicine")
    private List<Item> items;

    public Medicine(Long aLong, String name, double price, int inventory, boolean doesExists, List<Item> items) {
        super(aLong);
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.doesExists = doesExists;
        this.items = items;
    }
}
