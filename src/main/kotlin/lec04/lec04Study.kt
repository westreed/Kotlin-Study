package lec04

fun main(){
    // 코틀린에서 연산자를 다루는 방법

    // 단한 연산자 ++ --
    // 산술 연산자 + - * / %
    // 산술대입 연산자 += -= *= /= %=
    // 비교연산자 > < >= <=
    // Java와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo를 호출함.

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 큽니다.")
    }

    // 동등성 = 값비교, 동일성 = 동일객체, 주소비교
    // Java에서는 동일성에 ==를 사용하고, 동등성에 equals를 직접 호출했음.
    // Kotlin에서는 동일성에 ===를 사용하고, 동등성에 ==를 호출함.
    // 객체에 equals가 없으면, Any 안에 있는 equals를 통해 비교함
    println("money1 == money2는 ${money1 == money2}")

    // 논리연산자
    // && || !
    // Java와 완전히 동일하고, Java처럼 Lazy 연산을 수행합니다.
    if(fun1() || fun2()){
        println("본문")
        // Lazy 연산은 다음과 같이 fun1이 True이면 or 연산자 이기 때문에 뒤의 함수는 실행하지 않음.
    }

    // in / !in
    // 컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
    // a..b
    // a부터 b까지 범위 객체를 생성한다.
    // a[i]
    // a에서 특정 index i로 값을 가져온다.
    // a[i] = b

    // 연산자 오버로딩
    // Java에서는 클래스끼리 덧셈을 한다고 했을 때, 메소드를 만들고 해당 메소드를 호출해서 덧셈을 처리해야 했지만
    // Kotlin에서는 연산자와 대응되는 메소드에 코드를 작성하면, 그냥 연산자로 덧셈할 수 있다.
    val money3 = Money(1_000L)
    val money4 = Money(2_000L)
    println(money3 + money4) // toString도 자동구현


}

fun fun1():Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}