package com.nerddaygames.shaderapp;

import com.badlogic.gdx.Game;

public class ShaderApp extends Game
{
	private ShaderTestScreen gameScreen;


	@Override
	public void create()
	{
		// Gdx.graphics.setWindowedMode(800, 600);
		setGameScreen();
		// setEditorScreen();
	}


	public void setGameScreen()
	{
		setScreen(new ShaderTestScreen(this));
	}

	public void setEditorScreen()
	{
		setScreen(new CodeEditorScreen());
	}


	@Override
	public void dispose()
	{
		super.dispose();
	}
}