fun main() {
    val input = readInputToInt("day01")
    println("Solution to part 1 is: ${part1(input)}")
    println()
}

fun part1(input: List<Int>): Int{
    var count = 0
    for (i in 1 until  input.size){
        if ( input[i] > input[i-1]) count += 1
    }
    return count
}