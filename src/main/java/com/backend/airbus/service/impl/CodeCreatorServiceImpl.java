package com.backend.airbus.service.impl;

import com.backend.airbus.model.CodeResponseModel;
import com.backend.airbus.model.LanguageQuestionModel;
import com.backend.airbus.service.CodeCreatorService;
import com.backend.airbus.service.GenericLanguageCodeCreatorService;
import org.springframework.stereotype.Service;

@Service
public class CodeCreatorServiceImpl implements CodeCreatorService {

    private GenericLanguageCodeCreatorService genericLanguageCodeCreatorService;

    @Override
    public CodeResponseModel createCode(LanguageQuestionModel languageQuestionModel) {

        String language = languageQuestionModel.getLanguage();

        switch (language) {
            case "java":
                genericLanguageCodeCreatorService = new JavaCodeCreatorServiceImpl();
                break;
            case "django":
                genericLanguageCodeCreatorService = new DjangoCodeCreatorServiceImpl();
                break;
            case "html":
                genericLanguageCodeCreatorService = new HtmlCodeCreatorServiceImpl();
                break;
        }

        String codeResponse = genericLanguageCodeCreatorService.createCode(languageQuestionModel);

        CodeResponseModel codeResponseModel = new CodeResponseModel();
        codeResponseModel.setFinalCode(codeResponse);
        return codeResponseModel;

    }
}
