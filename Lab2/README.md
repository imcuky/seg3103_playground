
# Lab 2


## Exercise 1

`java --add-opens java.base/java.lang=ALL-UNNAMED -jar  user-registration-app-0.1.0.jar`

|Test Case	| User Name | FirstName | LastName | Email| Age | City |Postal Code
------------|------------|------------|------------|------------|------------|------------|------------|
TC1 | User00 | "" | "" | example@gmail.com | 18 | Halifax | A5B3C4
TC2 | User00000000 | Catherine | Lee | example01_now@gmail-now.com | 64 | Ottawa | B1A 4B4
TC3 | UserName1234 | John Doe | Smith Jr |  user@domain.c | 18 | Montreal | A1A1A1
TC4 | "" | "" | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC5 | a | "" | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC6 | aaa... | "" | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC7 | 0000000 | "" | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC8 | UserName1234 | 2John | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC9 | UserName1234 | John2 | "" | example@gmail.com | 18 | Ottawa | A5B3C4
TC10 | UserName1234 | "" | 2Smith | example@gmail.com | 18 | Ottawa | A5B3C4
TC11 | UserName1234 | "" | Smith2 | example@gmail.com | 18 | Ottawa | A5B3C4
TC12 | UserName1234 | "" | "" | example@gmail.com | "" | Ottawa | A5B3C4
TC13 | UserName1234 | "" | "" | example@gmail.com | 17 | Ottawa | A5B3C4
TC14 | UserName1234 | "" | "" | example@gmail.com | 65 | Ottawa | A5B3C4
TC15 | UserName1234 | "" | "" | "" | 18 | Ottawa | A5B3C4
TC16 | UserName1234 | "" | "" | example.com | 18 | Ottawa | A5B3C4
TC17 | UserName1234 | "" | "" | example??@gmail.com | 18 | Ottawa | A5B3C4
TC18 | UserName1234 | "" | "" | example@gmailcom | 18 | Ottawa | A5B3C4
TC19 | UserName1234 | "" | "" | example@gmail??.com | 18 | Ottawa | A5B3C4
TC20 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | A5B3C4
TC21 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | A5B3C4C4
TC22 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | 5AB3C4
TC23 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | D5B3C4
TC24 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | W5B3C4
TC25 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | a5B3C4
TC26 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | ASASAA
TC27 | UserName1234 | "" | "" | example@gmail.com?? | 18 | Ottawa | 000000
<br><br>

| Test Case   | Expected Results   | Actual Results   | Verdict (Pass, Fail, Inconclusive)
------------|------------|------------|------------|
|TC1| valid | valid | Pass
|TC2| valid | valid | Pass
|TC3| Wrong Email format | Wrong Email format | Pass
|TC4| UserName is mandatory | Wrong UserName format Size of UserName must be between 6 and 12 | Fail
|TC5| Size must be between 6 and 12 | Size of UserName must be between 6 and 12 Wrong UserName format | Pass
|TC6 | Wrong UserName format | Wrong UserName format | Pass
|TC7 | Wrong UserName format | Wrong UserName format | Pass
|TC8 | Wrong FirstName format | Wrong FirstName format | PASS
|TC9 | Wrong FirstName format | Wrong FirstName format | PASS
|TC10 | Wrong LastName format | Wrong LastName format | PASS
|TC11 | Wrong LastName format | Wrong LastName format | PASS
|TC12 | Age is mandatory | Age is mandatory | PASS
|TC13 | must be greater than or equal to 18 | must be greater than or equal to 18 | PASS
|TC14 | must be less than or equal to 64 | must be less than or equal to 64 | PASS
|TC15 |An Email address is mandatory  |Wrong Email format | FAIL
|TC16 |Wrong Email format  |Wrong Email format | PASS
|TC17 |Wrong Email format  |Wrong Email format | PASS
|TC18 |Wrong Email format  |Wrong Email format | PASS
|TC19 |Wrong Email format  |Wrong Email format | PASS
|TC20 |Wrong Email format  |Wrong Email format | PASS
|TC21 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC22 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC23 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC24 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC25 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC26 |Wrong Postal Code format  |Wrong Postal Code format | PASS
|TC27 |Wrong Postal Code format  |Wrong Postal Code format | PASS

 - JUnit result on BitTest.java and BitAndTest.java

`run: .\bin\test.bat`

![alt text](https://github.com/imcuky/seg3103_playground/blob/main/Lab2/assets/image.png)



## Exercise 2


JUnit test result

![dateTest](https://github.com/imcuky/seg3103_playground/blob/main/Lab2/assets/dateTest.png)
![DateNextOk](https://github.com/imcuky/seg3103_playground/blob/main/Lab2/assets/DateNextOk.png)
![DateNextException](https://github.com/imcuky/seg3103_playground/blob/main/Lab2/assets/DateNextException.png)
