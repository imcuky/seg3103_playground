call .\bin\clean.bat

call .\bin\compile.bat

java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
