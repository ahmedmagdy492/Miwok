package com.example.miwok;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int image;
    private int audio;

    public Word(String defaultTranslation, String miwokTranslation, int image, int audio) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.image = image;
        this.audio = audio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audio) {
        this(defaultTranslation, miwokTranslation, 0, audio);
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }
}
