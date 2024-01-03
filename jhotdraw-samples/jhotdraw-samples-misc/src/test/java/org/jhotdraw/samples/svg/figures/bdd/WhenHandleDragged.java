package org.jhotdraw.samples.svg.figures.bdd;

import com.tngtech.jgiven.Stage;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;

import java.awt.geom.Point2D;

public class WhenHandleDragged extends Stage<WhenHandleDragged> {

    private SVGRectFigure svgRectFigure;

    public WhenHandleDragged handleIsDragged(SVGRectFigure rectFigure) {
        Point2D.Double newPoint = new Point2D.Double(150,150);
        rectFigure.setBounds(rectFigure.getStartPoint(), newPoint);
        svgRectFigure = rectFigure;

        return self();
    }

    public SVGRectFigure getRectFigure() {
        return svgRectFigure;
    }
}
