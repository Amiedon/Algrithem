package SpringOffer.pattern;

/**
 * Created by Amie on 2019/1/29.
 */
public class Singleton {
    private static final  Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
