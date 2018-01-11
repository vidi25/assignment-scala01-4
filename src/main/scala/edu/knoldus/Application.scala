package edu.knoldus

import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)

  val app = new Operations

  val inputNumber1 = 5
  val inputNumber2 = 4

  val element1 = 1
  val element2 = 21
  val element3 = 3

  val inputList = List(element1, element2, element3)


  log.info(s"Sum of list = ${app.operateList(inputList, "sum", app.add)}\n")

  log.info(s"Maximum of List = ${app.operateList(inputList, "maximum", app.maximum)}\n")

  log.info(s"Sum of squares = ${
    app.sum((inputNumber1, inputNumber2) => inputNumber1 * inputNumber2 +
      inputNumber1 * inputNumber2, inputNumber1, inputNumber2)
  }\n")

  log.info(s"Sum of cubes = ${
    app.sum((inputNumber1, inputNumber2) => inputNumber1 * inputNumber1 * inputNumber1 +
      inputNumber2 * inputNumber2 * inputNumber2, inputNumber1, inputNumber2)
  }\n")

  log.info(s"Sum of ints = ${app.sum((inputNumber1, inputNumber2) => inputNumber1 + inputNumber2, inputNumber1, inputNumber2)}\n")

  log.info(s"Element in Pascal's triangle = ${app.findElementInPascalTriangle(1,3)}")

}
