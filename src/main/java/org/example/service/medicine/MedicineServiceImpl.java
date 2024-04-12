package org.example.service.medicine;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Medicine;
import org.example.repository.medicine.MedicineRepository;
import org.hibernate.SessionFactory;

public class MedicineServiceImpl extends BaseServiceImpl<Medicine,Long, MedicineRepository> implements MedicineService {
    public MedicineServiceImpl(MedicineRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
