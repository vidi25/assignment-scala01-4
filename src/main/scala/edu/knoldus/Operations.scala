package edu.knoldus

class Operations {

  def sum(function: (Int, Int) => Int, firstNumber: Int, secondNumber: Int): Int = {
    function(firstNumber, secondNumber)
  }

  def add(element1: Int, element2: Int): Int = element1 + element2

  def product(element1: Int, element2: Int): Int = element1 * element2

  def maximum(element1: Int, element2: Int): Int = if (element1 > element2) element1 else element2

  def operateList(inputList: List[Int], operation: String, function: (Int, Int) => Int): Int = {
    def listOperation(inputList: List[Int], function: (Int, Int) => Int, result: Int): Int = {
      inputList match {
        case Nil => throw new Exception("list is empty")
        case head :: Nil => head
        case head :: tail => listOperation(tail, function, function(head, result))
      }
    }

    operation match {
      case "sum" => listOperation(inputList, add, 0)
      case "product" => listOperation(inputList, product, 1)
      case "maximum" => listOperation(inputList, maximum, 0)
    }
  }

  def findElementInPascalTriangle(column: Int, row: Int): Int = {
    if (column == 0 || column == row) {
      1
    }
    else {
      findElementInPascalTriangle(column - 1, row - 1) + findElementInPascalTriangle(column, row -1)

    }
  }

}
