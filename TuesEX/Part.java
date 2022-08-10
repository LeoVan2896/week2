package week2.Tuesday;

public class Part {


    String processor;
    String graphic;
    String casetype;
    int ram;
    double powersuplly;


    public Part(String processor, String graphic, String casetype, int ram, double powersuplly) {
        this.processor = processor;
        this.graphic = graphic;
        this.casetype = casetype;
        this.ram = ram;
        this.powersuplly = powersuplly;
    }
    public Part(String graphic, int ram){
        this.graphic = graphic;
        this.ram = ram;
    }





    public String toString(){
       String returnvalue = "";
       returnvalue += "\nThis computer has "+this.processor;
       returnvalue += "\nIt also have "+ this.graphic + " and "+this.casetype;
       returnvalue += "\nthe Ram memory is: "+this.ram + " and the power supply is:"+ this.powersuplly;
       return returnvalue;


    }
    public void requirement() {
        System.out.println(this.processor + " requires at least " + this.graphic + " and "+ this.powersuplly+" W power supply.");
    }
    public void speak(){
        System.out.println("this PC has "+ this.graphic);
    }




}
