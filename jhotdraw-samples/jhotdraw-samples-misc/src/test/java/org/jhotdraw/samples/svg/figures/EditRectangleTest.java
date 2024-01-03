package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.jhotdraw.samples.svg.figures.bdd.GivenRectangle;
import org.jhotdraw.samples.svg.figures.bdd.ThenRectangleResized;
import org.jhotdraw.samples.svg.figures.bdd.WhenHandleDragged;
import org.junit.Test;

public class EditRectangleTest extends ScenarioTest<GivenRectangle, WhenHandleDragged, ThenRectangleResized> {

    @Test
    public void ResizedRectangle() {
        given().rectangleDrawnOnTheCanvas();
        when().handleIsDragged(given().getSvgRectFigure());
        then().rectangleResized(when().getRectFigure());
    }

}
