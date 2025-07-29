 //TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {

    //  배열
    val array1 = arrayOf(10,20,30,40,50)
    println("array1: $array1")

    //배열이 관리하는 값을 모아 문자열로 만들어 반환 받을 수 있다
    println("array1: ${array1.contentToString()}")

    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2: $array2")
    println("array2: ${array2.contentToString()}")

    val array3 = intArrayOf(10,20,30,40)
    val array4 = doubleArrayOf(11.11,22.22,33.33)
    val array5 = arrayOf<String>("문자열1", "문자열2","문자열3")
    println("array3: ${array3.contentToString()}")
    println("array4: ${array4.contentToString()}")
    println("array5: ${array5.contentToString()}")

    //람다식을 통한 배열
    val array6 = Array(5){
        0
    }
    println("array6: ${array6.contentToString()}")

    val array7 = Array(5){
        it
    }
    println("array7: ${array7.contentToString()}")

    val array8 = Array(10){
        (it + 2)*3
    }
    println("array8: ${array8.contentToString()}")

    //다차원 배열
    val array9 = arrayOf(
        arrayOf(10,20,30),
        arrayOf(40,50,60),
        arrayOf(70,80,90)
    )
    println("array9: ${array9.contentToString()}")
    println("array9: ${array9.contentDeepToString()}")

    println("array1[0]: ${array1[0]}")
    println("array1[1]: ${array1[1]}")

    println("array9[0][0]: ${array9[0][0]}")

    array1[0]=100
    array1.set(1,200)
    println("array1: ${array1.contentToString()}")

    //배열은 절대 관리하는 기억저장소의 개수를 변경 시킬수 없다
    val array10 = array1.plus(1000)
    println("array10: ${array10.contentToString()}")


    val array11 = array1.sliceArray(1..3)
    println("array11: ${array11.contentToString()}")

    println("array1이 관리하는 값의 개수: ${array1.size}")

    for(a1 in array1){
        print("$a1 ")
    }
    println()
    println("------------------------------")
    //배열이 제공하는 메서드들
    println("첫번째 값: ${array1.first()}")
    println("마지막 값: ${array1.last()}")
    println("30의 위치: ${array1.indexOf(30)}")
    println("1000의 위치: ${array1.indexOf(1000)}")
    println("평균: ${array1.average()}")
    println("총합: ${array1.sum()}")
    println("관리하는 기억저장소의 개수: ${array1.size}, ${array1.count()}")
    println("30을 포함하는 가: ${array1.contains(30)}")
    println("30을 포함하는 가: ${30 in array1}")
    println("max: ${array1.max()}")
    println("min: ${array1.min()}")

    println("------------------------------")
    val array12 = Array(10){
        it + 1
    }
    println("array12: ${array12.contentToString()}")

    //랜덤하게 배열 섞기
    array12.shuffle()
    println("array12: ${array12.contentToString()}")
    //정렬- 오름차순
    val array13 =array12.sortedArray()
    println("array13: ${array13.contentToString()}")
    val array14=array12.sortedArrayDescending()
    println("array14: ${array14.contentToString()}")

    println("------------------------------")
    println("--------------문자열------------")
    //문자열
    val array15 = CharArray(5){
        'a'
    }
    val str1 = String(array15)
    println("str1: $str1")

    val str2 = "안녕하세요"
    println("str2: $str2")

    //원하는 번째의 글자를 가져올 수 있다
    println("str2[0]: ${str2[0]}")
    println("str2[1]: ${str2[1]}")

    //String 객체는 관리하는 문자열 값을 변경하는 것이 불가능하다
    //str1[0]='A'

    //원하는 부분의 글자들을 추출하여 새로운 문자열 객체로 생성한 다음 반환한다
    val str3 = str2.substring(1.. 3)
    println("str3: $str3")

    //비교
    val str4 = "Hello World"
    val str5 = "hello world"
    val str6 = "Hello World"

    if(str4 == str5){
        println("str4 == str5")
    }else{
        println("str4!=str5")
    }

    if(str4 == str6){
        println("str4==str6")
    }else{
        println("str4!=str6")
    }
    //문자열을 구성하는 글자의 코드값을 합산하고 그걸 뺀 결과를 반환
    //
    println(str4.compareTo(str5))  //H:72 - h:104 =-32
    println(str4.compareTo(str6))

    println(str4.compareTo(str5, true))

    if(str4.equals(str5, true)){
        println("대소문자를 무시하면 두 문자열을 같습니다.")
    }

    //구분자를 기준으로 문자열 나눔
    val str7 = "ab_cd ef_gh"
    //띄어쓰기를 기준으로 나눔
    val r6 = str7.split(" ")
    println("r6: $r6")
    val r7 = str7.split("_")
    println("r7: $r7")

    //소문자를 대문자로
    //대문자로 소문자로
    println("str4: $str4")

    val str8 = str4.uppercase()
    val str9 = str4.lowercase()
    println("str8: $str8")
    println("str9: $str9")







    println("------------------------------")
    println("--------------복습------------")
    val list100 = listOf(10,20,30,40)
    val list200 = mutableListOf("A","B","C")

    println("list100: $list100")
    println("list200: $list200")
    println("첫 요소: ${list100[0]}")

    for(item in list100){
        println("item: $item")
    }
    for(i in list100.indices){
        println("list100[$i]= ${list100[i]}")
    }

    list200.add("D")
    list200.add(1,"X")
    println("추가 후 list200: $list200")

    list200[0] = "Z"
    println("수정 후 list200: $list200")

    list200.remove("B")
    list200.removeAt(1)
    println("삭제 후 list200: $list200")

    list200.clear()
    println("clear 후 list200: $list200")

    val mutable100 = list100.toMutableList()
    val immutable100 = mutable100.toList()
    println("mutable100: $mutable100")
    println("immutable100: $immutable100")


    println("------------------------------")
    val set100 = setOf(1,5,10,1,5)
    println("set100: $set100")

    val set200 = mutableSetOf(1,5,10)
    set200.add(20)
    set200.addAll(listOf(30,40))
    set200.add(10)
    set200.remove(5)
    println("set200: $set200")

    var count = 0
    for(item in set200){
        println("item[$count]: $item")
        count++
    }

    val mutable101 = set100.toMutableSet()
    val list101=set200.toList()
    println("mutable101: $mutable101")
    println("list101: $list101")

    val a = setOf(1,2,3)
    val b = setOf(3,4,5)
    println("합집합: ${a.union(b)}")
    println("교집합: ${a.intersect(b)}")
    println("차집합: ${a.subtract(b)}")

    println("------------------------------")

    val map100 = mapOf("key1" to 10, "key2" to 20) //불변
    println("map100: $map100")

    val map200 = mutableMapOf("key1" to 10, "key2" to 20) //가변
    println("map200: $map200")

}