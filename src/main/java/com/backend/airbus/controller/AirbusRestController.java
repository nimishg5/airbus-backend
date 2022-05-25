package com.backend.airbus.controller;

import com.backend.airbus.model.CodeResponseModel;
import com.backend.airbus.model.LanguageQuestionModel;
import com.backend.airbus.service.CodeCreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirbusRestController {

    @Autowired
    private CodeCreatorService codeCreatorService;

    @PostMapping("/getCode")
    public CodeResponseModel getCodeForLanguage(@RequestBody LanguageQuestionModel languageQuestionModel) {

        return codeCreatorService.createCode(languageQuestionModel);

    }

}
