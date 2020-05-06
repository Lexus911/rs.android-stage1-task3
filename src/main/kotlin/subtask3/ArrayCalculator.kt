package subtask3

class ArrayCalculator {
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var arr = emptyArray<Int>()
        for(i in itemsFromArray.indices)
            if(itemsFromArray[i] is Int){
                arr += itemsFromArray[i] as Int
            }

        arr.sortDescending()

        val c: Int
        if(numberOfItems <= arr.size)
            c = numberOfItems - 1
            else
            c = arr.size-1

        var prod = 1
        for(i in 0..c) {
            prod *= arr[c - i]
        }

        if(arr.isEmpty())
            return 0
        return prod
    }
}
