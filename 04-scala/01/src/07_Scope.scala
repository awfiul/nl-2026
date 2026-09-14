// 07. Области видимости

val globalMessage = "Я объявлена на верхнем уровне"

@main
def scopeDemo(): Unit =
  val functionValue = 20

  println(globalMessage)
  println(s"functionValue = $functionValue")

  if functionValue > 0 then
    val blockValue = 30
    println(s"blockValue = $blockValue")
    println(s"sum = ${functionValue + blockValue}")

  // blockValue здесь уже недоступна:
  // println(blockValue) // compile error
