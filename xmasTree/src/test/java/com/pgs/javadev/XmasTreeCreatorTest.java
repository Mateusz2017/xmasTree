package com.pgs.javadev;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class XmasTreeCreatorTest {

    XmasTreeCreator xmasTreeCreator;

    @Before
    public void init() {
        xmasTreeCreator = new XmasTreeCreator();
    }
    @Test
    public void testSingleRowUp() {
        String tree = xmasTreeCreator.createXmasTree("x", 1, "up").toString();
		assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowUp() {
        String tree = xmasTreeCreator.createXmasTree("x", 2, "up").toString();
        assertThat(tree, equalTo(
                " x\n" +
                "xxx"));
    }

    @Test
    public void testOddRowUp() {
        String tree = xmasTreeCreator.createXmasTree("x", 3, "up".toString());
        assertThat(tree, equalTo(
                "  x\n" +
                " xxx\n" +
                "xxxxx"));
    }


    public void testSingleRowDown() {
    	String tree = xmasTreeCreator.createXmasTree("x", 1, "down").toString();
    	assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowDown() {
    String tree = xmasTreeCreator.createXmasTree("x", 2, "down").toString();
    assertThat(tree, equalTo(
            "xxx\n" +
            " x"));
    }	

    @Test
    public void testOddRowDown() {
    	String tree = xmasTreeCreator.createXmasTree("x", 3, "down".toString());
    	assertThat(tree, equalTo(
    			"xxxxx\n" +
    			" xxx\n" +
    			"  x"));
    }

    public void testSingleRowRight() {
    	String tree = xmasTreeCreator.createXmasTree("x", 1, "right").toString();
    	assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowRight() {
    	String tree = xmasTreeCreator.createXmasTree("x", 2, "right").toString();
    	assertThat(tree, equalTo(
    			"x\n" +
    			"xx\n" +
    			"x"));
}

    @Test
    public void testOddRowRight() {
    	String tree = xmasTreeCreator.createXmasTree("x", 3, "right".toString());
    	assertThat(tree, equalTo(
    			"x\n" +
    			"xx\n" +
    			"xxx\n" +
    			"xx\n" + 
    			"x"));
    }

    public void testSingleRowLeft() {
    String tree = xmasTreeCreator.createXmasTree("x", 1, "left").toString();
	assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowLeft() {
    	String tree = xmasTreeCreator.createXmasTree("x", 2, "left").toString();
    	assertThat(tree, equalTo(
    			" x\n" +
    			"xx\n" +
    			" x"));
    }

    @Test
    public void testOddRowLeft() {
    	String tree = xmasTreeCreator.createXmasTree("x", 3, "left".toString());
    	assertThat(tree, equalTo(
    			"  x\n" +
    			" xx\n" +
    			"xxx\n" +
    			" xx\n" +
    			"  x"));
    }

}
