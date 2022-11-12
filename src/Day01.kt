
fun main() {
    fun part1(input: List<String>): Int {
        var checkSum = 0
        for (values in input) {
            val num = values.split(' ')
            checkSum += num.maxOf { it.toInt() } - num.minOf { it.toInt() }
        }
        return checkSum
    }

    fun part2(input: List<String>): Int {
        var checkSum = 0
        for (values in input) checkSum += (values.split(' ').maxOf { it.toInt() } - values.split(' ')
            .minOf { it.toInt() })
        return checkSum
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}



