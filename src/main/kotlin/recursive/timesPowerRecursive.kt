package recursive

fun main() {
    println(times(5, 5))
    println(power(4, 5))
}

fun times (a:Int, b:Int): Int {
    return if (b == 1) {
        a
    } else {
        a + times(a,b - 1)
    }
}

fun power (a:Int, exponent:Int): Int {
    return if (exponent == 1) {
        a
    } else {
        times(a, power(a, exponent - 1))
    }
}


// 2 ^ 3 = 8
// 2 * (2 * 2) = 8
// 2 + 2 + 2 + 2 = 8

// 2 ^ 4 = 16
// 2 * 2 * 2 * 2 = 16
// 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 + 2 = 16
