package testing;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitPoetryTest {
	  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	  private final PrintStream oPrintStream = System.out;

	  @Before
	  public void setUpStream() {
	    System.setOut(new PrintStream(outputStream));
	  }

	  @After
	  public void restoreStream() {
	    System.setOut(oPrintStream);
	  }

	  @Test
	  public void isPoetry() {
	    testing.Poetry.main(null);
	    assertEquals("Poetry not same", "Heav'ns", outputStream.toString());

		String data = testing.Poetry.Poet();
	    assertEquals("Poetry class", "The Heav'ns and all the Constellations rung", data);
	  }
}
