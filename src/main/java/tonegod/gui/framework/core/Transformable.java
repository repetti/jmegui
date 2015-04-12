/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tonegod.gui.framework.core;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import tonegod.gui.framework.animation.TemporalAction;

/**
 *
 * @author t0neg0d
 */
public interface Transformable {
	public void setPosition(float x, float y);

	public void setScale(float x, float y);

	public void setOrigin(float x, float y);

	public void setDimensions(float w, float h);

	public void setSkew(float x, float y);

	public Vector2f getPosition();

	public void setPosition(Vector2f pos);

	public float getPositionX();

	public void setPositionX(float x);

	public float getPositionY();

	public void setPositionY(float y);

	public float getPositionZ();

	public void setPositionZ(float z);

	public float getRotation();

	public void setRotation(float rotation);

	public Vector2f getScale();

	public void setScale(Vector2f scale);

	public float getScaleX();

	public void setScaleX(float scaleX);

	public float getScaleY();

	public void setScaleY(float scaleY);

	public Vector2f getOrigin();

	public void setOrigin(Vector2f origin);

	public float getOriginX();

	public void setOriginX(float originX);

	public float getOriginY();

	public void setOriginY(float originY);

	public ColorRGBA getColor();

	public void setColor(ColorRGBA color);

	public float getColorR();

	public void setColorR(float r);
	
	public float getColorG();

	public void setColorG(float g);

	public float getColorB();

	public void setColorB(float b);

	public float getColorA();

	public void setColorA(float a);

	public Vector2f getDimensions();

	public void setDimensions(Vector2f dim);

	public float getWidth();

	public void setWidth(float w);

	public float getHeight();

	public void setHeight(float h);

	public Vector2f getTCOffset();

	public float getTCOffsetX();

	public void setTCOffsetX(float x);

	public float getTCOffsetY();

	public void setTCOffsetY(float y);

	public Vector2f getSkew();

	public void setSkew(Vector2f skew);

	public float getSkewX();

	public void setSkewX(float x);

	public float getSkewY();

	public void setSkewY(float y);

	public boolean getIgnoreMouse();

	public void setIgnoreMouse(boolean ignoreMouse);

	public boolean getIsMovable();

	public void setIsMovable(boolean isMovable);
	
	public void addAction(TemporalAction action);
	
	public boolean getContainsAction(TemporalAction action);
}
