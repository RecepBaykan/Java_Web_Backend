package com.nontius.proje;

import java.awt.geom.Rectangle2D;

import javax.swing.Action;

import org.lwjgl.opengl.GL46;
import org.lwjgl.system.windows.RECT;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Button;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Listener implements ApplicationListener {

	
	
	SpriteBatch batch;
	Texture img;
	int y = 0;
	boolean asagi = false;

	Vector2 position = new Vector2();
	Vector2 velocity = new Vector2();

	float speed = 10;

	List<Rectangle> items = new ArrayList<Rectangle>();
	float spawnTime = 0.01f;
	float currentTime = 0f;
	
	
	Rectangle rect;

	
	
	@Override
	public void create() {

		batch = new SpriteBatch();
		img = new Texture("1.png");
		rect = new Rectangle(position.x, position.y,32, 32);
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {

		Gdx.gl.glClearColor(0.2f, 0.3f, 1f, 0.3f);
		Gdx.gl.glClear(GL46.GL_COLOR_BUFFER_BIT);

		//spawnItems();
		
		velocity.set(0, 0);
		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			velocity.y += speed;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			velocity.y -= speed;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			velocity.x -= speed;
		}

		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			velocity.x += speed;
		}
		
		

		position.add(velocity);
		batch.begin();
		//drawItems();
		batch.draw(img, position.x, position.y, 32, 32);
		rect.x = position.x;
		rect.y = position.y;
		batch.end();

	}

	private void spawnItems() {
		currentTime += Gdx.graphics.getDeltaTime();

		if (currentTime >= spawnTime) {
			Rectangle rectangle = new Rectangle();
			rectangle.setSize(32, 32);
			rectangle.setPosition(MathUtils.random
							(Gdx.graphics.getWidth() - 32), MathUtils.random(Gdx.graphics.getHeight()-32));
			items.add(rectangle);
			currentTime -= spawnTime;
		}
		
	}
	
	private void drawItems() {
		for (Rectangle rectangle : items) {
			batch.draw(img, rectangle.x, rectangle.y,rectangle.width, rectangle.height);
			rectangle.x --;
			rectangle.y --;
			
			if(rectangle.overlaps(rect)) {
				
				
			}
		}
		System.out.println(items.size());
	}
	
	

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
		img.dispose();

	}

}
