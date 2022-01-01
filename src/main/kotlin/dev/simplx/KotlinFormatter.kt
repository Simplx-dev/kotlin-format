package dev.simplx

class KotlinFormatter {
    companion object {
        fun format(format: String, vararg args: Any?): String = Formatter().format(format, args).toString()
    }
}