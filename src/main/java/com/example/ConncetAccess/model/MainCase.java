package com.example.ConncetAccess.model;

public class MainCase {
    private String keyCase;
    private String plaintiff;
    private String defendant;

    public MainCase() {
    }

    public MainCase(String keyCase, String plaintiff, String defendant) {
        this.keyCase = keyCase;
        this.plaintiff = plaintiff;
        this.defendant = defendant;
    }

    public String getKeyCase() {
        return keyCase;
    }

    public void setKeyCase(String keyCase) {
        this.keyCase = keyCase;
    }

    public String getPlaintiff() {
        return plaintiff;
    }

    public void setPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

}
