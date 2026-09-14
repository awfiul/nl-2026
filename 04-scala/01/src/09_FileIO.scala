// 09. Чтение и запись файлов

import scala.io.Source
import java.io.PrintWriter

@main
def fileIoDemo(): Unit =
  val inputPath = "src/data/numbers.txt"
  val outputPath = "src/data/result.txt"

  // Чтение файла.
  val source = Source.fromFile(inputPath)

  // getLines() возвращает Iterator[String].
  val lines = source.getLines()

  println("Содержимое файла:")
  for line <- lines do
    println(line)

  source.close()

  // Запись файла через Java-класс PrintWriter.
  val writer = new PrintWriter(outputPath)
  writer.println("Файл создан программой на Scala.")
  writer.println("Hello from Scala!")
  writer.close()

  println(s"Результат записан в $outputPath")
