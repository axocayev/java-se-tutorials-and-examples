Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input
<br>
5<br>
5 41 77 74 22 44<br>
1 12<br>
4 37 34 36 52<br>
0<br>
3 20 22 33<br>
5<br>
1 3<br>
3 4<br>
3 1<br>
4 3<br>
5 5<br>
Sample Output<br>

74<br>
52<br>
37<br>
ERROR!<br>
ERROR!<br>
Explanation<br>

The diagram below explains the queries:<br>

<img src="https://s3.amazonaws.com/hr-assets/0/1489168616-b25dd38013-arraylist.png" alt="image" title="">
