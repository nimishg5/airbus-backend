package com.backend.airbus.service.impl;

import com.backend.airbus.model.LanguageQuestionModel;
import com.backend.airbus.service.GenericLanguageCodeCreatorService;
import com.backend.airbus.utils.JavaCodeUtil;
import org.springframework.stereotype.Service;

@Service
public class JavaCodeCreatorServiceImpl implements GenericLanguageCodeCreatorService {

    @Override
    public String createCode(LanguageQuestionModel languageQuestionModel) {

        switch (languageQuestionModel.getQuestion()) {
            case "1":
                return JavaCodeUtil.helloWorldCode();
            case "2":
                return JavaCodeUtil.interfaceWithTwoMethods();
            case "3":
                return JavaCodeUtil.basicSwitchCase();
            default:
                return "Hello From JAVA";
        }
    }

}
