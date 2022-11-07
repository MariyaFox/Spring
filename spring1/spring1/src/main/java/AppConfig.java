import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(name = "archive")
  //  public IArchive archive() {
 //       return new CaseRecord();
 //   }
    @Bean(name = "caseRecord")
    public ICaseRecord caseRecord() {
        return new CaseRecordName();
    }

    @Bean (name = "archive")
    public IArchive archive(ICaseRecord caseRecord) {
        Archive archive = new Archive();
        archive.setCaseRecord(caseRecord);
        return archive;
    }

    @Bean(name = "reception")
    public IReception reseption(IArchive archive) {
        Reception reception = new Reception();
        reception.setArchive(archive);
        return reception;
    }
}
