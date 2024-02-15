package com.reisquaza.certification_nlw.modules.students.usecases;

import com.reisquaza.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.reisquaza.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
    public boolean execute(VerifyHasCertificationDTO verifyHasCertificationDTO) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(verifyHasCertificationDTO.getEmail(), verifyHasCertificationDTO.getTechnology());

        return !result.isEmpty();
    }
}
