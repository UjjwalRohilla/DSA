package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {
    public void swim(){
        Gosling other = new Gosling();
        other.floatInWater();
        System.out.println(other);
        floatInWater();
        System.out.println(text);
    }
}
