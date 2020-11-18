package com.dlsc.keyboardfx.demo;

import com.dlsc.keyboardfx.Keyboard;
import com.dlsc.keyboardfx.KeyboardPane;
import com.dlsc.keyboardfx.KeyboardView;

import javax.xml.bind.JAXBException;

public class KeyboardPaneWithArrowKeysApp extends KeyboardPaneDemoApp {

    @Override
    protected KeyboardPane createKeyboardPane() {
        KeyboardPane pane = super.createKeyboardPane();

        try {
            final Keyboard keyboard = pane.getKeyboardView().loadKeyboard(KeyboardView.class.getResourceAsStream("keyboard-with-arrows-fi.xml"));
            pane.setKeyboardLookupStrategy(node -> new Keyboard[]{keyboard});
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return pane;
    }
}