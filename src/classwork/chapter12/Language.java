package classwork.chapter12;

public enum Language {

    RU("Ռուսերեն"),
    HY("Հայերեն"),
    ENG("Անգլերեն");


    private String languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    Language() {
    }

    public String getLanguageName() {
        return languageName;
    }
    }

