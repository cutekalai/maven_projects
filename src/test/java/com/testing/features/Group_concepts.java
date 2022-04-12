package com.testing.features;


import org.testng.annotations.Test;

public class Group_concepts {
	@Test(groups = "Books")
	private void books() {
		System.out.println("books");

	}
	@Test(groups = "Books")
	private void wikipedia() {
		System.out.println("wikipedia");

	}

	@Test(groups = "social media")
	private void whatsapp() {
		System.out.println("whatsapp");

	}
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("facebook");

	}
	
	@Test(groups = "social media")
	private void instagram() {
		System.out.println("instagram");

	}
	@Test(groups = "music")
	private void spotify() {
		System.out.println("spotify");

	}
	@Test(groups = "music")
	private void wynk_music() {
		System.out.println("wynk_music");

	}



	

}
