package BTTH

enum class SearchStatus {
    EMPTY_KEYWORD,
    SEARCH_SUCCESS,
    SEARCH_NO_RESULT
}

fun search(keyword: String?, items: List<String>): SearchStatus {
    return keyword?.let { chuoiNhap ->

        if (chuoiNhap.isBlank()) {
            SearchStatus.EMPTY_KEYWORD
        } else {
            val timThay = items.any { noiDung -> noiDung.contains(chuoiNhap) }

            if (timThay) {
                SearchStatus.SEARCH_SUCCESS
            } else {
                SearchStatus.SEARCH_NO_RESULT
            }
        }
    } ?: SearchStatus.EMPTY_KEYWORD
}


fun main() {
    val danhSach = listOf("Kotlin", "Java", "Android", "Dart")
    print("thong tin tim kiem ")
    val nhapTuBanPhim = readln()
    val ketQua = search(nhapTuBanPhim, danhSach)
    println("Ket qua: $ketQua")
}