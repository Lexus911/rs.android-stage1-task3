package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val c = array[0]
        val n = array[1]

        for(k in 1..n)
        if(c == (factorial(n)/(factorial(k)*factorial(n-k))).toInt())
        return k
        return null
    }

    private fun factorial(a: Int): Double {
        var result = 1.0
        for (d in 1..a) {
            result *= d
        }
        return result

    }
}
