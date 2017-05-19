import java.util.UUID;

/**
 * Created by yann on 19/05/2017.
 */
public interface ImperialInterface {
    UUID getUuid();
    String getName();
    void saluer(Patrol patrol);
    int getRank();
}
