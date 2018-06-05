package de.walter;

import org.junit.Test; 
import static org.junit.Assert.*; 

public class UtilTest {  
	@Test
	public void Test4() { 
		    
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(1));
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(2));
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(3));
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(4));
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(5));
		assertTrue("Erstes Halbjahr!",Util.istErstesHalbjahr(6));
		//fail("servus");
	}

}
