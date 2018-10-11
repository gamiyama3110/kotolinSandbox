package sandbox.controller.hoge

import javafx.application.Application
import sandbox.application.hoge.HogehogeApplication

fun main(args: Array<String>) {

    println("hello, hogehoge")

    Application.launch(HogehogeApplication().javaClass, *args)
}