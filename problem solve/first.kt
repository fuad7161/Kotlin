fun main() {
    val n = readLine()!!.toInt()
    val events = mutableMapOf<Int,Int>()
    repeat(n){
        val (a,b) = readInts()
        events[a] = events.getOrDefault(a,0)+1
        events[b] = events.getOrDefault(b,0)-1
    }
    var alive = 0
    var best = 0
    var bestYear = 0
    for (k in events.keys.sorted()){
        alive += events[k]!!
        if(best < alive){
            best = alive
            bestYear = k
        }
    }
    println("$bestYear $best")
}


fun readInt() = readLine()!!.toInt()
fun readLong() = readLine()!!.toLong()
fun readLongs() = readLine()!!.split(" ").map{it.toInt()}
fun readInts() = readLine()!!.split(" ").map{it.toInt()}
