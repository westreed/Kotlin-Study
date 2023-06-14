package lec06

fun main() {
    // 코틀린에서 반복문을 다루는 방법
    // 1. for-each문, 2. 전통적인 for문, 3. Progression과 Range, 4. while문
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers){ // Iterable이 구현된 타입이라면 모두 들어갈 수 있음.
        println(number)
    }

    for (i in 1..3){
        println(i)
    }
    // 내려가는 경우!
    for (i in 3 downTo 1){
        println(i)
    }
    // 2씩 올라가는 경우!
    for (i in 1..5 step 2) {
        println(i)
    }
    // 2씩 내려가는 경우!
    for (i in 5 downTo 1 step 2){
        println(i)
    }

    // 이게 어떻게 작동하는가?
    // 눌러보면, IntRange -> IntProgression (등차수열)을 만듬.
    // 3..1 downTo 1 : 시작값 3, 끝값 1, 공차가 -1인 등차수열
    // 1..5 step 2 : 시작값 1, 끝값 5, 공차가 2인 등차수열
    // Kotlin에서 for문은 전통적인 등차수열을 만든다!

    var i=1
    while (i <= 3){
        println(i)
        i++
    }
}