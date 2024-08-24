package designpattern.templatemethod.hook

import java.io.BufferedReader
import java.io.InputStreamReader

class TeaWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("찻잎을 우려내는 중")
    }

    override fun addCondiments() {
        println("레몬을 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput(): String {
        println("차에 레몬을 넣을까요? (y/n)")

        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val answer = runCatching {
            bufferedReader.readLine()
        }.onFailure {
            println("IO 오류")
        }.getOrNull()

        return answer ?: "no"
    }
}