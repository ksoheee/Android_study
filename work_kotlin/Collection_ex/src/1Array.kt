// 배열 : 다수의 기억장소를 하나로 묶어서 관리하는 개념
// 배열은 다수의 기억장소를 하나로 묶어서 관리하고 배열의 주소값을 가지고 있는 변수를
// 통해 배열에 접근하여 배열이 관리하는 기억장소를 사용할 수 있다.

fun main(){
    // 배열의 생성
    // 배열이 관리하는 값들을 지정해준다.
    // 지정한 값 만큼의 기억장소가 생성되고 그 기억장소들을 관리하는 배열이 생성된다.
    // 배열이 관리하는 기억장소의 개수는 변경할 수 없다.
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1 : $array1")

    // 배열이 관리하는 값을 모아 문자열로 만들어 반환 받을 수 있다.
    // 이를 통해 배열이 관리하는 값들을 출력해 볼 수 있다.
    println("array1 : ${array1.contentToString()}")

    // 배열은 다양한 타입의 값을 담을 수 있다.
    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2 : $array2")
    println("array2 : ${array2.contentToString()}")

    // 배열에 담을 수 있는 값의 타입을 제한한다.
    // 000arrayOf
    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
    val array5 = arrayOf<String>("문자열1", "문자열2", "문자열3")
//    val array5_1 = stringArrayOf("문자열1", "문자열2", "문자열3")

    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    // 람다식을 통한 배열 생성
    // 람다식 내부의 코드를 수행하여 얻어진 결과를 배열에 담아준다.
    // Array(기억장소의 개수)
    // 지정된 숫자 만큼 기억장소가 만들어지고 람다식의 제일 마지막에 작성한 값을 담아준다.

    // 주어진 람다식을 지정한 개수만큼 반환한다.
    // 첫 번째 기억장소에 담을 값을 결정하기 위해
    // 람다식을 수행하고 람다식의 제일 마지막에 작성한 값이 첫 번째 기억장소에 담기게 된다.
    // 이런식으로 모든 기억장소의 수 만큼 람다식이 수행되고 람다식이 전달하는 값은
    // 각각 기억장소에 담기게 된다.

    // 0 이 5개 담긴 배열 생성
    val array6 = Array(5){
        0
    }
    println("array6 : ${array6.contentToString()}")

    // 람다식에 있는 it 에는 0 부터 1씩 증가하는 값이 들어온다.
    // 이를 통해 몇 번째 기억장소에 값을 담을 것인지를 알 수 있다.
    val array7 = Array(5){
        it
    }
    println("array7 : ${array7.contentToString()}")

    // 1 ~ 5
    val array7_1 = Array(5){
        it + 1
    }
    println("array7_1 : ${array7_1.contentToString()}")

    // 5 ~ 1
    val array7_2 = Array(5){
        5 - it
    }
    println("array7_2 : ${array7_2.contentToString()}")

    // 3 부터 3의 배수 10개를 가지고 있는 배열을 생성한다.
    val array8 = Array(10){
        println("array8 수행문") // array8에 값이 하나씩 담기기 직전에 수행된다. 총 10번 수행
        (it + 1) * 3
    }
    println("array8 : ${array8.contentToString()}")

    println("-----------------------------------")

    // 다차원 배열
    // 배열안에 배열이 들어가 있는 것
    val array9 = arrayOf(
        arrayOf(10, 20, 30),
        arrayOf(40, 50, 60),
        arrayOf(70, 80, 90)
    )

    println("array9 : ${array9.contentToString()}")
    println("array9 : ${array9.contentDeepToString()}")

    println("----------------------------------------------")

    // 배열이 관리하는 기억 장소는 0부터 1씩 증가되는 순서값을 사용한다.
    println("array1[0] : ${array1[0]}")
    println("array1[1] : ${array1[1]}")

    // get 메서드를 사용할 수 있다. [ ] 연산자를 사용하면 get 메서드를 호출하기 때문에
    //[ ]를 사용하는 것과 동일하다.
    println("array1.get(0) : ${array1.get(0)}")
    println("array1.get(1) : ${array1.get(1)}")

    // 다차원 배열에 접근
    println("array9[0][0] : ${array9[0][0]}")
    println("array9[1][1] : ${array9[1][1]}")

    println("---------------------------------------------")

    println("array1 : ${array1.contentToString()}")

    // 0 번째 기억 장소에 새로운 값을 저장한다.
    array1[0] = 100
    println("array1 : ${array1.contentToString()}")

    // 위의 코드처럼 값을 저장하는 코드를 작성하면 set 메서드가 호출된다.
    array1.set(1, 200)
    println("array1 : ${array1.contentToString()}")

    // 배열에 기억장소를 추가한다.
    // 원본 배열에 1000이 추가된 새로운 배열을 생성하여 반환한다.
    // 배열은 절대 관리하는 기억장소의 개수를 변경시킬 수 없다.
    val array10 = array1.plus(1000)
    println("array1 : ${array1.contentToString()}")
    println("array10 : ${array10.contentToString()}")

    // 배열의 일부분을 가져온다.
    // 지정된 순서값 범위에 해당하는 값들을 가지고 있는 새로운 배열을 생성한다.
    // 순서값 1 ~ 3까지..
    val array11 = array1.sliceArray(1..3)
    println("array11 : ${array11.contentToString()}")

    println("--------------------------------------")

    println("array1이 관리하는 값의 개수 : ${array1.size}")

    println("--------------------------------------")

    // 배열이 관리하는 값을 하나씩 추출하여 변수에 담아주면서 반복한다.
    for(a1 in array1){
        println(a1)
    }
    println("---------------------------------------------")
    // 배열이 제공하는 메서드들
    println("첫 번째 값 : ${array1.first()}")
    println("마지막 값 : ${array1.last()}")
    println("30의 위치(존재하는 값) : ${array1.indexOf(30)}")
    println("10000의 위치(없는 값) : ${array1.indexOf(10000)}")
    println("평균 : ${array1.average()}")
    println("총합 : ${array1.sum()}")
    println("관리하는 기억장소의 개수 : ${array1.size}")
    println("관리하는 기억장소의 개수 : ${array1.count()}")
    println("30을 포함하는가 : ${array1.contains(30)}")
    println("10000을 포함하는가 : ${array1.contains(10000)}")
    println("30을 포함하는가 : ${30 in array1}")
    println("10000을 포함하는가 : ${10000 in array1}")
    println("최대 : ${array1.max()}")
    println("최소 : ${array1.min()}")

    println("------------------------------")

    // 배열의 정렬

    // 사용할 배열 먼저 만들기 1 부터 10까지. 보기쉽게.
    //val array12 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val array12 = Array(10){
        it + 1
    }
    println(array12.contentToString())

    // 배열이 가지고 있는 값을 랜덤하게 섞어준다.
    array12.shuffle()
    println("array12.shuffle(): ${array12.contentToString()}")

    // 정렬(오름 차순)
    val array13 = array12.sortedArray() // array12는 그대로
    println("오름 차순 array12: ${array12.contentToString()}")
    println("오름 차순 array13: ${array13.contentToString()}")

    // 정렬(내림 차순)
    val array14 = array12.sortedArrayDescending()
    println("내림 차순 array14: ${array14.contentToString()}")
}








