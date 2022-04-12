package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concepts {
	
	@Test(enabled = false)
	private void books() {
		System.out.println("books");

	}
	@Test(priority = -1)
	private void wikipedia() {
		System.out.println("wikipedia");

	}

	@Test(priority = 0)
	private void whatsapp() {
		System.out.println("whatsapp");

	}
	@Test(priority = 1)
	private void facebook() {
		System.out.println("facebook");

	}
	@Ignore
	@Test
	private void instagram() {
		System.out.println("instagram");

	}
	@Test(priority = 3)
	private void spotify() {
		System.out.println("spotify");

	}
	@Test(priority = 4)
	private void wynk_music() {
		System.out.println("wynk_music");

	}




}
