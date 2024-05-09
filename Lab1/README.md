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

4. Run the test case

Run the command: `$env:PYTHONPATH += ";$(Get-Location)\src"` and `python -m unittest discover -s test` for showing the unit test result


## newmath_java

1. Navigate to the file location

`cd Your drive:\Your file\seg3103_playground\Lab1\newmath_java\newmath_java`

2. Run

Run the command: `.\bin\run.bat`

3. Test

Run the command: `.\bin\test.bat`


## newmath_ex


