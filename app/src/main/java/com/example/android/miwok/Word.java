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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //represents no image
    private static final int NO_IMAGE_PROVIDED = -1;

    //audio resource id
    private int mAudioResourceId;

    //Constructor without image resource id
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Constructor with image resource id
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    //Returns whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //returns audio resource id
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
