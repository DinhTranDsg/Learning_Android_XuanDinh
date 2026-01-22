package Bai2

import jdk.jfr.EventSettings

data class Settings(val darkMode: Boolean)
fun enableDarkMode(settings: Settings): Settings {
    return settings.copy(darkMode = true)
}
fun disDarkMode(settings: Settings): Settings {
    return settings.copy(darkMode = false)
}
fun main() {
    val initial = Settings(darkMode = false)
    val updated = enableDarkMode(initial)

    println(initial.darkMode)
    println(updated.darkMode) // Kết quả: true

}