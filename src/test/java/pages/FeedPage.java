package pages;

public class FeedPage {
    private static FeedPage instance;



    public static FeedPage getInstance(){

        if (instance == null){
            instance = new FeedPage();
        }
        return instance;
    }
}
