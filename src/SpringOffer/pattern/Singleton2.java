package SpringOffer.pattern;

/**
 * Created by Amie on 2019/1/29.
 */
public class Singleton2 {
//    private static volatile Singleton2 singleton2;
//    private Singleton2(){}
//    public static Singleton2 getInstance(){
//        if (singleton2 == null){
//            synchronized (Singleton2.class){
//                if (singleton2 == null)
//                    singleton2 = new Singleton2();
//            }
//        }
//        return singleton2;
//    }
//    private static volatile Singleton2 singleton2;
//    public Singleton2(){}
//    public static Singleton2 getSingleton2(){
//        if (singleton2 == null){
//            synchronized (Singleton2.class){
//                if (singleton2 == null){
//                    singleton2 = new Singleton2();
//                }
//            }
//        }
//        return singleton2;
//    }
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null)
            singleton2 = new Singleton2();
        return singleton2;
    }
}
