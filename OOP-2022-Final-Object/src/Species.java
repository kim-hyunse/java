import java.io.Serializable;

public class Species implements Serializable

{ 

public String name;

public int population;

public double growthRate;

       

public Species(String n, int p, double r) {

   name = n;

   population = p;

   growthRate = r;

}

 

@Override

public String toString () {

  return "Name=" + name + "\n" +

         "Population=" + population + "\n"+

         "Growth rate=" + growthRate;

}

}
