fun isValid(s: String): Boolean {
    val list = mutableListOf<Char>()
    if (s.length % 2 != 0 || s.isEmpty()) return false
    else {
        for (c in s) {
            if (c == '(' || c == '[' || c == '{') list.add(c)
            else {
                if (list.isEmpty()) return false
                list.removeLast()
            }
        }
    }
    return list.isEmpty()
}

fun main() {
    println("Hello, Kotlin/Native!")
    println(isValid("((([[[]]])))"))
}