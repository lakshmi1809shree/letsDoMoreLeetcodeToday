class Solution {
    private void solve(String digits,int idx,StringBuilder curr,List<String> res,Map<Character,String> digitToLetter){
        if(idx==digits.length()){
            res.add(curr.toString());
            return;
        }
        String letters=digitToLetter.get(digits.charAt(idx));

        for(char letter:letters.toCharArray()){
            curr.append(letter);
            solve(digits,idx+1,curr,res,digitToLetter);
            curr.deleteCharAt(curr.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits ==null || digits.length()==0)return res;

        Map<Character,String> digitToLetter= new HashMap<>();

        digitToLetter.put('2',"abc");
        digitToLetter.put('3',"def");
        digitToLetter.put('4',"ghi");
        digitToLetter.put('5',"jkl");
        digitToLetter.put('6',"mno");
        digitToLetter.put('7',"pqrs");
        digitToLetter.put('8',"tuv");
        digitToLetter.put('9',"wxyz");

        solve(digits,0,new StringBuilder(),res,digitToLetter);

        return res;

    }
}