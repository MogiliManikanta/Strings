class Solution {
    public String removeOuterParentheses(String s) {
      String result="";
      int count=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
              count++;
              if(count>=2){
                  result+='(';
              }
          }
          else{
              count--;
              if(count>=1){
                  result+=')';
              }
          }
        }
        return result;
    }
}
/**
Primitive string will have equal number of opened and closed parenthesis.
Explanation:
opened count the number of opened parenthesis.
Add every char to the result,
unless the first left parenthesis,
and the last right parenthesis.
Time Complexity:
O(N) Time, O(N) space
 */
/**
(()())(())
1212101210
if cnt > = 2 then add (
if cnt > = 1 then add )
(()())(())(()(()))
121210121012123210
()()
1010 */