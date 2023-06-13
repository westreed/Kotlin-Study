package lec02

import java.lang.IllegalArgumentException

fun main(){
    // 코틀린에서 null을 다루는 방법

    // Safe Call
    // val str: String? = "ABC"
    val str: String? = null
    // println(str.length) // str이 null일수도 있기 때문에 불가능
    println(str?.length) // 가능 !! 만약, null값이면 반환값도 null이 된다!
    println(str?.length ?: "Null이 왔습니다.") // Elvis 연산자! 앞의 연산 결과가 null이면 뒤의 값을 사용!

    // 플랫폼 타입
    // Kotlin에서 Java 코드를 가져다 사용할 때 어떻게 처리될까?!
    val person = Person("공부하는 개발자")
    println(person.name)
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

fun startsWithA4(str: String?): Boolean {
    // `!!`는 이 변수가 절대로 null일 수 없다고 컴파일러에게 알려주는 의미임.
    return str!!.startsWith("A")
}