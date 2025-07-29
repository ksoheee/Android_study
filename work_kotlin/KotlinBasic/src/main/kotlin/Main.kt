//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {

    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    println("Hello")
    println("반가워요")

    //한줄 주석
    println("한줄 주석")

    //ctrl + shift +/ : 여러줄 주석
    //command+ D :한줄 복사
    //ctrl+r: 빌드
    println("한줄 주석")
    println("한줄 주석")
    println("한줄 주석")
    println("한줄 주석")
    println()
    println("개행과 함께")
    println("값"+100+200)
    println("값"+100+"200")
    println("값: ${100+200}")
    val a = 100
    println("값: $a")

    //정수
    println(100)
    println(-100)
    println("값 자체를 리터럴이라고 합니다.")

    println(123_456_789)
    println(1234_5678_9)
    //문자 1개만 저장
    println('A')
    println('가')

    println("여러줄을 출력하고 싶어요")
    println("여러줄을 출력하고 싶어요")
    println("여러줄을 출력하고 싶어요")
    println("여러줄을 출력하고 싶어요")

    println("여려줄 출력하고 싶어요. \n 여러줄 출력하고 싶! \n 여러줄 출력하고 싶!")


    //Raw String 자동 개행
    println(""" 여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
    """)

    //로우 스트링에서 들여쓰기 제거
    println("""여러줄을 출력하고 싶어요
        |여러줄을 출력하고 싶어요
        |여러줄을 출력하고 싶어요
    """.trimMargin())

    //논리 값도 리터럴
    println(true)
    println(false)

    /**
     * 자료형
     */

    println("Byte 용량 : ${Byte.SIZE_BYTES}")
    println("Byte 최소 값 : ${Byte.MAX_VALUE}")
    println("Byte 최대 값 : ${Byte.MIN_VALUE}")
    println()


    println("short : ${Short.SIZE_BYTES}")
    println(" Short : ${Short.MAX_VALUE}")
    println("Byte 최대 값 : ${Short.MIN_VALUE}")
    println()


    println("Byte 용량 : ${Byte.SIZE_BYTES}")
    println("Byte 최소 값 : ${Byte.MAX_VALUE}")
    println("Byte 최대 값 : ${Byte.MIN_VALUE}")
    println()

    println("Long 용량 : ${Long.SIZE_BYTES}")
    println("Long 최소 값 : ${Long.MAX_VALUE}")
    println("Byte 최대 값 : ${Long.MIN_VALUE}")
    println()

    println("--------------")
    println("Float 용량 : ${Float.SIZE_BYTES}")
    println("Float 최소 값 : ${Float.MAX_VALUE}")
    println("Byte 최대 값 : ${Float.MIN_VALUE}")
    println()
    println("Double 용량 : ${Double.SIZE_BYTES}")
    println("Double 최소 값 : ${Double.MAX_VALUE}")
    println("Double 최대 값 : ${Double.MIN_VALUE}")
    println()

    val f = 3.33 //타입 명시하지 않고 실수를 저장하면 기본 duoble로 정책

    //논리
//    논리형은 1바이트를 사용한다
    val bool1 = true
    val boo2 = false

    //문자
    //기본적으로 2바이트를 사용하지만 시스템에 따라간다.
    println("Char 음량: ${Char.SIZE_BYTES}")

    //변수
    //var, val 변수이름 : 타입
    //4바이트 기억공간이 마련되고 이 기억공간의 이름은 a1
    var a1: Int
    a1=100
    println("a1: +$a1")
    var a2: Int = 200
    var b3=300
    var b10: Double =11.11
    var b12:Char ='가'
    var b13:Boolean =false
    var b14:String ="문자열"

    var a7: Byte= 100
    var a8: Byte= 100
    var a9: Byte= 100

    //null울 허용하지 않는 변수, ?를 붙이지 않는다
    //val a22 : Int = null
    //null을 허용하는 변수 , ?를 붙여준다.할당이 아예 안됨
    val a23: Int? = null




}