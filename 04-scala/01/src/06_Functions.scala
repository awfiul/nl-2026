// 06. Функции и lambda

// Обычная функция.
// Возвращается значение последнего выражения, return обычно не нужен.
def square(x: Int): Int =
  x * x

// Несколько параметров.
def sum(a: Int, b: Int): Int =
  a + b

// Параметр со значением по умолчанию.
def greet(name: String = "World"): String =
  s"Hello, $name!"

@main
def functionsDemo(): Unit =
  println(s"square(5) = ${square(5)}")
  println(s"sum(2, 3) = ${sum(2, 3)}")
  println(greet())
  println(greet("Scala"))

  // Функцию можно хранить в переменной.
  val multiplyByTwo = (x: Int) => x * 2
  println(s"multiplyByTwo(7) = ${multiplyByTwo(7)}")

  // И передавать другой функции.
  val numbers = List(1, 2, 3)
  val result = numbers.map(multiplyByTwo)
  println(s"map(function): $result")
