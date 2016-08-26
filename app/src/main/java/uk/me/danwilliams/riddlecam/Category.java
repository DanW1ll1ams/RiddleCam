package uk.me.danwilliams.riddlecam;

/**
 * Created by Daniel on 26/07/2016.
 */
public class Category {
    private int mCategoryTitleId;
    private int mImageResourceId;
    private int mLevelsCount;
    private Class mClassName;
    public Category(int categoryTitleId, int imageResourceId, int levelsCount, Class className) {
        mCategoryTitleId = categoryTitleId;
        mImageResourceId = imageResourceId;
        mLevelsCount = levelsCount;
        mClassName = className;
    }

    public int getCategoryTitleId() {
        return mCategoryTitleId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getLevelsCount() {
        return mLevelsCount;
    }

    public Class getClassName() {
        return mClassName;
    }

    public void setClassName(Class className) {
        mClassName = className;
    }
}
