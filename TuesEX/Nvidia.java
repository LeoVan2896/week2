package week2.Tuesday;

public class Nvidia extends Part{
    String manufacture;
    static String name = "Nvidia";


    public Nvidia(String manufacture){
        super("3080ti", 16);
        this.manufacture = manufacture;

        }

    @Override
    public void speak() {
        super.speak();
        System.out.println(this.graphic + "is made by "+ this.manufacture);
    }


    //overload


    public static String name( int a, String b ){
        return a + b;
    }
    public static String name(String c, int a){
        return c+" "+ a;

    }
    public static String name(String c, int a, String b){
        return c +" "+ a +b;
    }






}




