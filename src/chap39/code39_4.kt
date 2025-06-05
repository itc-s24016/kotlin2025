package chap39
//ラムダ式(リストの処理)
fun main() {
    val list = listOf("あ", "い", "う", "え", "お")
    //表示
    val action1 = fun(x: String){ println(x) }
    list.forEach(action1)
    //ラムダ式だと
    //リストを回す = 一つずつ回す = 引数は一つなので、
    list.forEach {
        println(it)
        //break;
    }
    //ただし、break 等中断行為が出来ないので、その場合は
//    for (i in list){ println(i) }
}