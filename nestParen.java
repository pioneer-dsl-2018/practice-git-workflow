//Zeng Wei Cheng, nestParen.java
//from codingbat
public boolean nestParen(String str) {
    if(str.length()%2==1)
    return false;
    if(str.equals(""))
        return true;
    char[] letters = str.toCharArray();
    return checker(letters,0,str.length()-1);
}
public boolean checker(char[] string,int start,int end){
  if(start==end+1)
    return true;
  if(string[start]=='('&&string[end]==')'){
    start++; end--;
    return checker(string,start,end);
  }
  else return false;
}
