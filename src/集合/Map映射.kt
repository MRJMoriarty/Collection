package 集合

/*
* 映射是键值对<key,value>
* */
fun main() {
    var dic1 = mapOf<String,String>()
    var dic2 = mapOf<String,String>(
            Pair("id:1","Tom"),
            Pair("id:2","Merry") )
    println(dic2.keys)
    println(dic2.values)
}