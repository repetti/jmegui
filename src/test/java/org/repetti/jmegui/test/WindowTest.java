package org.repetti.jmegui.test;

import com.jme3.app.SimpleApplication;
import com.jme3.input.event.MouseButtonEvent;
import com.jme3.math.Vector2f;
import tonegod.gui.controls.windows.Window;
import tonegod.gui.core.Screen;
import tonegod.gui.controls.buttons.ButtonAdapter;

/**
 * Created by repetti on 11/04/15.
 */
public class WindowTest extends SimpleApplication {

    public static void main(String[] args) {
        System.out.println("### main()");
        WindowTest app = new WindowTest();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);

        // this = any JME Application
        final Screen myScreen = new Screen(this); //, "tonegod/gui/style/def/style_map.xml"
        guiNode.addControl(myScreen);

        Window win = new Window(myScreen, "win", new Vector2f(15, 15));
        myScreen.addElement(win);

        // create button and add to window
        ButtonAdapter makeWindow = new ButtonAdapter( myScreen, "Btn1", new Vector2f(15, 55) ) {
            @Override
            public void onButtonMouseLeftUp(MouseButtonEvent evt, boolean toggled) {

                createNewWindow(myScreen, "New Window " + winCount);
            }
        };

        // Add it to our initial window
        win.addChild(makeWindow);
    }

    private int winCount = 0;

    public final void createNewWindow(Screen screen, String windowTitle) {
        Window nWin = new Window(screen, "Window" + winCount,
            new Vector2f( (screen.getWidth()/2)-175, (screen.getHeight()/2)-100 )
        );
        nWin.setWindowTitle(windowTitle);
        screen.addElement(nWin);
        winCount++;
    }
}
