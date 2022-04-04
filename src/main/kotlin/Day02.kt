fun main(){
    val input = readInput("day02")
    println("Horizontal position times depth is: ${part1Day02(input)} ")
}

fun part1Day02(input: List<String>) :Int{
    var (x, y) = Pair(0, 0)
    val listPaired = makePairs(input)
    listPaired.forEach {
        when(it.first){
            "forward" -> x += it.second
            "down" -> y += it.second
            "up" -> y -= it.second
        }
    }
    return x * y
}