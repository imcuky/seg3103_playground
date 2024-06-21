defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  @test1 %{homework: [], labs: [], midterm: 1, final: 1}
  @test2 %{homework: [0.85], labs: [1, 1, 1], midterm: 0.85, final: 0.85}
  @test3 %{homework: [0.9], labs: [1, 1, 1], midterm: 0.9, final: 0.9}
  @test4 %{homework: [0.4], labs: [0.25, 0.25, 0.25], midterm: 0.4, final: 0.4}
  @test5 %{homework: [0.8], labs: [0.8, 0.8, 0.8], midterm: 0.8, final: 0.8}
  @test6 %{homework: [0.75], labs: [0.75, 0.75, 0.75], midterm: 0.75, final: 0.75}
  @test7 %{homework: [0.70], labs: [0.7, 0.7, 0.7], midterm: 0.70, final: 0.70}
  @test8 %{homework: [0.65], labs: [0.65, 0.65, 0.65], midterm: 0.65, final: 0.65}
  @test9 %{homework: [0.60], labs: [0.60, 0.60, 0.60], midterm: 0.60, final: 0.60}
  @test10 %{homework: [0.55], labs: [0.55, 0.55, 0.55], midterm: 0.55, final: 0.55}
  @test11 %{homework: [0.50], labs: [0.50, 0.50, 0.50], midterm: 0.50, final: 0.50}
  @test12 %{homework: [0.40], labs: [0.40, 0.40, 0.40], midterm: 0.40, final: 0.40}

  describe "percentage_grade/1" do
    test "test1" do
      assert Calculator.percentage_grade(@test1) == 50
    end

    test "test2" do
      assert Calculator.percentage_grade(@test2) == 88
    end

    test "test3" do
      assert Calculator.percentage_grade(@test3) == 92
    end

    test "test4" do
      assert Calculator.percentage_grade(@test4) == 37
    end

    test "test5" do
      assert Calculator.percentage_grade(@test5) == 80
    end

    test "test6" do
      assert Calculator.percentage_grade(@test6) == 75
    end

    test "test7" do
      assert Calculator.percentage_grade(@test7) == 70
    end

    test "test8" do
      assert Calculator.percentage_grade(@test8) == 65
    end

    test "test9" do
      assert Calculator.percentage_grade(@test9) == 60
    end

    test "test10" do
      assert Calculator.percentage_grade(@test10) == 55
    end

    test "test11" do
      assert Calculator.percentage_grade(@test11) == 50
    end

    test "test12" do
      assert Calculator.percentage_grade(@test12) == 40
    end
  end

  describe "letter_grade/1" do
    test "test1" do
      assert Calculator.letter_grade(@test1) == "EIN"
    end

    test "test2" do
      assert Calculator.letter_grade(@test2) == "A"
    end

    test "test3" do
      assert Calculator.letter_grade(@test3) == "A+"
    end

    test "test4" do
      assert Calculator.letter_grade(@test4) == "F"
    end

    test "test5" do
      assert Calculator.letter_grade(@test5) == "A-"
    end

    test "test6" do
      assert Calculator.letter_grade(@test6) == "B+"
    end

    test "test7" do
      assert Calculator.letter_grade(@test7) == "B"
    end

    test "test8" do
      assert Calculator.letter_grade(@test8) == "C+"
    end

    test "test9" do
      assert Calculator.letter_grade(@test9) == "C"
    end

    test "test10" do
      assert Calculator.letter_grade(@test10) == "D+"
    end

    test "test11" do
      assert Calculator.letter_grade(@test11) == "D"
    end

    test "test12" do
      assert Calculator.letter_grade(@test12) == "E"
    end
  end

  describe "numeric_grade/1" do
    test "test1" do
      assert Calculator.numeric_grade(@test1) == 0
    end

    test "test2" do
      assert Calculator.numeric_grade(@test2) == 9
    end

    test "test3" do
      assert Calculator.numeric_grade(@test3) == 10
    end

    test "test4" do
      assert Calculator.numeric_grade(@test4) == 0
    end

    test "test5" do
      assert Calculator.numeric_grade(@test5) == 8
    end

    test "test6" do
      assert Calculator.numeric_grade(@test6) == 7
    end

    test "test7" do
      assert Calculator.numeric_grade(@test7) == 6
    end

    test "test8" do
      assert Calculator.numeric_grade(@test8) == 5
    end

    test "test9" do
      assert Calculator.numeric_grade(@test9) == 4
    end

    test "test10" do
      assert Calculator.numeric_grade(@test10) == 3
    end

    test "test11" do
      assert Calculator.numeric_grade(@test11) == 2
    end

    test "test12" do
      assert Calculator.numeric_grade(@test12) == 1
    end
  end
end
