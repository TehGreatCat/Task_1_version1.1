package com.romanov;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsToNumsTest {

    private Integer answer;

    @Test
    public void SinglesTest() throws Exception {
        assertEquals(answer = 11, WordsToNums.WordsToNums("eleven"));
        assertEquals(answer = 2, WordsToNums.WordsToNums("two"));
    }

    @Test
    public void TensTest() throws Exception {
        assertEquals(answer = 27, WordsToNums.WordsToNums("twenty seven"));
        assertEquals(answer = 90, WordsToNums.WordsToNums("ninety"));
    }

    @Test
    public void HundredsTest() throws Exception {
        assertEquals(answer = 123, WordsToNums.WordsToNums("one hundred twenty three"));
        assertEquals(answer = 701, WordsToNums.WordsToNums("seven hundred one"));
    }

    @Test
    public void ThousandsTest() throws Exception {
        assertEquals(answer = 4004, WordsToNums.WordsToNums("four thousand four"));
        assertEquals(answer = 2029, WordsToNums.WordsToNums("two thousand twenty nine"));
        assertEquals(answer = 4510, WordsToNums.WordsToNums("four thousand five hundred ten"));
        assertEquals(answer = 9876, WordsToNums.WordsToNums("nine thousand eight hundred seventy six"));
    }

    @Test
    public void WrongCaseTest() throws Exception {
        assertEquals(answer = 54, WordsToNums.WordsToNums("FiFtY FOUr"));
        assertEquals(answer = 2104, WordsToNums.WordsToNums("TWO THOuSAND one hundred FOUr"));
    }

    @Test
    public void MisspellsTest() throws Exception {
        assertEquals(answer = 120, WordsToNums.WordsToNums("One thousant one hundred twenty sefen"));
    }

    @Test
    public void MulitileSimiliarKeywordsTest() throws Exception {
        assertEquals(answer = 1020, WordsToNums.WordsToNums("one thousand two thousand twenty twenty"));
    }

    @Test
    public void WrongOrderTest() throws Exception {
        assertEquals(answer = 451, WordsToNums.WordsToNums("fifty one four hundred"));
    }
}