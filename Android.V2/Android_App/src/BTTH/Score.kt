package BTTH

enum class ResultStatus {
    RESULT_INVALID,
    RESULT_PASS,
    RESULT_FAIL
}

fun evaluateScore(score: Double?): ResultStatus = score.run {
    if (this == null || this < 0 || this > 10) {
        ResultStatus.RESULT_INVALID
    } else if (this >= 5) {
        ResultStatus.RESULT_PASS
    } else {
        ResultStatus.RESULT_FAIL
    }
}
fun main() {
    print("Nhập điểm của sinh viên  ")
    val input = readln().toDoubleOrNull()
    val status = evaluateScore(input)
    println("kết quả: $status")
}