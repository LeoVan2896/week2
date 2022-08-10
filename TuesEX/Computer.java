package week2.Tuesday;

import static week2.Tuesday.Nvidia.name;

public class Computer {
    public static void main(String[] args){
        Part pc1 = new Part("Intel", "Nvidia 3090Ti", "Fullcase RBG", 64, 1000);
        Part pc2 = new Part("Ryzen", "Radeon 6800XT", "Fullcase", 32,850);
        Buyers man1 = new Buyers("Huy", "Cypress", 5000, "Bachelor");
        Buyers man2 = new Buyers("Leo", "New York", 10000, "Master Degree");


        pc1.speak();
        pc2.speak();
        System.out.println(pc1);
        pc1.requirement();


        String name;
        System.out.println(name(3090, "Ti"));
        System.out.println(name("Nvidia", 3070, "Ti"));
        System.out.println(name("AMD", 6800));


    }
}
