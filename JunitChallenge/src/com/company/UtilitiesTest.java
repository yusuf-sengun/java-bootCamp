package com.company;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;
    @org.junit.Before
    public void initilaize(){
        utilities = new Utilities();
    }


    @org.junit.Test
    public void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'},output);
        char[] output2 = utilities.everyNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDF",utilities.removePairs("AABCDF"));
        assertEquals("ABCDCF",utilities.removePairs("AABCDCFF"));
        assertEquals(null,utilities.removePairs(null));
        assertEquals("A",utilities.removePairs("A"));
        assertEquals("",utilities.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300,utilities.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        utilities.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals(null,utilities.nullIfOddLength("abc"));
        assertEquals("abcd",utilities.nullIfOddLength("abcd"));
    }
}