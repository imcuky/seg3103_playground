REM Compile the application
javac -encoding UTF-8 --source-path src -d dist src\*.java

REM Compile the tests
javac -encoding UTF-8 --source-path test -d dist -cp dist;lib\easymock-4.3.jar;lib\junit-platform-console-standalone-1.7.1.jar test\*.java
