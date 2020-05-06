package subtask3
import kotlin.math.absoluteValue

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val sorted = itemsFromArray.filterIsInstance<Int>().sortedBy { it.absoluteValue }.reversed()

        if(sorted.isNotEmpty()){
            var resultOne = 1

            if(sorted.size <= numberOfItems) {
                for (i in sorted)
                    resultOne *= i
                return resultOne
            }
            for (i in 0 until numberOfItems){
                resultOne *= sorted[i]
            }
            val onlyPositive = sorted.filter { i -> i>= 0 }
            var resultTwo= 1
            for (i in 0 until numberOfItems){
                resultTwo*= onlyPositive[i]
            }
            return if (resultTwo>= resultOne){
                resultTwo
            }
            else resultOne
        }
        return 0
    }
}
