package com.inditex.locm.jfxtext.control;

import com.inditex.locm.jfxtext.model.LanguageModel;
import com.inditex.locm.jfxtext.model.LanguageModel.Language;

public class LanguageController {

    private LanguageModel model;

    public LanguageController(LanguageModel model) {
        this.model = model;
        toEnglish();
    }

    public void toEnglish() {
        model.setBundle(Language.EN);
    }

    public void toSpanish() {
        model.setBundle(Language.ES);
    }

    public void toRomanian() {
        model.setBundle(Language.RO);
    }

    public Language getLanguage() {
        return model.getLanguage();
    }
}
