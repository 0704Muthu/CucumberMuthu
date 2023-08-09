package com.testng;

import org.testng.annotations.Test;


public class Firefox  {
	@Test(groups = "mi")
	private void miBrands() {
		System.out.println("mi 10");
	}

	@Test(groups = "mi",dependsOnGroups = "samsung")
	private void samsungBrands() {
		System.out.println("Samsung m series");
	
	}
	
	@Test(groups = "samsung")
	private void samsung() {
		System.out.println("sams");
		//throw new RuntimeException();
	}

	
}
