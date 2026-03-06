package BTTH


enum class DownloadStatus {
    DOWNLOAD_SUCCESS,
    DOWNLOAD_TIMEOUT,
    DOWNLOAD_ERROR,
    DOWNLOAD_NETWORK_ERROR
}

fun download(statusCode: Int?): DownloadStatus {
    return when (statusCode) {
        200 -> DownloadStatus.DOWNLOAD_SUCCESS
        408 -> DownloadStatus.DOWNLOAD_TIMEOUT
        503 -> DownloadStatus.DOWNLOAD_ERROR
        else -> DownloadStatus.DOWNLOAD_NETWORK_ERROR
    }
}

fun main() {
    print("Nhập mã trạng thái")
    val inputCode = readln().toIntOrNull() // Nếu nhập chữ hoặc để trống sẽ ra null
    val result = download(inputCode)
    println("=> Kết quả tải: $result")
}