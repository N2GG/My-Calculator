package com.example.mycalculator

fun main() {
    println("계산기에 오신것을 환영합니다")
    println("무엇을 도와드릴까요?")
    println("[1] 더하기 [2] 빼기 [3] 곱하기 [4] 나누기 [5] 나머지 [6] 종료")

    var menu1 = readln().toInt()


    if (menu1 == 1) {
        println("더하고 싶은 숫자 두개를 입력하세요")
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var sum = num1 + num2

        println("더한 결과는 $sum 입니다.")
        println("추가적인 작업이 필요하신가요?")
        println("[1] 네 [2] 아니오.")

        var extraMenu = readln().toInt()
        if (extraMenu == 1){
            println("초기화면으로 돌아갑니다.")
            return main()
        }
        else println("이용해주셔서 감사합니다. 안녕히 가세요.")

    }

    else if (menu1 == 2) {
        println("빼고 싶은 숫자 두개를 입력하세요")
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var minus = num1 - num2

        println("뺀 결과는 $minus 입니다.")

        println("추가적인 작업이 필요하신가요?")
        println("[1] 네 [2] 아니오.")

        var extraMenu = readln().toInt()
        if (extraMenu == 1){
            println("초기화면으로 돌아갑니다.")
            return main()
        }
        else println("이용해주셔서 감사합니다. 안녕히 가세요.")
    }

    else if (menu1 == 3) {
        println("곱하고 싶은 숫자 두개를 입력하세요")
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var multiply = num1 * num2

        println("곱한 결과는 $multiply 입니다.")
        println("추가적인 작업이 필요하신가요?")
        println("[1] 네 [2] 아니오.")

        var extraMenu = readln().toInt()
        if (extraMenu == 1){
            println("초기화면으로 돌아갑니다.")
            return main()
        }
        else println("이용해주셔서 감사합니다. 안녕히 가세요.")
    }

    else if (menu1 == 4) {
        println("나누고 싶은 숫자 두개를 입력하세요")
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var divide = num1 / num2.toDouble()

        println("나눈 결과는 $divide 입니다.")
        println("추가적인 작업이 필요하신가요?")
        println("[1] 네 [2] 아니오.")

        var extraMenu = readln().toInt()
        if (extraMenu == 1){
            println("초기화면으로 돌아갑니다.")
            return main()
        }
        else println("이용해주셔서 감사합니다. 안녕히 가세요.")
    }

    else if (menu1 == 5) {
        println("나머지를 구하고 싶은 숫자 두개를 입력하세요")
        var num1 = readln().toInt()
        var num2 = readln().toInt()
        var quotient = num1 % num2

        println("나머지를 구한 결과는 $quotient 입니다.")
        println("추가적인 작업이 필요하신가요?")
        println("[1] 네 [2] 아니오.")

        var extraMenu = readln().toInt()
        if (extraMenu == 1) {
            println("초기화면으로 돌아갑니다.")
            return main()
        } else println("이용해주셔서 감사합니다. 안녕히 가세요.")
    }

    else if (menu1 == 6) {
        println("이용해주셔서 감사합니다. 안녕히 가세요.")
        return
    }

    else {
        println("잘못된 숫자입니다. 다시 입력해 주세요")
        return main()
    }
}




