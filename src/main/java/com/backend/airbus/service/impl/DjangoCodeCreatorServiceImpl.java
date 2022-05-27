package com.backend.airbus.service.impl;

import com.backend.airbus.model.LanguageQuestionModel;
import com.backend.airbus.service.GenericLanguageCodeCreatorService;
import com.backend.airbus.utils.DjangoCodeUtil;
import org.springframework.stereotype.Service;

@Service
public class DjangoCodeCreatorServiceImpl implements GenericLanguageCodeCreatorService {

    @Override
    public String createCode(LanguageQuestionModel languageQuestionModel) {

        switch (languageQuestionModel.getQuestion()) {
            case "1":
                return DjangoCodeUtil.helloWorldCode();
            case "2":
                return DjangoCodeUtil.interfaceWithTwoMethods();
            case "3":
                return DjangoCodeUtil.basicSwitchCase();
            default:
                return "Hello From Django";
        }

    }
}
