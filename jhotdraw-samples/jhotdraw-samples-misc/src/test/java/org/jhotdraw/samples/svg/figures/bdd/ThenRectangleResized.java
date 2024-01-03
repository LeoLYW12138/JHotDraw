package org.jhotdraw.samples.svg.figures.bdd;

import com.tngtech.jgiven.Stage;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;

import static org.junit.Assert.*;

public class ThenRectangleResized extends Stage<ThenRectangleResized> {

    public ThenRectangleResized rectangleResized(SVGRectFigure rectFigure) {
        double expectedWidth = 150;
        double expectedHeight = 150;

        assertEquals("Test if width is resized", expectedWidth, rectFigure.getBounds().getWidth(), 0.01);
        assertEquals("Test if height is resized", expectedHeight, rectFigure.getBounds().getHeight(),0.01);

        return self();
    }

}
