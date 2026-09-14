// 10. Итоговый пример
// Читаем оценки из файла, преобразуем данные,
// считаем среднее и количество сдавших, записываем результат.

import scala.io.Source
import java.io.PrintWriter

@main
def finalDemo(): Unit =
  val inputPath = "src/data/numbers.txt"
  val outputPath = "src/data/summary.txt"

  val source = Source.fromFile(inputPath)

  // getLines(): Iterator[String]
  // map(_.toInt): Iterator[Int]
  // toList: List[Int]
  val scores =
    source
      .getLines()
      .map(_.toInt)
      .toList

  source.close()

  val passed = scores.filter(_ >= 60)

  val average =
    if scores.nonEmpty then scores.sum.toDouble / scores.length
    else 0.0

  println(s"Scores: $scores")
  println(f"Average: $average%.2f")
  println(s"Passed: ${passed.length} of ${scores.length}")

  val writer = new PrintWriter(outputPath)
  writer.println(f"Average: $average%.2f")
  writer.println(s"Passed: ${passed.length}")
  writer.close()

  println(s"Summary saved to $outputPath")
