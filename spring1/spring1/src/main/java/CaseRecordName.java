import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("CaseRecordName")
@Scope("prototype")
public class CaseRecordName implements ICaseRecord {
    Integer res = 0;
    Random random = new Random();

    public CaseRecordName() {
        res = random.nextInt();
    }

    public void processing() {
        System.out.println("Выдана карточка пациента.");
        System.out.println("Кабинет: " + res);
    }
}
