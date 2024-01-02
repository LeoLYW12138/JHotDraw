package org.jhotdraw.samples.svg.figures.handles;

public class RectFigureHandlesFactory implements HandleStrategyFactory{
    @Override
    public HandleStrategy createHandleStrategy(int detailLevel) {
        switch (detailLevel % 2) {
            case -1: // Mouse hover handles
                return new RectFigureHandlesMouseHoverStrategy();
            case 0:
                return new RectFigureHandlesDetailLevelZeroStrategy();
            case 1:
                return new RectFigureHandlesDetailLevelOneStrategy();
            default:
                throw new IllegalArgumentException("Invalid DetailLevel: " + detailLevel);
        }
    }
}
