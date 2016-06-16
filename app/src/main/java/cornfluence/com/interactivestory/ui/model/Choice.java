package cornfluence.com.interactivestory.ui.model;

/**
 * Created by diempham on 1/17/16.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {

        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {

        return mNextPage;
    }

    public void setNextPage(int nextPage) {

        mNextPage = nextPage;
    }
}
