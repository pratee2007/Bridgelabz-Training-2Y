@echo off
if not exist out mkdir out
javac -d out src\solutions\*.java
if %errorlevel% neq 0 exit /b %errorlevel%
java -cp out HelloWorld
pause
