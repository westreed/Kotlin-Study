package lec03

import java.lang.IllegalArgumentException

fun main(){
    // 코틀린에서 Type을 다루는 방법
    // 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
    val number1 = 3 // Int
    val number2 = 3L // Long

    // Java와 다른 내용
    // Java : 기본 타입간의 변환은 암시적으로 이루어질 수 있다
    // Kotlin : 기본 타입간의 변환은 명시적으로 이루어져야 한다
    // val number3: Long = number1 // Type mismatch
    val number3: Long = number1.toLong()
    println(number1 + number3)

    printAgeIfPerson(Person("개발자", 28))
    printAgeIfPerson(1)
    printAgeIfPerson2(null)

    // 코틀린에만 존재하는 특이한 타입 3가지
    // Any
    // Java의 Object 역할. (모든 객체의 최상위 타입)
    // 모든 Primitive Type의 최상위 타입도 Any 이다.
    // Unit
    // Unit은 Java의 void와 동일한 역할
    // void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능.
    // 함수형 프로그래밍에서 Unit 은 단 하나의 인스턴스만 갖는 타입을 의미.
    // 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현.
    // Nothing
    // Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할.
    // 무조건 예외를 반환하는 함수나 무한 루프 함수 등
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}

fun printAgeIfPerson(obj: Any){
    if(obj is Person) { // is는 instanceof
        val person = obj as Person // as는 Java의 (Person) obj
        println(person.age)
        // 그런데 위와 같이 타입캐스팅은 생략할 수 있음 (스마트형 변환)
        println(obj.age)
        return
    }
    println("obj는 Person이 아닙니다.")
}

fun printAgeIfPerson2(obj: Any?){
    // obj에 만약 null이 들어갈 경우에는 as에서 ? 를 붙여야함.
    val person = obj as? Person
    println(person?.age)
}