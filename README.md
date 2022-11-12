# ShakshyamAdventOfCode

# Reflection
For Advent Of Code 1 I choose From 2017 Day 2 <br>

### Solution
~~~
var checkSum = 0
val line = input.split('\n')
for (values in line) {
    val num = values.split(' ')
    checkSum += num.max().toInt() - num.min().toInt()
}
println(checkSum)
~~~

First I split the input by new Line and then loop through each values then i splited the values by space by which i extracted the min and max value using min() and max() function and converted it to integer and calculated the sum.

It took me long time 3-4 days to figure out what was I doing wrong and I got help from instructor to complete this problem. I figured I was approaching the problem right way but I was not able to get the solution I wanted until i got help eith the problem. 

I looked in kotlin documentation for collection, list and map, Regex while figuring out the solution, I also went through learn CS course and looked there for resourses like List and Map.

I did not discussed the problem with any peers, tried to do it on my own but when i couldnot i discussed with instructor and got the solution.

I learned through recent project from jetbrains academy to write idiomatic code which i appled in second solution to make the code short.



