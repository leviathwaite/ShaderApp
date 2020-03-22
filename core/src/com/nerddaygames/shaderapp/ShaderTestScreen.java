package com.nerddaygames.shaderapp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class ShaderTestScreen extends ScreenAdapter implements InputProcessor
{
    String tag = getClass().getSimpleName();

    ShaderApp game;
    // private ExtendViewport viewport;
    private StretchViewport viewport;
    private static int VIEWPORT_WIDTH = 800;
    private static int VIEWPORT_HEIGHT = 600;

    SpriteBatch batch;
    Texture img;
    Sprite sprite;
    String vertexShader;
    String fragmentShader;
    ShaderProgram shaderProgram;

    public ShaderTestScreen(ShaderApp game)
    {
        this.game = game;
    }

    @Override
    public void resize(int width, int height)
    {
        super.resize(width, height);
    }

    @Override
    public void show()
    {
        super.show();
        Gdx.input.setInputProcessor(this);
        viewport = new StretchViewport(VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        sprite = new Sprite(img);
        sprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        vertexShader = Gdx.files.internal("vertex.glsl").readString();
        fragmentShader = Gdx.files.internal("fragment.glsl").readString();

        shaderProgram = new ShaderProgram(vertexShader,fragmentShader);
        // use to check if shader will run, if not load default
        // shaderProgram.isCompiled();
    }

    @Override
    public void render(float delta)
    {
        super.render(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.setShader(shaderProgram);
        batch.draw(sprite,sprite.getX(),sprite.getY(),sprite.getWidth(),sprite.getHeight());
        batch.end();




    }

    /*
    float delay = 5; // seconds
    Timer.schedule(new Timer.Task(){
    @Override
    public void run() {
        // Do your work
        // LoadShaderFile();
        Gdx.app.log(tag, "How about now?");
    }
    }, delay);
     */
    private void LoadShaderFile()
    {

    }

    @Override
    public void hide()
    {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public boolean keyDown(int keycode)
    {
        return false;
    }

    @Override
    public boolean keyUp(int keycode)
    {
        switch(keycode)
        {
            case Input.Keys.ESCAPE:
                Gdx.app.exit();
                break;
            default:
                break;
        }

        return false;
    }

    @Override
    public boolean keyTyped(char character)
    {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer)
    {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY)
    {
        return false;
    }

    @Override
    public boolean scrolled(int amount)
    {
        return false;
    }



    @Override
    public void dispose() {
        super.dispose();
    }
}
