package com.pgs.javadev;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();
//        System.out.println(creator.createXmasTree("x", 10, "up"));
//        System.out.println(creator.createXmasTree("x", 10, "down"));
//        System.out.println(creator.createXmasTree("x", 10, "left"));
        System.out.println(creator.createXmasTree("x", 3, "right"));
    }

}
