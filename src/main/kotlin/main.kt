import utils.ScoreCalc

fun main(args: Array<String>) {
    var totalScore = 0
    println("=====================================")
    println("Aplikasi Penghitung Rata Rata Nilai Mahasiswa")
    println("=====================================")
    println("Masukkan Total Mahasiswa  ?")
    val totalStudent = readLine()?.toInt()
    if (totalStudent != null) {
        var index = 1
        while (index <= totalStudent) {
            println("Masukkan Nilai Mahasiswa Ke-$index?")
            readLine()?.toInt()?.let { value ->
                totalScore += value
            }
            index += 1
        }
        println("=====================================")
        println("Total Mahasiswa = $totalStudent")
        println("Total Nilai = $totalScore")
        println("Rata - Rata Nilai Mahasiswa = ${ScoreCalc().calculateAverage(totalScore, totalStudent)}")
        println("=====================================")
    } else {
        println("Error")
    }

}