package com.backend.airbus.service;

import com.backend.airbus.model.LanguageQuestionModel;

public interface GenericLanguageCodeCreatorService {

    String createCode(LanguageQuestionModel languageQuestionModel);

}
