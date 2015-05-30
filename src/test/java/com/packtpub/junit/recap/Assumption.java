package com.packtpub.junit.recap;

import org.junit.Test;
import org.junit.Assume;
import static org.junit.Assert.assertTrue;

/**
 * Created by luislazaro on 30/5/15.
 * lalazaro@keedio.com
 * Keedio
 */
public class Assumption {
    boolean isSonarRunning = false;
    @Test
    public void very_critical_test() throws Exception {
        isSonarRunning = true;
        Assume.assumeFalse(isSonarRunning);
        System.out.println("si el test se está ignorando esto no se imprimirá");
        assertTrue(true);
    }
}
