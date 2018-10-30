import java.net.Socket

fun main(args: Array<String>) {
    try {
        var cnt = 0
        while (cnt < 3) {
            val socket = Socket(Constant.Connection.HOST_NAME, Constant.Connection.PORT_NUMBER)
            val connection = ConnectToServer(socket, "Hello World from $cnt")
            connection.start()
            cnt++
        }
    } catch (e: Exception) {
        print(e.toString())
    }
}