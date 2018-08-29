
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;


public class blackJackTest{

	blackJack blackjack = new blackJack();
	@Test
	public void test() {

	assertEquals(10, blackjack.play(10, 22));
	assertEquals(9, blackjack.play(22, 9));
	assertEquals(0, blackjack.play(22, 22));
	assertEquals(10, blackjack.play(10, 7));
	assertEquals(19, blackjack.play(1, 19));
	assertEquals(0, blackjack.play(2, 2));

	}

}
