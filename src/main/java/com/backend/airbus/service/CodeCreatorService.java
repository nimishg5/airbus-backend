package com.backend.airbus.service;

import com.backend.airbus.model.CodeResponseModel;
import com.backend.airbus.model.LanguageQuestionModel;

public interface CodeCreatorService {

    CodeResponseModel createCode(LanguageQuestionModel languageQuestionModel);

}
