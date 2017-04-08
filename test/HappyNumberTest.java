import static org.junit.Assert.*;
import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void testaNumero1() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("feliz", happyNumber.test(1));
	}
	@Test
	public void testaNumero4() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("infeliz", happyNumber.test(4));
	}
	@Test
	public void testaNumero7() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("infeliz", happyNumber.test(7));
	}
	@Test
	public void testaNumero10() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("feliz", happyNumber.test(10));
	}
	@Test
	public void testaNumero100() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("feliz", happyNumber.test(100));
	}
	@Test
	public void testaNumero1000() {
		HappyNumber happyNumber = new HappyNumber();
		assertEquals("feliz", happyNumber.test(1000));
	}
}
