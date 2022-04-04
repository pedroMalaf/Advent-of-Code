import java.io.File

const val inputPath = "src/input/"

/**
 * Returns a string list from [fileName].
 */
fun readInput(fileName: String) = File(inputPath, "$fileName.txt").readLines()

/**
 * Returns an integer list from [fileName].
 */
fun readInputToInt(fileName: String) = readInput(fileName).map { it.trim().toInt() }

fun makePairs(input: List<String>) = input.map { it.split(' ') }.map { (a, b) -> a to b.toInt() }