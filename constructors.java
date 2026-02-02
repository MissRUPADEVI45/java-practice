class varl {
    int a,b ;
    int m=5, n=9;
    public varl(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a:"+this.a + " " +"b:" + this.b);
    }
    void details(){
            System.out.println("sum of a+b:" + (this.a+this.b));
        }
    void details2(){
            System.out.println("sum of a*b:" + (this.a*this.b));
        }
    public static void main(String[] args) {
        varl obj=new varl(10,30);
        varl obj2 = new varl(20,20);
        varl ob3=new varl();
        obj.details();
        obj2.details2();
    }
    public varl(){
         System.out.println("m:"+this.m + " " +"n:" + this.n);
        
    }
}
