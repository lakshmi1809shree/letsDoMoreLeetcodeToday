class Solution {
    public int productofdigit(int n){
        int product=1;
        while(n!=0){
            product*=n%10;
            n=n/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(productofdigit(n)%t!=0){
            n++;
        }
        return n;
    }
}