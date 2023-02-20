import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalcTest {
	
	private final Calc calc = new Calc();
	
	@Test
	void add() {
		assertEquals(2,calc.add(1, 1));
	}
	
}
