package org.jhotdraw.samples.svg.figures.handles;

import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.draw.handle.ResizeHandleKit;
import org.jhotdraw.samples.svg.figures.LinkHandle;
import org.jhotdraw.samples.svg.figures.SVGRectRadiusHandle;

import java.util.Collection;
import java.util.LinkedList;

public class RectFigureHandlesDetailLevelZeroStrategy implements HandleStrategy{
    @Override
    public Collection<Handle> createHandles(Figure figure) {
        LinkedList<Handle> handles = new LinkedList<>();
        ResizeHandleKit.addResizeHandles(figure, handles);
        handles.add(new SVGRectRadiusHandle(figure));
        handles.add(new LinkHandle(figure));
        return handles;
    }
}
