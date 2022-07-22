package org.learn.java;

import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class StringModifierTest {

    @Test
    public void replaceAllATest(){
        String testString = "all is well";
        String returnedString = new StringModifier().replaceAllA(testString);

        assertThat(returnedString, not(containsString("a")));
    }
}
