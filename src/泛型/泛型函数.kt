package 泛型
/*
* Kotlin中的in相当于Java中的？super，表示某某的父类
* Kotlin中的out相当于Java中的？extends，表示某某的子类
* */

fun main() {
    compare(1,"1")
    compare(1,1)
    var fathers:Array<out Animals> = emptyArray()
    var sons:Array<Dogs> = emptyArray()
    fathers = sons
    sons = fathers
}
fun <T,R> compare(a:T,b:R):Boolean{
    return a==b
}
open class Animals{}
class Dogs: Animals(){}

