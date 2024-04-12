package org.example.repository.prescription;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Prescription;
import org.example.repository.patient.PatientRepository;
import org.hibernate.SessionFactory;

public class PrescriptionRepositoryImpl extends BaseRepositoryImpl<Prescription,Long> implements PrescriptionRepository {
    public PrescriptionRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Prescription> getEntityClass() {
        return Prescription.class;
    }
}
