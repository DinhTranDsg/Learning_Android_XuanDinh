package BTTH

enum class StudentDetailStatus {
    DETAIL_FOUND,
    DETAIL_NOT_FOUND
}

data class Students(val id: Int, val name: String)

fun findStudentDetail(
    students: List<Students>,
    idCanTim: Int,
    onResult: (StudentDetailStatus, Students?) -> Unit
) {
    val foundStudent = students.find { it.id == idCanTim }

    if (foundStudent != null) {
        onResult(StudentDetailStatus.DETAIL_FOUND, foundStudent)
    } else {
        onResult(StudentDetailStatus.DETAIL_NOT_FOUND, null)
    }
}

fun main() {
    val listSV = mutableListOf<Students>()
    print("So sinh vien muon nhap ")
    val n = readln().toIntOrNull() ?: 0
    repeat(n) { i ->
        print("Nhap id cho SV ${i + 1}: ")
        val id = readln().toIntOrNull() ?: 0
        print("Nhap ten cho SV ${i + 1}: ")
        val name = readln()
        listSV.add(Students(id, name))
    }
    println("\nTim sinh vien")
    print("Nhap id can tim: ")
    val idSearch = readln().toIntOrNull() ?: 0
    findStudentDetail(listSV, idSearch) { status, student ->
        if (status == StudentDetailStatus.DETAIL_FOUND) {
            println(" Tìm thấy: ${student?.name}")
        } else {
            println("Không tìm thấy sinh viên mang mã $idSearch")
        }
    }
}