// 컬렉션
// Kotlin의 "컬렉션(Collection)"은 데이터를 모아서 다루는 구조로,
// Java보다 간결하고 안전하게 사용할 수 있도록 설계되어 있다.
// 컬렉션의 종류 : List, Set, Map

// Array 배열과 String 문자열은 컬렉션과 다루는 방법이 비슷하기 때문에 같이 다룬다.

fun main() {
    // List: 모여있는 데이터가 순서가 있고 중복 허용
    val list = listOf("문자열입니다", 3, true)
    println("list: $list")

    // Set: 모여있는 데이터의 순서가 없음, 중복 허용 안 함 -> 집합 느낌
    val set = setOf("문자열입니다", 3, true, 3)
    println("set: $set")

    // Map: 키-값 쌍을 이루는 데이터의 모음
    val map = mapOf("key1" to "문자열입니다", "key2" to 3, "key3" to true)
    println("map: $map")
}