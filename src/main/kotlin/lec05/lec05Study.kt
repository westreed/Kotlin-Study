package lec05

fun main(){
    // 코틀린에서 조건문을 다루는 방법

    // Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
    // ex. String res = if (a > b) {
    //         "a";
    //     } else {
    //         "b";
    //     }; if문을 하나의 값으로 취급하지 않으므로, res 변수에 결과를 담을 수 없음.
    // Expression : 하나의 문장으로 도출되는 문장.
    // ex. String res = a > b ? "a" : "b"; 삼항연산자는 하나의 값으로 취급하므로 담을 수 있음.

    // 하지만 코틀린에서는 if문이 Expression임.
    // 그래서 코틀린에서는 삼항연산자가 필요없어서 삭제됨.

    // Java에서 switch문이 Kotlin에서는 when문으로 바뀜.
    fun getGradeWithSwitch(score : Int) :String {
        return when (score / 10){
            9 -> "A"
            8 -> "B"
            7 -> "C"
            else -> "D"
        } // when 역시 Expression이므로, return 해줄 수 있음.
        /*
        return when (score){
            in 90..99 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }
        */
    }

    // Java의 `instanceof`는 Kotlin에서 `is`임.
    fun startsWithA(obj: Any): Boolean {
        return when(obj){
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number : Int) {
        when {
            number == 0 -> println("주어진 숫자는 0입니다.")
            number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
            else -> println("주어진 숫자는 홀수입니다.")
        }
    }

    // when은 enum class와 Sealed Class와 함께 사용할 때 더욱더 진가를 발휘!
}