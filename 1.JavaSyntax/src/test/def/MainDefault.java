package test.def;

import test.privat.MainPrivate;
import test.publ.MainPublic;

public class MainDefault {
    static String defaultString = "hello";
    public static void main(String[] args) {
//        System.out.println(MainPublic.publicString);
//        System.out.println(MainPrivate.privateString);
        System.out.println(defaultString);
    }
}
