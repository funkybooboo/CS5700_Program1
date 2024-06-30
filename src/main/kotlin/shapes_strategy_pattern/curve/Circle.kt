package shapes_strategy_pattern.curve

import shapes_strategy_pattern.Point
import java.security.InvalidParameterException
import kotlin.math.PI

class Circle: Ellipse(), CurvePolicy {
    override fun isValidOrException(points: List<Point>, radii: List<Double>) {
        if (points.size != 1) throw IllegalArgumentException("A Circle has one point");
        if (radii.size != 1) throw IllegalArgumentException("A Circle has one radius");
        if (radii[0] == 0.0) throw InvalidParameterException("Radius can not be 0.0");
    }

    override fun area(points: List<Point>, radii: List<Double>): Double = PI * radii[0] * radii[0];
}