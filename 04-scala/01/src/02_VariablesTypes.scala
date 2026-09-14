// 02. Переменные, типы, строки и преобразования

@main
def variablesAndTypes(): Unit =
  // val — значение нельзя переназначить
  val language: String = "Scala"
  val year = 2026                 // тип Int будет выведен автоматически

  // var — значение можно изменить
  var version = 3
  version = version + 1

  // Основные типы
  val age: Int = 21
  val price: Double = 19.99
  val active: Boolean = true
  val letter: Char = 'S'

  println(s"Язык: $language")
  println(s"Год: $year")
  println(s"Версия-переменная после изменения: $version")
  println(s"age=$age, price=$price, active=$active, letter=$letter")

  // Операции
  val a = 10
  val b = 3
  println(s"$a + $b = ${a + b}")
  println(s"$a / $b = ${a / b}")      // целочисленное деление
  println(s"$a % $b = ${a % b}")
  println(s"a > b: ${a > b}")
  println(s"a == b: ${a == b}")

  // Преобразования типов
  val textNumber = "42"
  val number = textNumber.toInt
  val asDouble = number.toDouble
  val backToText = number.toString

  println(s"String -> Int: $number")
  println(s"Int -> Double: $asDouble")
  println(s"Int -> String: $backToText")
