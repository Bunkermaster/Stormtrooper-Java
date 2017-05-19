import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;


/**
 * Created by yann on 19/05/2017.
 */
public class Stormtrooper {
    private UUID uuid;
    private String name;
    private ArrayList<UUID> dejaSalue;

    public Stormtrooper(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.dejaSalue = new ArrayList<>();
    }

    public void saluer() {
        System.out.println(this.name + " : Hi!");
    }

    public void saluer(Patrol patrol) {
        // on salue la collection
        if(patrol.getCollection().size() > 1){
            for (Object value : patrol.getCollection().values()) {
                Stormtrooper st = (Stormtrooper) value;
                // verification du salue deja fait
                if(this.uuid != st.getUuid() && !dejaSalue.contains(st.getUuid())){
                    this.dejaSalue.add(st.getUuid());
                    System.out.println(this.name + " : Bonjour, " + st.getName());
                    st.saluer(patrol);
                }
            }
        } else {
            System.out.println("Pas assez de monde dans la collection pour saluer.");
        }
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
