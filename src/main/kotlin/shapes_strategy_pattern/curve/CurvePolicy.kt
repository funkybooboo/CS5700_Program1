package shapes_strategy_pattern.curve

import shapes_strategy_pattern.Point

interface CurvePolicy {
    fun isValidOrException(points: List<Point>, radii: List<Double>);
    fun area(points: List<Point>, radii: List<Double>): Double;
}