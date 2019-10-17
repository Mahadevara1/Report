package com.stepdefinitions;


import com.resources.Base;

	import cucumber.api.java.After;
	import cucumber.api.java.Before;

	public class Hooks extends Base {
		@Before
		public static void beforeScenario() {
			 launchBrowser();
		
				
				
				
			
		}
		@After
		public void afterScenario() {
			quitBrowser();
		}

	}


