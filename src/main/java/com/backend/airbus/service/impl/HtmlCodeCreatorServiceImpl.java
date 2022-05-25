package com.backend.airbus.service.impl;

import com.backend.airbus.model.LanguageQuestionModel;
import com.backend.airbus.service.GenericLanguageCodeCreatorService;
import org.springframework.stereotype.Service;

@Service
public class HtmlCodeCreatorServiceImpl implements GenericLanguageCodeCreatorService {

    @Override
    public String createCode(LanguageQuestionModel languageQuestionModel) {

        return "Hello from HTML";
    }
}
