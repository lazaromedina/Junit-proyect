package com.packtpub.junit.recap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;



import org.junit.Assert;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Created by luislazaro on 29/5/15.
 * lalazaro@keedio.com
 * Keedio
 */

//@RunWith(JUnit4.class)
public class AssertTest {
    @Test
    public void assertTrueAndFalseTest() throws Exception {
        assertTrue(true);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }
    @Test
    public void assertNullAndNotNullTest() throws Exception {
        Object myObject = null;
        Assert.assertNull(myObject);
        myObject = new String("Some value");
        Assert.assertNotNull(myObject);
    }

    @Test
    public void assertEqualsTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");;
        assertEquals(i,j);
    }

    @Test
    public void assertNotSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = new Integer("5");;
        assertNotSame(i , j);
    }


    @Test
    @Ignore("ignorado")
    public void assertSameTest() throws Exception {
        Integer i = new Integer("5");
        Integer j = i;
        assertSame(i,j);
        System.out.println("ejecutado");
    }
}
