javac -encoding UTF-8 --source-path src -d dist src/*.java


javac -encoding UTF-8 --source-path test -d dist -cp dist;lib/junit-platform-console-standalone-1.7.1.jar test/*.java
