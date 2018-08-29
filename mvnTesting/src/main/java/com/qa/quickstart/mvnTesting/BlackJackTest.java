package com.qa.quickstart.mvnTesting;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;


public class BlackJackTest extends TestCase {

	
	@Test
	public void test() {

	blackjack blackjack = new blackjack();

	assertEquals(10, blackjack.play(10, 22));
	assertEquals(9, blackjack.play(22, 9));
	assertEquals(0, blackjack.play(22, 22));
	assertEquals(10, blackjack.play(10, 7));
	assertEquals(19, blackjack.play(1, 19));

	}

}
