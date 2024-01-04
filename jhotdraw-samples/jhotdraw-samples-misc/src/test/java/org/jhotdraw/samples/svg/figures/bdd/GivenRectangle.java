package org.jhotdraw.samples.svg.figures.bdd;

import com.tngtech.jgiven.Stage;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;

public class GivenRectangle extends Stage<GivenRectangle> {

    private SVGRectFigure svgRectFigure;

    public GivenRectangle rectangleDrawnOnTheCanvas() {
        svgRectFigure = new SVGRectFigure(0, 0, 100, 100);

        return self();
    }

    public SVGRectFigure getSvgRectFigure(){
        return svgRectFigure;
    }
}
