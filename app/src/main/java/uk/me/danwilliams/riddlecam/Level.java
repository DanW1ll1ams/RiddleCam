package uk.me.danwilliams.riddlecam;

/**
 * Created by Daniel on 26/07/2016.
 */
public class Level {
    private String mQuestion;
    //private [String] answerTags;
    private int mImageResourceId;
    private int mScore;
    //private int mRatingBar;
    //private boolean mIsComplete;


    public Level(String question, int imageResourceId, int score) {
        mQuestion = question;
        mImageResourceId = imageResourceId;
        mScore = score;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getScore() {
        return mScore;
    }
}
