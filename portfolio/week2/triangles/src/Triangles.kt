// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val (side1, side2, side3) = triangle
    return side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2
}

fun triangleArea(triangle: Triangle): Double {
    val (side1, side2, side3) = triangle

    val s = (side1 + side2 + side3) / 2.0
    val area = sqrt(s * (s - side1) * (s - side2) * (s - side3))

    return area
}
