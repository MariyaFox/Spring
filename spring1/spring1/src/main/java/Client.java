import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static CaseRecordClients crc = CaseRecordClients.CaseRecordName;

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IReception reception1 = context.getBean("reception", IReception.class);

        reception1.doPhotograph();
    }
}

