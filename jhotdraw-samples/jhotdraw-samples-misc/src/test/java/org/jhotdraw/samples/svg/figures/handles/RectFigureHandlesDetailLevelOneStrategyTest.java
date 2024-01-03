package org.jhotdraw.samples.svg.figures.handles;

import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;

public class RectFigureHandlesDetailLevelOneStrategyTest {

    private RectFigureHandlesDetailLevelOneStrategy strategy;
    private SVGRectFigure rectFigure;

    @Before
    public void setUp() {
        strategy = new RectFigureHandlesDetailLevelOneStrategy();
        rectFigure = new SVGRectFigure(10, 10, 100, 100);
    }

    @Test
    public void testHandleCreationForLevelOne() {
        Collection<Handle> handles = strategy.createHandles(rectFigure);
        assertNotNull("Tests if handle is equal to null", handles);
        assertFalse("Tests if handles is empty", handles.isEmpty());
    }

}
