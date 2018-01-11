package edu.knoldus

class Operations {

  def sum(function: (Int, Int) => Int, firstNumber: Int, secondNumber: Int): Int = {
    function(firstNumber, secondNumber)
  }

  def add(element1: Int, element2: Int): Int = element1 + element2

  def product(element1: Int, element2: Int): Int = element1 * element2

  def maximum(element1: Int, element2: Int): Int = if (element1 > element2) element1 else element2

  def operateList(inputList: List[Int], operation: String, function: (Int, Int) => Int): Int = {
    def listOperation(inputList: List[Int], result: Int): Int = {
      inputList match {
        case Nil => result
        case head :: tail => listOperation(tail,function(head,result))
      }
      operation match {
        case "sum" => operateList(inputList,"sum", add)
        case "product" => operateList(inputList,"product",product)
        case "maximum" => operateList(inputList,"maximum", maximum)
      }
    }
  }

}
