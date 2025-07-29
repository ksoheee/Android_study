//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val t1 = TestClass1()
    t1.testMethod()
    t1.a7="안녕"
    t1.testMethod()

    println("a8: ${t1.a8}")
}

class TestClass1{
    //코틀린에서는 프로퍼티를 정의할 때 저장할 값을 무조건 지정해야 한다.
    var a1: Int = 100
    var a2 = 200

    //프로퍼티를 정의할 때 저장할 값을 지정하지 않았지만
    //init 블럭에서 초기화를 해주는 경우 오류가 발생하지 않는다.
    var a3: Int
    val a4: Int
    init{
        a3=300
        a4=400
    }
    //생성자에서 초기화 해줘도 오류가 발생하지 않는다.
    var a5: Int
    val a6: Int
    constructor(){
        a5=300
        a6=400
    }


    //지연초기화
    //init블럭이나 생성자에서 값을 초기화 하지 않고 메서드에서 값을 저장하는 경우 사용한다.
    //var 프로퍼티만 사용 가능하다.
    //Int, Float, Double과 같은 기본자료형에는 사용할 수 없다.
    lateinit var a7: String

    fun testMethod(){
        //lateinit 프로퍼티는 사용하기 전에 반드시 값이 저장되어 있는지 확인해야 한다.
        //::변수에 참조를 할때 사용하는 문법
        if(::a7.isInitialized){
            println("a7: ${a7}")
        }else{
            println("a5는 초기화 되지 않았습니다.")
        }
    }

    //lazy를 사용하면 프로퍼티에 저장될 값을 어떠한 처리를 통해 구해 저장할 수 있다
    val a8: Int by lazy{
        println("a8 lazy 코드 블럭")
        val temp = 1+ 2 + 3
        //마지막에 작성한 값이나 변수의 값이 프로퍼티에 저장된다.
        temp
    }
    ]
}