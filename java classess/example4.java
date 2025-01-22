class Example5{
    static int a=24;
    public static void main(String args[]){
        try{
            int cnt=0,num=12;
            num/=cnt;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(a);
       }
}