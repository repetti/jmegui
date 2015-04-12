/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tonegod.gui.core.layouts;

import tonegod.gui.core.Element;
import tonegod.gui.core.ElementManager;

/**
 *
 * @author t0neg0d
 */
public interface Layout {
	public Layout define(String... params);
	public Layout set(String param);
	public LayoutParam get(String key);
	public void resize();

	public boolean getHandlesResize();

	public void setHandlesResize(boolean handleResize);

	public void setOwner(Element el);
	public ElementManager getScreen();
	public void layoutChildren();
}