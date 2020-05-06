package subtask1
class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        val a = numbers.size - 1
        var s = ""
        for (i in a downTo 0 step 1) {
            s += if (numbers[a - i] == 0) ""
            else if ((a - i) == 0) "${numbers[a - i]}" + "x^${i}"
            else if(numbers[a-i] == 1 ) " + "  +
                    if(i > 1) "x^${i}"
                    else if(i == 1) "x"
                    else ""
            else if(numbers[a-i] == -1 ) " - "  +
                    if(i > 1) "x^${i}"
                    else if(i == 1) "x"
                    else ""
            else if (numbers[a - i] > 0) " + " + "${numbers[a - i]}" +
                    if (i > 1) "x^${i}"
                    else if (i == 1) "x"
                    else ""
            else " - " + "${numbers[a - i] * (-1)}" +
                    if (i > 1) "x^${i}"
                    else if (i == 1) "x"
                    else ""
        }
        return if(a > 0)
            s
        else
            null
    }
}
