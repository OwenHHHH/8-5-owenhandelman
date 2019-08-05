fun unless(condition:Boolean, code: ()->Unit){
    if (!condition) {
        code()
    }
}
fun main() {
    val options = arrayOf("RED", "AMBER", "GREEN")
    var crossWalk = options[(Math.random()*options.size).toInt()]
    if (crossWalk == "GREEN") {
        println("Walk!")
    }
    unless(crossWalk == "GREEN"){
        println("Stop!")
    }
}