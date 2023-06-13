package lec02

import java.lang.IllegalArgumentException

fun main(){
    // 코틀린에서 null을 다루는 방법

    // Safe Call
//    val str: String? = "ABC"
    val str: String? = null
    // println(str.length) // str이 null일수도 있기 때문에 불가능
    println(str?.length) // 가능 !! 만약, null값이면 반환값도 null이 된다!
    println(str?.length ?: "Null이 왔습니다.") // Elvis 연산자! 앞의 연산 결과가 null이면 뒤의 값을 사용!
}

fun startsWithA1(str: String?): Boolean {
//    if(str == null) throw IllegalArgumentException("null이 들어왔습니다.")
//    return str.startsWith("A")
    // 위의 코드를 코틀린스럽게 바꾸면, Elvis 연산자를 사용하여 다음과 같이 바꿀 수 있다.
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if(str == null) return null
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if(str == null) return false
//    return str.startsWith("A")
    return str?.startsWith("A") ?: false
}