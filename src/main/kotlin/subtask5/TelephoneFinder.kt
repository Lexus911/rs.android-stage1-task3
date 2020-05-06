package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        var result = emptyArray<String>()
        for(i in 0..number.length-1) {
            if (number[i] == '1') {
                result += number.replaceRange(i, i + 1, "2")
                result += number.replaceRange(i, i + 1, "4")
            }
            if (number[i] == '2') {
                result += number.replaceRange(i, i + 1, "1")
                result += number.replaceRange(i, i + 1, "3")
                result += number.replaceRange(i, i + 1, "5")
            }
            if (number[i] == '3') {
                result += number.replaceRange(i, i + 1, "2")
                result += number.replaceRange(i, i + 1, "6")
            }
            if (number[i] == '4') {
                result += number.replaceRange(i, i + 1, "1")
                result += number.replaceRange(i, i + 1, "5")
                result += number.replaceRange(i, i + 1, "7")
            }
            if (number[i] == '5') {
                result += number.replaceRange(i, i + 1, "2")
                result += number.replaceRange(i, i + 1, "4")
                result += number.replaceRange(i, i + 1, "6")
                result += number.replaceRange(i, i + 1, "8")
            }
            if (number[i] == '6') {
                result += number.replaceRange(i, i + 1, "3")
                result += number.replaceRange(i, i + 1, "5")
                result += number.replaceRange(i, i + 1, "9")
            }
            if (number[i] == '7') {
                result += number.replaceRange(i, i + 1, "4")
                result += number.replaceRange(i, i + 1, "8")
            }
            if (number[i] == '8') {
                result += number.replaceRange(i, i + 1, "5")
                result += number.replaceRange(i, i + 1, "7")
                result += number.replaceRange(i, i + 1, "0")
                result += number.replaceRange(i, i + 1, "9")
            }
            if (number[i] == '9') {
                result += number.replaceRange(i, i + 1, "6")
                result += number.replaceRange(i, i + 1, "8")
            }
            if (number[i] == '0') {
                result += number.replaceRange(i, i + 1, "8")
            }
        }

        if(number[0] == '-')
        return null
        else
        return result
    }
}
