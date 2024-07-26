package com.nontius.proje;

import javax.swing.border.TitledBorder;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;


public class Screen {

	private Lwjgl3ApplicationConfiguration config;
	private Lwjgl3Application app;


	public Screen() {

		config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Deneme");
		config.setWindowedMode(720, 360);
		
		config.useVsync(true);
		app = new Lwjgl3Application(new Listener() ,config);
	}

}
