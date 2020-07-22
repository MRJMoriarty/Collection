package 泛型
/*
* 当定义一个类来操作数据时，如果数据类型是不确定的
* 需要使用泛型
* */
fun main() {
    val container = container<Int>()//自定义一个类存储Int型数据
    var btn = Button("按钮")
    btn.listener = Temp()
    btn.onClick()
}
class container<T> {
    private val data: MutableList<T> = mutableListOf()
    fun add(e: T) {
        data.add(e)
    }

    fun get(i: Int): T = data[i]
}//自定义一个类来存储数据

interface OnclickListener<T>{
    fun Listener(t:T)
}//定义一个泛型接口，表达某个类型被触发

class Temp:OnclickListener<Button>{
    override fun Listener(t: Button) {
       println("${t.Title}被点击")
    }
}//写一个类实现接口

class Button(var Title:String){
    var listener:OnclickListener<Button>? = null
    fun onClick(){
        listener?.Listener(this)
    }
}