package com.packtpub.junit.recap;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 * Created by luislazaro on 29/5/15.
 * lalazaro@keedio.com
 * Keedio
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionTest {
    @Test
    public void edit() throws Exception {
        System.out.println("edit executed");
    }
    @Test
    public void create() throws Exception {
        System.out.println("create executed");
    }
    @Test
    public void remove() throws Exception {
        System.out.println("remove executed");
    }
}
