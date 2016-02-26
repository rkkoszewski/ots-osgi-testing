package com.robertkoszewski.utils.splashscreen;

import org.osgi.service.component.annotations.Component;

import com.robertkoszewski.utils.splashscreen.api.SplashScreenManager;

@Component
public class SimpleSplashScreenManager implements SplashScreenManager{

	@Override
	public void updateSplashMessage(String message) {
		System.out.println("SPLASH MESSAGE: "+message);
	}

	@Override
	public void updateSplashMessage(String message, int step, int final_step) {
	}

}
