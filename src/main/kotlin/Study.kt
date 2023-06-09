import kotlin.random.Random

fun study() {
    println("Hello World!")

    // 변수 선언
    var 변수1 = 1 // var은 가변변수
    val 변수2 = 2 // val은 const 정적변수

    fun test(a:String, b:Int) = a + b.toString()
    val res = test("hi", 2)
    println(res)

    val test = "test fun`s result is $res"
    println(test)

    // nullable
    fun strToInt(str:String): Int? {
        // 정수가 아닌 경우 null을 리턴한다.
        val x:Int? = str.toIntOrNull()
        return x
    }
    println("parseInt 5 is ${strToInt("5")}")
    println("parseInt 5.1 is ${strToInt("5.1")}")

    // 자동 타입 변환
    fun getStringLength(obj:Any):Int? {
        if(obj is String){
            // String 비교만 해도, obj의 타입이 string이 됨.
            return obj.length
        }
        return null
    }

    // while loop
    val items = listOf<Int>(1, 2, 3)
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index ++
    }

    // when expression
    // 이거 개사기네. 스위치랑 똑같은 개념. 각 항목에 break가 있다고 생각.
    fun describe(obj : Any): String =
        when (obj) {
            1           -> "One"
            "Hello"     -> "Greeting"
            is Long     -> "Long"
            !is String  -> "Not a String"
            else        -> "Unknown"
        }

    // ranges
    val x = 3
    if (x in 1..10){
        println("fits in range")
    }
    print("for")
    for (y in 1..5){
        print("$y, ")
    }
    println()

    // collections
    val items2 = listOf("apple", "banana", "kiwi")
    for (item in items){
        println("$item, ${items2[item-1]}")
    }

    val items3 = setOf("apple", "banana", "kiwi")
    when {
        "coffee" !in items3 -> print("커피 없음")
        "apple" in items3 -> println("사과")
    }

    println()
    // 람다식
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map {it.uppercase()}
        .forEach { print("$it, ") }
    println()

    // Custom Iterator
    fun iteratorExam(){
        class MyIterator {
            val data = listOf(1,2,3,4,5)
            var idx = 0
            operator fun hasNext():Boolean {
                return data.size > idx
            }
            operator fun next():Int {
                return data[idx++]
            }
        }
        class MyData {
            operator fun iterator(): MyIterator {
                return MyIterator()
            }
        }

        val myData = MyData()
        myData.iterator()
        for (item in myData){
            println(item)
        }
    }
    iteratorExam()

    // while Loop
    // while문은 똑같고, do-while문에서 조금 더 편리해짐.

    fun retrieveData():Int? {
        val rand = Random.nextInt(10)
        if (rand < 9) return rand
        return null
    }
    do {
        val cond = retrieveData()
        println(cond)
    } while (cond != null)
    // do 안에 있는 지역변수 cond를 while문 조건에 쓸 수 있음.

    // Label Break and Continue
    // 이름은 마음대로 지을 수 있음.
    // loop@ 말고 brk@ 이런식으로
    loop@ for (i in 1..10){
        println("--- i: $i ---")

        for (j in 1..10){
            println("j: $j")
            if (i+j > 12){
                break@loop
            }
        }
    }

    ctu@ for (i in 1..10){
        println("--- i: $i ---")

        for (j in 1..10){
            if (i+j > 12){
                continue@ctu
            }
            println("j: $j")
        }
    }
}