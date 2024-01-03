package org.jhotdraw.samples.svg.figures;

import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.samples.svg.figures.handles.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;

public class SVGRectFigureTest {
    private SVGRectFigure rectFigure;
    private HandleStrategyFactory strategyFactory;
    HandleStrategy strategy;

    @Before
    public void setUp() {
        rectFigure = new SVGRectFigure(10, 10, 100, 100);
        strategyFactory = new RectFigureHandlesFactory();
    }

    @Test
    public void testCreateHandlesUsingDifferentStrategies() {
        Collection<Handle> handlesZero = rectFigure.createHandles(0);
        assertNotNull("Tests if handle is equal to null for detail 0", handlesZero);

        strategy = strategyFactory.createHandleStrategy(0);
        assertTrue("Tests if Strategy is the correct type", strategy instanceof RectFigureHandlesDetailLevelZeroStrategy);

        Collection<Handle> handlesOne = rectFigure.createHandles(1);
        assertNotNull("Tests if handle is equal to null for detail 1", handlesOne);

        strategy = strategyFactory.createHandleStrategy(1);
        assertTrue("Tests if Strategy is the correct type", strategy instanceof RectFigureHandlesDetailLevelOneStrategy);

        Collection<Handle> handlesHover = rectFigure.createHandles(-1);
        assertNotNull("Tests if handle is equal to null for detail -1", handlesHover);

        strategy = strategyFactory.createHandleStrategy(-1);
        assertTrue("Tests if Strategy is the correct type", strategy instanceof RectFigureHandlesMouseHoverStrategy);
    }

}