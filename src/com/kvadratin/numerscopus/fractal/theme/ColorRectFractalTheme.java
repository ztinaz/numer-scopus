package com.kvadratin.numerscopus.fractal.theme;

import org.anddev.andengine.entity.modifier.IEntityModifier;
import org.anddev.andengine.entity.modifier.RotationModifier;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.scene.background.IBackground;

import android.graphics.Color;
import android.graphics.Paint;

import com.kvadratin.numerscopus.fractal.NumberFractalPart;
import com.kvadratin.numerscopus.fractal.theme.font.IFontManager;
import com.kvadratin.numerscopus.fractal.theme.ornament.IOrnamentManager;

public class ColorRectFractalTheme implements IFractalTheme {
	
	private IBackground mBackground;
	private IFontManager mFontManager;
	private IOrnamentManager mOrnamentManager;
	
	public ColorRectFractalTheme(IFontManager pFontManager, IOrnamentManager pOrnamentManager){
		mBackground = new ColorBackground(1f, 1f, 1f);
		mFontManager = pFontManager;
		mOrnamentManager = pOrnamentManager;
	}
	
	@Override
	public int getActiveTextColor() {
		return Color.WHITE;
	}	

	@Override
	public IBackground getBackground() {
		return mBackground;
	}

	@Override
	public Paint getBorderPaint() {
		return null;
	}

	@Override
	public int getDisabledTextColor() {
		return Color.GRAY;
	}
	
	@Override
	public IFontManager getFontManager() {
		return mFontManager;
	}

	@Override
	public int getNextTextColor() {
		return Color.BLUE;
	}
	
	@Override
	public IOrnamentManager getOrnamentManager() {
		return mOrnamentManager;
	}

	@Override
	public int getTextColor() {
		return Color.WHITE;
	}
	
	@Override
	public boolean isBorderVisible() {
		return false;
	}

	@Override
	public IEntityModifier getOnClickOrnametModifier(NumberFractalPart pPart) {
		return new RotationModifier(2, 0, 360);
	}

	@Override
	public IEntityModifier getOnClickTextModifier(NumberFractalPart pPart) {
		return null;
	}

}
