package br.com.bissexto.teste;
import org.junit.Assert;
import org.junit.Test;

import br.com.bissexto.Bissexto;;


public class TesteBissexto {

	@Test
	public void testeTrue() {
		Bissexto bi = new Bissexto();
		int bissexto1 = 2000;
		int bissexto2 = 1904;
		
		Assert.assertTrue(bi.isLeapYear(bissexto1));
		Assert.assertTrue(bi.isLeapYear(bissexto2));
	}
	
	@Test
	public void testeFalse() {
		Bissexto bi = new Bissexto();
		int bissexto1 = 1900;
		int bissexto2 = 1901;

		Assert.assertFalse(bi.isLeapYear(bissexto1));
		Assert.assertFalse(bi.isLeapYear(bissexto2));
		
	}
}
