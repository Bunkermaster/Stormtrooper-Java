/**
 * Created by yann on 19/05/2017.
 */
public class MonApp {
    public static void main(String [] args){
        Patrol patrol = new Patrol();
        patrol.addToCollection(new Stormtrooper("TK-TKTANOHEOHE"));
        patrol.addToCollection(new Stormtrooper("TK-T"));
        patrol.addToCollection(new Stormtrooper("TK-METRO"));
        patrol.addToCollection(new Stormtrooper("TK-1001"));
        patrol.addToCollection(new Stormtrooper("TK-1002"));
        patrol.addToCollection(new DarthVader("Darth Vader"));
//        System.out.println(patrol.getCollection());
        patrol.saluer();
    }
}
