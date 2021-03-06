package com.ricky.screen;

import com.ricky.asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

/**
 *
 * @author Aeranythe Echosong
 */
public abstract class RestartScreen implements Screen {

    @Override
    public abstract void displayOutput(AsciiPanel terminal);

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                return new PlayScreen();
            default:
                return this;
        }
    }

}