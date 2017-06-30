package test.java.jacoco.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.jacono.util.Util1;

public class UnitTest {

	@Test
	public void test(){
		Util1 util1 = new Util1();
		assertNotNull(util1.plus(1, 2));
	}
}
