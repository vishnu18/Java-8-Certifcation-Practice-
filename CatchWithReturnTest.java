import org.junit.*;
import org.junit.Assert;
public class CatchWithReturnTest {
	@Test
	public void exceptiontest() {
		CatchWithReturn.calculate();
		Assert.assertEquals(0, CatchWithReturn.calculate());
	}
}
