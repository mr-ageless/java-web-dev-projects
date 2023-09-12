package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketsBetweenWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void bracketsAroundWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void oneBracketBeginningReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void bracketBackwardsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}