// 08. Ввод и вывод в консоль

import scala.io.StdIn.readLine

@main
def consoleIoDemo(): Unit =
  print("Введите имя: ")
  val name = readLine()

  print("Введите возраст: ")
  val age = readLine().toInt

  println(s"Привет, $name!")
  println(s"В следующем году тебе будет ${age + 1}.")
