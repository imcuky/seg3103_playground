defmodule Grades.Calculator do

  def avg(assignment) do 
    if Enum.count(assignment) == 0 do
      0
    else
      Enum.sum(assignment) / Enum.count(assignment)
    end
  end

  def failed_to_participate?(avg_homework, avg_exams, num_labs) do
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
  end


  def calculate_grade(avg_labs, avg_homework, midterm, final) do
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end

  def calculate_mark_boundaries(mark) do

    cond do
        mark > 0.895 -> {10, "A+"}
        mark > 0.845 -> {9, "A"}
        mark > 0.795 -> {8, "A-"}
        mark > 0.745 -> {7, "B+"}
        mark > 0.695 -> {6, "B"}
        mark > 0.645 -> {5, "C+"}
        mark > 0.595 -> {4, "C"}
        mark > 0.545 -> {3, "D+"}
        mark > 0.495 -> {2, "D"}
        mark > 0.395 -> {1, "E"}
        :else -> {0, "F"}
      end
  end

  def calculate_participate_condition(homework, labs, midterm, final) do

    avg_homework = avg(homework)

    avg_labs = avg(labs)

    avg_exams = (midterm + final) / 2

    num_labs =
      labs
      |> Enum.reject(fn mark -> mark < 0.25 end)
      |> Enum.count()

    {avg_homework, avg_labs, avg_exams, num_labs}

  end








  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)

    avg_labs = avg(labs)

    mark = calculate_grade(avg_labs, avg_homework, midterm, final)
    round(mark * 100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    
    {avg_homework, avg_labs, avg_exams, num_labs} = calculate_participate_condition(homework, labs, midterm, final)

    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      "EIN"
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)

      calculate_mark_boundaries(mark) |> elem(1)
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    
    {avg_homework, avg_labs, avg_exams, num_labs} = calculate_participate_condition(homework, labs, midterm, final)


    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      0
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)

      calculate_mark_boundaries(mark) |> elem(0)
      
    end
  end
end
