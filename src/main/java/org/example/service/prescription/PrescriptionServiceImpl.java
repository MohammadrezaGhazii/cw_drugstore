package org.example.service.prescription;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Prescription;
import org.example.repository.prescription.PrescriptionRepository;
import org.hibernate.SessionFactory;

public class PrescriptionServiceImpl extends BaseServiceImpl<Prescription,Long, PrescriptionRepository> implements PrescriptionService {
    public PrescriptionServiceImpl(PrescriptionRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
