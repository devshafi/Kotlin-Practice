package controlFlow


fun main() {

    var age: Int = 25;

    // when is almost similar to switch in Java
    when (age) {
        20 -> print("Adult")
        50 -> print("Older")
        else -> print("Out of scope")
    }

}
