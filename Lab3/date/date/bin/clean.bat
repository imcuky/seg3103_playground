REM Remove any class files from dist and all jacoco coverage files
del /F /Q .\dist\*.class
del /F /Q jacoco.exec
rd /S /Q .\report
