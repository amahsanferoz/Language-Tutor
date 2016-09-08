package com.example.android.miwok;

/**
 * Created by ahsanferoz on 09/09/16.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the default translation of the word.
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the miwok translation of the word.
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
