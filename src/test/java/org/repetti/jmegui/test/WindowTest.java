package org.repetti.jmegui.test;

import com.jme3.app.SimpleApplication;
import com.jme3.input.event.MouseButtonEvent;
import com.jme3.math.Vector2f;
import tonegod.gui.controls.buttons.ButtonAdapter;
import tonegod.gui.controls.windows.Window;
import tonegod.gui.core.Screen;

/**
 * Created by repetti on 11/04/15.
 *
 * Not an classic "test" but an example demonstrating how to create basic GUI objects.
 */
public class WindowTest extends SimpleApplication {

    public static void main(String[] args) {
        System.out.println("### main()");
        WindowTest app = new WindowTest();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        //Mouse should be visible
        flyCam.setEnabled(false);

        // You can defil\ne your own style map here
        final Screen myScreen = new Screen(this);
        guiNode.addControl(myScreen);

        Window window = new Window(myScreen, "Main window", new Vector2f(15, 15));
        myScreen.addElement(window);

        ButtonAdapter newWindowButton = new ButtonAdapter(myScreen, "Button1", new Vector2f(15, 55)) {
            private int winCount = 0;

            @Override
            public void onButtonMouseLeftUp(MouseButtonEvent evt, boolean toggled) {

                Window newWindow = new Window(myScreen, "Window" + winCount,
                        new Vector2f((myScreen.getWidth() / 2) - 175, (myScreen.getHeight() / 2) - 100)
                );
                newWindow.setWindowTitle("New Window " + winCount);
                myScreen.addElement(newWindow);
                winCount++;
            }
        };
        window.addChild(newWindowButton);
    }
}
