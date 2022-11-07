import java.util.Arrays;

public enum CaseRecordClients {
        CaseRecordName (1, "CaseRecordName");


        private final int id;
        private final String name;

        CaseRecordClients(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public static CaseRecordClients getById(int id) {
            return Arrays.stream(values())
                    .filter(t -> t.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
}

