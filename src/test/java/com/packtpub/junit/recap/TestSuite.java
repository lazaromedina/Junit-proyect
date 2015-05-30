package com.packtpub.junit.recap;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Created by luislazaro on 30/5/15.
 * lalazaro@keedio.com
 * Keedio
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ AssertTest.class, TestExecutionOrder.class,Assumption.class })
public class TestSuite {
}
