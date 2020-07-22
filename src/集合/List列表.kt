package 集合
/*
* List的特征是其元素以线性方式存储，集合中可以存放重复对象。
* List接口主要实现类包括
* (1)ArrayList() : 代表长度可以改变得数组
* (2)LinkedList(): 在实现中采用链表数据结构
* */
fun main() {
    //List的创建方法
    var names1:List<String> = List(3){"a";"b";"c"}
    var names2:List<String?> = List(3){null}
    var names3:List<String> = listOf()
    var names4:List<String> = listOf("a","b","c")
    var names5:List<String> = emptyList()
}