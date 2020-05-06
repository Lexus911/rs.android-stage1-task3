package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decomposeRec(number * number, number - 1);

    }

    fun decomposeRec(rest: Int, number: Int): Array<Int>? {

        for (i in number downTo 1) {
            var sq = i * i;
            var rest = rest - sq;
            if (rest == 0) {
                return arrayOf(i);
            }
            if (rest < 0) {
                return null;
            }

            var square = kotlin.math.floor(kotlin.math.sqrt(rest.toDouble())).toInt();

            if (square >= i) {
                square = i - 1
            }

            var result = decomposeRec(rest, square);

            if (result != null) return result + arrayOf(i)

        }
        return null;

    }
}
