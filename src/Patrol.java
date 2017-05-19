import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public class Patrol {
    private UUID uuid;
    private Map<UUID, Stormtrooper> collection = new HashMap<UUID, Stormtrooper>();

    public Patrol() {
        this.uuid = UUID.randomUUID();
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
                st.saluer(this);
            }
        } else {
            System.out.println("Pas assez de monde dans la collection pour saluer.");
        }
    }
}
