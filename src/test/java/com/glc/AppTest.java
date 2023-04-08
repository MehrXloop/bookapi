package com.glc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

     //AC 1:Given that I visit the site, when I first start, I expect my list to be empty.

    @Test
    public void emptyList(){
        //Setup
        ReadingList readingList = new ReadingList();
        //Assert
        List<String> bookList = readingList.bookList;
        assertEquals(0,bookList.size());
    }
}
