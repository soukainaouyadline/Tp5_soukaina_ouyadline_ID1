package exercice1;

public class main {

    public static void main(String[] args) {

        
        Boite<String> boiteString = new Boite<>();
        boiteString.setContenu("salut");
        System.out.println("Boite String : " + boiteString.getContenu());

       
        Boite<Integer> boiteInteger = new Boite<>();
        boiteInteger.setContenu(44);
        System.out.println("Boite Integer : " + boiteInteger.getContenu());
    }
}
