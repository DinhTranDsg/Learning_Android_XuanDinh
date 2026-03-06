package BTTH

enum class CourseListStatus {
    COURSE_LIST_EMPTY,
    COURSE_LIST_SUCCESS
}

data class Course(val name: String)

fun getCourseListStatus(courses: List<Course>): CourseListStatus {
    return if (courses.isEmpty()) {
        CourseListStatus.COURSE_LIST_EMPTY
    } else {
        CourseListStatus.COURSE_LIST_SUCCESS
    }
}

fun main() {

    val courses = mutableListOf<Course>()

    println("Nhap so luong mon hoc")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("Ten mon hoc $i:")
        val name = readLine()!!
        courses.add(Course(name))
    }

    println("Trang thai danh sach: ${getCourseListStatus(courses)}")

    println("Danh sach khoa hoc:")
    for (course in courses) {
        println(course.name)
    }
}