package com.robertkoszewski.utils.splashscreen.api;

public interface SplashScreenManager {
	public void updateSplashMessage(String message);
	public void updateSplashMessage(String message, int step, int final_step);
}
