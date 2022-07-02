import java.util.*;

class Chocolate {

    private int barCode;
    private String name;
    private int weight;
    private int cost;

    public int getBarCode(){ return barCode; }

    public void setBarCode(int barCode){

        this.barCode = barCode;

    }

    public String getName() { return name; }

    public void setName(String name)
    {

        this.name = name;
    }

    public int getWeight(){ return weight; }

    public void setWeight(int weight){

        this.weight = weight;

    }
    public int getCost(){ return cost; }

    public void setCost(int cost){

        this.cost = cost;

    }
}
public class ConstructorsConceptGetterSetter {

    public static void main(String[] args) {
        Chocolate choco = new Chocolate();
        choco.setBarCode(101);
        System.out.println(choco.getBarCode());
        choco.setBarCode(102);
        System.out.println(choco.getBarCode());
    }

}
