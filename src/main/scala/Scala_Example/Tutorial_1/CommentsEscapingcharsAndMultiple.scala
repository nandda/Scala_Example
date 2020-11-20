package Scala_Example.Tutorial_1

object CommentsEscapingcharsAndMultiple extends App {

  println("\nStep 4: How to escape a Json String")
  val donutJson ="""{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""

  println("\nStep 5: Using backslash to escape quotes")
  val donutJson2 = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")

  println("\nStep 7: Creating multi-line text using stripMargin")
  val donutJson4 =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """.stripMargin
  println(s"donutJson4 = $donutJson4")

  println("\nStep 8: String interpolation and multi-line text")
  val donutName = "Glazed Donut"
  val tasteLevel = "Very Tasty"
  val price = 2.50
  val donutJson5 =
    s"""
       |{
       |"donut_name" :"$donutName",
       |"Taste_level":"$tasteLevel",
       |"price":"$price"
       |
       |}""".stripMargin
  println(s"donutJson5 = $donutJson5")


  println("\nTip: stripMargin using a different character")
  val donutJson6 =
    s"""
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """.stripMargin('#')
  println(s"donutJson6 = $donutJson6")
}
