
interface Mobile{
    void microphone();
    void storage();
}
abstract class Brand implements Mobile{
     public void microphone(){
    System.out.println("microphone feature is available");
    }
    public void storage(){
    System.out.println("storage feature is available");
    }
   
}
class Oppo extends Brand {
   
}
class Vivo extends Brand{
  
}

class Iphone extends Brand{
    public void camera(){
    System.out.println("Iphone has a high pixel camera capture level");
    }
}
class Main {
    public static void main(String[] args) {
        Oppo obj = new Oppo();
        Vivo obj2 = new Vivo();
        Iphone obj3=new Iphone();
        
        obj.microphone();
        obj2.microphone();
        obj.storage();
        obj2.storage();
        obj3.camera();
        obj3.microphone();
        obj3.storage();
    }
}
