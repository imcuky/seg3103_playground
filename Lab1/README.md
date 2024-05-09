## How to run_py

**For Windows only**

## newmath_py

1. Navigate to the file location

`cd Your drive:\Your file\seg3103_playground\Lab1\newmath_py\newmath_py`

2. Compile all with the following command

`Get-ChildItem ./src -Filter *.py -Recurse | ForEach-Object {python -m py_compile $_.FullName}`



3. Run the `run.py`

Run the command: `python -i ./bin/run.py in windows` where it run the `run.py` file in a python environment

enter `newmath.div(6,3)` it will show the result from funtion `div(number1, number2)`

enter `exit()` for exit the python environment

![](assets\python_run.png)

4. Run the test case

Run the command: `$env:PYTHONPATH += ";$(Get-Location)\src"` and `python -m unittest discover -s test` for showing the unit test result

![](assets\python_test.png)


## newmath_java

1. Navigate to the file location

`cd Your drive:\Your file\seg3103_playground\Lab1\newmath_java\newmath_java`

2. Run

Run the command: `.\bin\run.bat`

![](assets\java_run.png)


3. Test

Run the command: `.\bin\test.bat`

![](assets\java_test.png)

## newmath_ex

1. Navigate to the file location

`cd Your drive:\Your file\seg3103_playground\Lab1\newmath_ex\newmath_ex`

2. Run

Run the command: `mix compile` for compile

Run the command: `iex -S mix`

Then enter: `NewmathEx.div(a,b)` where a is the numberator and b is the demoniator for running the function

![](assets\elixir_run.png)


3. Test

Run the command: `mix test %*` for testing


![](assets\elixir_test.png)