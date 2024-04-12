package org.example.model;

import jakarta.persistence.Entity;
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
public class Admin extends BaseEntity<Long> {
    private String name;
    private String nationalId;
    private String password;

    public Admin(Long aLong, String name, String nationalId, String password) {
        super(aLong);
        this.name = name;
        this.nationalId = nationalId;
        this.password = password;
    }
}
