package com.reisquaza.certification_nlw.modules.students.controllers;

import com.reisquaza.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.reisquaza.certification_nlw.modules.students.usecases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    @PostMapping("/verifyIfHasCertification")
    public boolean verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        return this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
    }
}
