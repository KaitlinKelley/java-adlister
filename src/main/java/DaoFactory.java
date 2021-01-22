//this will create instances of our DAOs for us, as long as there isn't one already in use

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao(); //ListAdsDao() is a class that implements the Ads interface
        }
        return adsDao;
    }
}
