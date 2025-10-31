Question: We are given a number and we need to find a number when the sum of the numbers before it(inclusive) and after it(inclusive) matches and return that number

(we take the number in order till the natural number we are given)

Example 1: n=8 [1,2,3,4,5,6,7,8] 

1+2+3+4+5+6 = 21

6+7+8 = 21

so answer: 6

Example 2: n=4 [1,2,3,4]

1+2 = 3 ; 2+3 = 5;

not possible

return -1;
