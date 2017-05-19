import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public class Stormtrooper {
    private String uuid;
    private String name;
    private String[] dejaSalue;

    public Stormtrooper(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
    }

    public void saluer() {
        System.out.println(this.name + " : Hi!");
    }

    public void saluer(Patrol collection) {
        // on salue la collection
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
