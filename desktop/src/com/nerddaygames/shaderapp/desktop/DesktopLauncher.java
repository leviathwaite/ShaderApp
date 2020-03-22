package com.nerddaygames.shaderapp.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nerddaygames.shaderapp.ShaderApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		config.width = 800;
		config.height = 600;
		config.title = "Shader App";
		config.resizable = false;
		config.fullscreen = false;
		// config.vSyncEnabled = true;

		// TODO get display width and height to center correctly
		config.x = 200;
		config.y = 200;

		// LwjglWindow window = ((Lwjgl3Graphics)Gdx.graphics).getWindow();
		// Gdx.app.getGraphics().getMonitor().

		new LwjglApplication(new ShaderApp(), config);
	}
}
