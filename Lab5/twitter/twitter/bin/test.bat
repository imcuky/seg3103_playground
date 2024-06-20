call .\bin\clean.bat

call .\bin\compile.bat



REM Run the Java command
java -jar lib\junit-platform-console-standalone-1.7.1.jar -cp dist;lib\easymock-4.3.jar;lib\objenesis-3.2.jar --scan-class-path
