package com.nontius.proje;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class GameButton extends Game {

	Stage stage;
	TextButton textButton;
	TextButtonStyle buttonStyle;
	BitmapFont font;
	Skin skin;
	TextureAtlas atlas;
	
	@Override
	public void create() {
		
		stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        font = new BitmapFont();
        skin = new Skin();
        atlas = new TextureAtlas(Gdx.files.internal("buttons/buttons.pack"));
        skin.addRegions(atlas);
        buttonStyle = new TextButtonStyle();
        buttonStyle.font = font;
        buttonStyle.up = skin.getDrawable("up-button");
        buttonStyle.down = skin.getDrawable("down-button");
        buttonStyle.checked = skin.getDrawable("checked-button");
        textButton = new TextButton("Button1", buttonStyle);
        stage.addActor(textButton);
	}
	
	@Override
    public void render() {      
        super.render();
        stage.draw();
    }


}
