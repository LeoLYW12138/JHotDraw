package org.jhotdraw.draw.figure;

import org.jhotdraw.draw.text.FloatingTextField;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TextToolTest {
    private FloatingTextField floatingTextField;

    @Before
    public void setUp() {
        floatingTextField = new FloatingTextField();
    }

    @Test
    public void testChangeText() {
        floatingTextField.changeText("text changed");
        assertEquals("text changed", floatingTextField.getText());
    }

    @Test
    public void testNotChangeText() {
        assertNotSame("text hasnt changed", floatingTextField.getText());
    }
}
