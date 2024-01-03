package org.jhotdraw.samples.svg.figures;

import org.jhotdraw.draw.handle.Handle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SVGRectFigureBoundaryTest {
    private SVGRectFigure rectFigure;

    @Before
    public void setUp() {
        rectFigure = mock(SVGRectFigure.class);
    }

    @Test
    public void testHandleCreationWithInvalidLevel() {
        Collection<Handle> handles = rectFigure.createHandles(-2);
        assertEquals(Collections.emptyList(), handles);

        assert handles.isEmpty() : "Something went wrong. Invalid detail level should return an empty Collection";
    }

}
