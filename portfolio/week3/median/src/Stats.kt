// COMP2850 Portfolio: Week 3
// Function to compute the median of a dataset

fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Cannot compute median of an empty list" }

    val sorted = data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2.0f
    } else {
        sorted[middle]
    }
}
