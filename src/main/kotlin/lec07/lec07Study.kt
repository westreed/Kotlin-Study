package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(){
    // 코틀린에서 예외를 다루는 방법

    // try catch finally 구문
    // Checked Exception과 Unchecked Exception
    // try with resources

    // 주어진 문자열을 정수로 변경하는 예제
    fun parseIntOrThrow(str:String):Int {
        try {
            return str.toInt()
        }
        catch (e: NumberFormatException){
            throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
        }
    }

    fun parseIntOrThrowV2(str:String):Int? {
        return try {
            str.toInt()
        } catch (e: NumberFormatException){
            null
        }
        // try catch 문도 하나의 Expression 문으로 취급함.
    }

    // Checked Exception, Unckecked Exception
    val filePrinter = FilePrinter()
    filePrinter.readFile()
    filePrinter.readFile("./a.txt")
}

class FilePrinter {
    // Kotlin 에서는 Checked Exception과 Unchecked Exception을 구분하지 않음.
    // 전부 Unchecked Exception 이다.
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String){
        // Kotlin 에서는 try with resources 구문이 사리지고,
        // use라는 inline 확장함수만 사용함.
        BufferedReader(FileReader(path)).use {reader ->
            println(reader.readLine())
        }
    }
}