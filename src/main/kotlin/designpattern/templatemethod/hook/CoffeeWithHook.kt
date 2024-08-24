package designpattern.templatemethod.hook

import java.io.BufferedReader
import java.io.InputStreamReader

class CoffeeWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("필터로 커피를 우려내는 중")
    }

    override fun addCondiments() {
        println("설탕과 우유를 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput(): String {
        println("커피에 설탕과 우유를 넣어 드릴까요? (y/n)")

        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val answer = runCatching {
            bufferedReader.readLine()
        }.onFailure {
            println("IO 오류")
        }.getOrNull()

        return answer ?: "no"
    }
}