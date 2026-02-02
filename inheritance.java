import java.io.*;
public class Main{
    public static void main(String[] args){
        car obj=new car();
        luxurybrands obj2=new luxurybrands();//how we call multiple inheritance through interfaces.
        obj2.bmw();
        obj2.porshe();
        toyato_fortuner obj3=new toyato_fortuner();
    }
}

interface bmw {        //it is example for multiple inheritance
    default void bmw(){
        System.out.println("Hiii....I'm BMW");
    }
}
interface porshe{        //it is example for multiple inheritance
    default void porshe(){
        System.out.println("Hiii....I'm PORSHE");
    }
}
class luxurybrands implements bmw,porshe{ //here shows how multiple inheritance is possible using interfaces.
    luxurybrands(){
        System.out.println("We are LUXURY BRANDS");
    }
}
class vehicle{
    vehicle(){
    System.out.println("this is vehicle");
    }
}
class car extends vehicle{
    car(){
     System.out.println("this is car");
    }
}
class toyato_fortuner extends car{        //it is example for multilevel inheritance
    toyato_fortuner(){
        System.out.println("this is toyato_fortuner");
    }
}


