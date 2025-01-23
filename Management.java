import java.util.Date;
import java.util.Scanner;

public class Management {
    private MedicalData[] medicalrecords;
    public void startApplication() {

        Patient patient = newPatient();
        System.out.print("Your details - ");
        printPatient(patient);
        System.out.println("How many records you wish to add :");
        Scanner inputReader = new Scanner(System.in);
        int len = inputReader.nextInt();
        medicalrecords = new MedicalData[len];
        for (var i= 0; i < len; i++) {
            medicalrecords[i] = newMedicalData();
        }
        System.out.println("Your medical records ");
        for (var i= 0; i < len; i++) {
            printMedicalData(medicalrecords[i]);
        }
    }

    public void printPatient(Patient patient){
        patient.printPatient();
    }
    public void printMedicalData(MedicalData medicalData){
        medicalData.printMedicalData();
    }
    public Patient newPatient(){
        Scanner inputReader = new Scanner(System.in);
        int id, age;
        String name, bloodGroup, address;
        System.out.println("Enter patient data");
        System.out.println("Enter patient id: ");
        id = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("Enter patient name: ");
        name = inputReader.nextLine();
        System.out.println("Enter patient age: ");
        age = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("Enter patient blood group: ");
        bloodGroup = inputReader.nextLine();
        System.out.println("Enter patient address: ");
        address = inputReader.nextLine();
        return new Patient(id, name, age, bloodGroup, address);
    }

    public MedicalData newMedicalData(){
        Scanner inputReader = new Scanner(System.in);
        int id, patientId;
        String title, description, type;
        System.out.println("Medical data");
        System.out.println("Medical data id: ");
        id = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("Medical data patient id: ");
        patientId = inputReader.nextInt();
        inputReader.nextLine();
        System.out.println("Medical data title: ");
        title = inputReader.nextLine();
        System.out.println("Medical data description: ");
        description = inputReader.nextLine();
        System.out.println("Medical data type: ");
        type = inputReader.nextLine();
        return new MedicalData(id, patientId, title, description, type, new Date(System.currentTimeMillis()));
    }
}
