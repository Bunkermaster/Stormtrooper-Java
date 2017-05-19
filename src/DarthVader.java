import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public class DarthVader implements ImperialInterface{

    private UUID uuid;
    private String name;
    private boolean dejaEnvoyeChier;
    private int rank = 9999;

    public DarthVader(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
    }

    @Override
    public UUID getUuid() {
        return this.uuid;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void saluer(Patrol patrol) {
        if(!this.dejaEnvoyeChier){
            this.dejaEnvoyeChier = true;
            System.out.println(this.name + " : Allez tous mourir.");
        }
    }

    @Override
    public int getRank() {
        return this.rank;
    }
}
