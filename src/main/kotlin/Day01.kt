fun main() {
    val input = readInputToInt("day01")
    println("Number of times increased: ${part1Day01(input)}")
    println("Number of times increased: ${part2Day01(input)}")
}

fun part1Day01(input: List<Int>): Int{
    var count = 0
    for (i in 1 until  input.size){
        if ( input[i] > input[i-1]) count += 1
    }
    return count
}

fun part2Day01(input: List<Int>) = part1Day01(input.windowed(3).map { it -> it.sum() })