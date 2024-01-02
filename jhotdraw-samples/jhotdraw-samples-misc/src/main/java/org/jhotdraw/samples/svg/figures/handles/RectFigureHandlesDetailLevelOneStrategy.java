package org.jhotdraw.samples.svg.figures.handles;

import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.draw.handle.TransformHandleKit;

import java.util.Collection;
import java.util.LinkedList;

public class RectFigureHandlesDetailLevelOneStrategy implements HandleStrategy{
    @Override
    public Collection<Handle> createHandles(Figure figure) {
        LinkedList<Handle> handles = new LinkedList<>();
        TransformHandleKit.addTransformHandles(figure, handles);
        return handles;
    }
}