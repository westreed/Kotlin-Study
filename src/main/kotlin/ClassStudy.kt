// 기본 생성자
// 클래스 별로 1개만 가질 수 있음.
// 클래스 이름 뒤에 작성 constructor

class ClassStudy {
    val name:String
    constructor(fullName: String){
        name = fullName
    }
    constructor(firstName: String, lastName:String){
        name = firstName + lastName
    }

    fun print(){
        println("ClassStudy print with value $name")
    }
}