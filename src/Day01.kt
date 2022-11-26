
fun main() {
    fun part1(input: List<String>): Int {
        var checkSum = 0
        for (line in input) {
            val values = line.split("\t")
            checkSum += values.maxOf { it.toInt() } - values.minOf { it.toInt() }
        }
        return checkSum
    }

    fun part2(input: List<String>): Int {
        var checkSum = 0
        for (line in input) {
            checkSum += (line.split("\t").maxOf { it.toInt() }
                        - line.split("\t").minOf { it.toInt() })
        }
        return checkSum
    }

//    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}



