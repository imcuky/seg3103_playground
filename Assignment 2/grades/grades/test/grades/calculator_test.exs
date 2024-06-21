defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  @ test1 %{
    homework: [],
    labs: [],
    midterm: 1,
    final: 1
  }

  @test2 %{
    homework: [0.85],
    labs: [1, 1, 1],
    midterm: 0.85,
    final: 0.85
  }

  @test3 % {homework: [0.9], labs: [1, 1, 1], midterm: 0.9, final: 0.9}
    
  @test4 % {homework: [0.4], labs: [0.25, 0.25, 0.25], midterm: 0.4, final: 0.4}
    
  @test5 % {homework: [0.8], labs: [0.8, 0.8, 0.8], midterm: 0.8, final: 0.8}
  
  @test6 % {homework: [0.75], labs: [0.75, 0.75, 0.75], midterm: 0.75, final: 0.75}

  @test7 % {homework: [0.70], labs: [0.7, 0.7, 0.7], midterm: 0.70, final: 0.70}

  @test8 % {homework: [0.65], labs: [0.65, 0.65, 0.65], midterm: 0.65, final: 0.65}
  
  @test9 % {homework: [0.60], labs: [0.60, 0.60, 0.60], midterm: 0.60, final: 0.60}

  @test10 % {homework: [0.55], labs: [0.55, 0.55, 0.55], midterm: 0.55, final: 0.55}

  @test11 % {homework: [0.50], labs: [0.50, 0.50, 0.50], midterm: 0.50, final: 0.50}
  
  @test12 % {homework: [0.40], labs: [0.40, 0.40, 0.40], midterm: 0.50, final: 0.40}


  describe "percentage_grade/1" do
    test "sample" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
    end
  end
end
