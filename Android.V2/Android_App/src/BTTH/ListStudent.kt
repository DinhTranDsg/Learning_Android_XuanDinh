package BTTH

enum class StudentListStatus{
        STUDENT_LIST_EMPTY,
        STUDENT_LIST_SUCCESS
}
data class Student(val id: String, val name: String)
fun getStudentListStatus(students: List<Student>): StudentListStatus{
    return if (students.isEmpty()) {
        StudentListStatus.STUDENT_LIST_EMPTY
    } else {
        StudentListStatus.STUDENT_LIST_SUCCESS
    }
}
fun showStudent(students: List<Student>){
    students.also {
        println("Sinh vien ${it.size} ")
    }
with(students) {
    if (isEmpty()) {
        println("Danh sach trong.")
    } else {
        println("Danh Sach Sinh Vien")
        forEach { s ->
            println("ID: ${s.id} | Ten: ${s.name}")
        }
    }
}
}
fun main(){
    fun main() {
        val students = mutableListOf<Student>()

        print("Bạn muốn nhập bao nhiêu sinh viên? ")
        val n = readln().toIntOrNull() ?: 0

        repeat(n) { i ->
            println("Nhập sinh viên thứ ${i + 1}:")
            print("ID: ")
            val id = readln()
            print("Tên: ")
            val name = readln()
            students.add(Student(id, name))
        }

        showStudent(students)
    }}