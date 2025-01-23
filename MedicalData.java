import java.util.Date;

public record MedicalData(int id, int patientId, String title, String description, String type, Date date) {
    public void printMedicalData() {
        System.out.println("Medical data");
        System.out.println("id          : " + id());
        System.out.println("patient id  : " + patientId());
        System.out.println("title       : " + title());
        System.out.println("description : " + description());
        System.out.println("type        : " + type());
        System.out.println("date        : " + date());
    }
}
