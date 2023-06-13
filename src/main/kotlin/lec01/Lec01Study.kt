package lec01

import lec01.Person

fun main() {
    var number1 = 10L
    val number2 = 10L // val은 final을 붙인 것과 같다. const 정적변수

    // 코틀린에서는 타입을 컴파일러에서 추론을 해줌.
    // 원한다면, 변수명 뒤에 `:타입`을 명시할 수 있다.
    // var number:Long = 10L
    // 초기값을 지정하지 않을 경우에는 무조건 타입을 지정해줘야 한다.
    // 코틀린에서는 자동적으로 primitive Type으로 지정해준다.

    var number3:Int?
    // 코틀린에서는 기본적으로 null을 넣을 수 없다.
    // null이 들어갈 수도 있을 땐, `타입?`를 사용해야한다.

    val person = Person("장세훈")
}