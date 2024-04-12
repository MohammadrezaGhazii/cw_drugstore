package org.example.repository.medicine;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Medicine;
import org.hibernate.SessionFactory;

public class MedicineRepositoryImpl extends BaseRepositoryImpl<Medicine,Long> implements MedicineRepository {
    public MedicineRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Medicine> getEntityClass() {
        return Medicine.class;
    }
}
