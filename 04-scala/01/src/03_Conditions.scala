// 03. Условные конструкции: if и match

@main
def conditionsDemo(): Unit =
  val age = 21

  // В Scala if — выражение: оно возвращает значение.
  val status =
    if age >= 18 then "Adult"
    else "Minor"

  println(s"Age: $age -> $status")

  val code = 404

  // match похож на switch, но умеет гораздо больше.
  val message =
    code match
      case 200 => "OK"
      case 404 => "Not Found"
      case 500 => "Server Error"
      case _   => "Unknown"

  println(s"HTTP $code -> $message")

  // В case можно добавлять условие (guard).
  val ageGroup =
    age match
      case x if x < 18 => "Minor"
      case x if x < 65 => "Adult"
      case _           => "Senior"

  println(s"Age group: $ageGroup")
