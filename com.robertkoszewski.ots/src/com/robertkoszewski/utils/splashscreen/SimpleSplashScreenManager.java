package com.robertkoszewski.utils.splashscreen;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.robertkoszewski.utils.splashscreen.api.SplashScreenManager;


@Component
public class SimpleSplashScreenManager implements SplashScreenManager{

	@Activate
	public void activate(BundleContext ctx) {
		System.out.println("@ Registering Splash Service");
		ctx.registerService(
				SplashScreenManager.class.getName(), 
				new SimpleSplashScreenManager(), null);
	}
	
	@Deactivate
	public void deactivate(BundleContext ctx) {
		System.out.println("@ UNRegistering Splash Service");
	}

	@Override
	public void updateSplashMessage(String message) {
		System.out.println("SPLASH MESSAGE: "+message);
	}

	@Override
	public void updateSplashMessage(String message, int step, int final_step) {
	}

}
