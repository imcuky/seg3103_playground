call .\bin\clean.bat


javac -encoding UTF-8 --source-path src -d dist src/*.java


java -cp ./dist Main