package test.prot;

import test.publ.MainPublic;

public class MainProtect {
    protected static String protectedString = "hello";
    public static void main(String[] args) {
//        System.out.println(MainPublic.publicString);
        System.out.println(MainProtect.protectedString);
    }
}
