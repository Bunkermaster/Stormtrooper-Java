import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public class Patrol {
    private String uuid;
    private Map<String, Stormtrooper> collection = new HashMap<String, Stormtrooper>();

    public Patrol() {
        this.uuid = UUID.randomUUID().toString();
    }

    public Map getCollection() {
        return collection;
    }

    public void addToCollection(Stormtrooper stormtrooper) {
        this.collection.put(stormtrooper.getUuid(),stormtrooper);
    }

    public void saluer() {
        if(this.collection.size() > 1){
            for (Object value : this.collection.values()) {
                Stormtrooper st = (Stormtrooper) value;
                st.saluer();
            }
        } else {
            System.out.println("Pas assez de monde dans la collection pour saluer.");
        }
    }
}
