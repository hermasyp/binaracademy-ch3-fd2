package utils

class ScoreCalc {
    fun calculateAverage(totalScore: Int, totalStudent: Int): Int {
        return totalScore.div(totalStudent)
    }
}