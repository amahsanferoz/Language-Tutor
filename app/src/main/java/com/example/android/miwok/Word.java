package com.example.android.miwok;

/**
 * Created by ahsanferoz on 09/09/16.
 */
public class Word {

    //Default word for the translation
    private String mDefaultTranslation;

    //Translation for the default word
    private String mMiwokTranslation;

    //image resource id for the word
    private int mImageResourceId;

    //Constructor without image resource id
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Constructor with image resource id
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get the default translation of the word.
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the miwok translation of the word.
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the image resource id
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
