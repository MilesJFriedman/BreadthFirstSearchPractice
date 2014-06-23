Calculator Games
Filename:
calc

The Problem
You are given a calculating device that has a single display screen that displays non
-negative integers less than 1 billion(up to 9 digits) and three buttons. The three 
buttons perform the following functions on the current value, x, on the display 
screen:

(1) Add 1
(2) Multiply by 3
(3) Integer Division by 2

You are given a starting positive integer n < 100 and your goal will be to figure
out the minimum number of button presses necessary to reach all of the other positive
integers less than 100. Your program should simply output the maximum of all of these
numbers, namely, the most number of button presses needed to reach any particular 
value. Remember that since the display doesn't allow any numbers one billion or 
greater, no intermediate calculation can arrive at a result equal to or greater than 
one billion.

Input Format
The first line will contain a single positive integer, n < 100, specifying the number
of input cases. Each input case will have a single positive integer, k<100, on a line
by itself representing the starting value for that case.

Output Format
For each test case, on a line by itself, output the desired maximum number of button
presses to reach any of the numbers from 1 to 99 for that case.

Sample Input
3
1
73
99

Sample Output
10
11
12