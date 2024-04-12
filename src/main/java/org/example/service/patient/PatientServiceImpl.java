package org.example.service.patient;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Patient;
import org.example.repository.patient.PatientRepository;
import org.hibernate.SessionFactory;

public class PatientServiceImpl extends BaseServiceImpl<Patient,Long, PatientRepository> implements PatientService {
    public PatientServiceImpl(PatientRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
