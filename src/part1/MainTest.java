package part1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	@BeforeEach
	public void setup() {
		System.setOut(new PrintStream(out));
	}

	@Test
	void test() {
		StarTree starTreeTest = new StarTree();
		starTreeTest.draw(4);
		Assert.assertEquals(
						"   *\r\n" + 
						"  ***\r\n" + 
						" *****\r\n" + 
						"*******\r\n", out.toString());
	}
	@Test
	void test2() {
		StarTree starTreeTest = new StarTree();
		starTreeTest.draw(5);
		Assert.assertEquals(
						"    *\r\n" + 
						"   ***\r\n" + 
						"  *****\r\n" + 
						" *******\r\n" +
						"*********\r\n", out.toString());
	}
	@Test
	void test3() {
		StarTree starTreeTest = new StarTree();
		starTreeTest.draw(8);
		Assert.assertEquals(
						"       *\r\n" + 
						"      ***\r\n" + 
						"     *****\r\n" + 
						"    *******\r\n" +
						"   *********\r\n" +
						"  ***********\r\n" +
						" *************\r\n" +
						"***************\r\n", out.toString());
	}

}
