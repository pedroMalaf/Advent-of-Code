fun main() {
    val input = readInput("day03")
    println(part1Day03(input))
}

fun part1Day03(input: List<String>) :Int{
    val columns = input[0].indices
    var gammaRate = ""
    for (column in columns) {
        val bitCount = input.countBitsInColumn(column)
        val zeroes = bitCount.first
        val ones = bitCount.second
        val commonBit = if ( zeroes > ones ) "0" else "1"
        gammaRate += commonBit
    }
    var epsilon = ""
    for (element in gammaRate){
        epsilon += if (element == '0' ) '1'
        else '0'
    }
    return gammaRate.toInt(2) * epsilon.toInt(2)
}

fun part2Day03(input: List<String>){

}


//Returns the number of zeroes and ones in each column
private fun List<String>.countBitsInColumn(column: Int): Pair<Int, Int> {
    var zeroes = 0
    var ones = 1
    for (line in this){
        if (line[column] == '0') zeroes++
        else ones++
    }
    return Pair (zeroes, ones)
}

