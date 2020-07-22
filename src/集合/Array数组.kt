package 集合

/*
* Kotlin的数组不像C和Java那样
* Kotlin的数组定义是一种新的语句
* */

var names = Array<String>(3){
    "$it"
}//数组名为names，长度为3，数组类型为String
fun main() {
    for (i in names.indices){
        println(names[i])
    }
}

