package org.example.repository.patient;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Patient;
import org.hibernate.SessionFactory;

public class PatientRepositoryImpl extends BaseRepositoryImpl<Patient,Long> implements PatientRepository{
    public PatientRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Patient> getEntityClass() {
        return Patient.class;
    }
}
