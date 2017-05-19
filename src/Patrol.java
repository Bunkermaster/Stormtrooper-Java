import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public class Patrol {
    private UUID uuid;
    private Map<UUID, ImperialInterface> collection = new HashMap<UUID, ImperialInterface>();

    public Patrol() {
        this.uuid = UUID.randomUUID();
    }

    public Map getCollection() {
        return collection;
    }

    public void addToCollection(ImperialInterface ImperialInterface) {
        this.collection.put(ImperialInterface.getUuid(),ImperialInterface);
    }

    public void saluer() {
        if(this.collection.size() > 1){
            for (Object value : this.collection.values()) {
                ImperialInterface st = (ImperialInterface) value;
                st.saluer(this);
            }
        } else {
            System.out.println("Pas assez de monde dans la collection pour saluer.");
        }
    }

    public String quelSalut(ImperialInterface saluant, ImperialInterface salue){
        if(saluant.getRank() > salue.getRank()){
            return saluant.getName()+" : Salutations, "+salue.getName()+" vermine";
        } else if(saluant.getRank() < salue.getRank()){
            return saluant.getName()+" : Salutations, votre altesse "+salue.getName();
        } else if(saluant.getRank() == salue.getRank()){
            return saluant.getName()+" : Ouesh gros, "+salue.getName();
        }
        return "";
    }
}
