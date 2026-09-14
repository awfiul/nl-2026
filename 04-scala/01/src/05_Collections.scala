// 05. Основные коллекции и функциональные операции

@main
def collectionsDemo(): Unit =
  // List — упорядоченная неизменяемая последовательность
  val numbers = List(1, 2, 3, 4, 5)

  // Set хранит только уникальные значения
  val ids = Set(10, 20, 20, 30)

  // Map хранит пары ключ -> значение
  val user = Map(
    "name" -> "Anna",
    "city" -> "SPb"
  )

  // Array — изменяемый массив
  val data = Array(1, 2, 3)
  data(0) = 100

  println(s"List: $numbers")
  println(s"Set: $ids")
  println(s"Map: $user")
  println(s"Array: ${data.mkString(", ")}")

  // map преобразует каждый элемент
  val squares = numbers.map(x => x * x)

  // filter оставляет только подходящие элементы
  val even = numbers.filter(x => x % 2 == 0)

  println(s"Squares: $squares")
  println(s"Even: $even")

  // Короткая форма lambda с _
  val doubled = numbers.map(_ * 2)
  println(s"Doubled: $doubled")

  // foreach выполняет действие для каждого элемента
  println("foreach:")
  numbers.foreach(n => println(s"number = $n"))
