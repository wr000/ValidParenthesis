import java.util.Stack

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0 || s.isEmpty()) return false
    else
    {
        val h: MutableMap<Char, Char> = HashMap()
        h[')'] = '('
        h[']'] = '['
        h['}'] = '{'

        val stack = Stack<Char>
        for (c in s) {
            '(' -> stack.push(c)
            ')' -> if (stack.isEmpty) {
                return false
            } else {
                stack.pop()
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    println("Hello, Kotlin/Native!")
    println(isValid("((([[[]]])))"))
}