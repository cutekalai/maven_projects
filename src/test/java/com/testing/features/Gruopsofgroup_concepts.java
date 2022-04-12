package com.testing.features;

import org.testng.annotations.Test;

public class Gruopsofgroup_concepts {

	@Test(groups = "Books")
	private void books() {
		System.out.println("books");

	}
	@Test(priority = -1,groups = "Books")
	private void wikipedia() {
		System.out.println("wikipedia");

	}

	@Test(priority = -3,groups = "social media")
	private void whatsapp() {
		System.out.println("whatsapp");

	}
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("facebook");

	}
	
	@Test(priority = -3,groups = "social media")
	private void instagram() {
		System.out.println("instagram");

	}
	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");

	}
	@Test(priority = 1,groups = "music")
	private void wynk_music() {
		System.out.println("wynk_music");

	}



	

}
