del /F /Q dist\*.class

REM Compile the application
javac -encoding UTF-8 -sourcepath src -d dist src\*.java

REM Compile the tests
javac -encoding UTF-8 -sourcepath test -d dist -cp dist;lib\junit-platform-console-standalone-1.7.1.jar test\*.java

java -jar lib\junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
