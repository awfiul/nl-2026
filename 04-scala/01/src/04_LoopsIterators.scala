// 04. Циклы, диапазоны и итераторы

@main
def loopsAndIterators(): Unit =
  println("for + to (правая граница включена):")
  for i <- 1 to 5 do
    print(s"$i ")
  println()

  println("for + until (правая граница НЕ включена):")
  for i <- 1 until 5 do
    print(s"$i ")
  println()

  println("while:")
  var i = 0
  while i < 3 do
    println(s"i = $i")
    i += 1

  // Iterator выдаёт элементы по одному и хранит текущее состояние.
  val numbers = List(10, 20, 30)
  val iterator = numbers.iterator

  println("Iterator:")
  while iterator.hasNext do
    val current = iterator.next()
    println(s"next = $current")

  // После прохода итератор исчерпан.
  println(s"Есть следующий элемент после прохода? ${iterator.hasNext}")
