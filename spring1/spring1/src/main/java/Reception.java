import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("reception")
@Scope("prototype")
public class Reception implements IReception {

    Integer res = 0;
    //  //  Random random = new Random(System.currentTimeMillis());
    Random random = new Random();

    public Reception () {
        res = random.nextInt();
    }

    @Override
    public void doPhotograph() {
        System.out.println("Карточка выдана.");
        Archive.processing();
    }

    public void setArchive(IArchive archive) {

    }
}
