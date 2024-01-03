package org.jhotdraw.samples.svg.figures.handles;

import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.handle.Handle;

import java.util.Collection;

public interface HandleStrategy {
    Collection<Handle> createHandles(Figure figure);
}
