class Solution {
    public int scoreOfParentheses(String s) {
        int depth=0;
        int score=0;
        char previous='(';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }
            else{
                depth--;
                if(previous=='('){
                    score+=Math.pow(2,depth);
                }
            }
            previous=s.charAt(i);
        }
        return score;
    }
}
/**   
\U0001f4ce Constant Space :

As the string is balanced, a ( bracket could be used to mark the start of a new depth (i.e. 2 times the depth) & a ) bracket would indicate us the end of a valid sub-portion of paranthesis. Hence,

We need to update the depth of a paranthesis.
If ( - our depth increases
If ) - our depth decreases
If at any point, we see a valid balanced pair (), then we need to update the output acc to Rule #3
For eg:



str =    (   (   (   (   )  (   )  (   )   )  )  )
depth =  1   2   3   4   3  4   3  4   3   2  1  0
R =                      8      8      8

Final result = 8 + 8 + 8 = 24

Why are we decrementing when we find a `)` ? It is because the intermediate `()` lies at d-1 depth. 
eg: (   (   (  **(   )** - this valid pair lies at depth 3.
   */