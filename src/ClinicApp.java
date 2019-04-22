import java.util.Scanner;

class ClinicApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;

        Clinic clinic = new Clinic();

        while (option != exit){
            System.out.println("Available options: ");
            System.out.println("press 0 to exit program");
            System.out.println("press 1 to add patient");
            System.out.println("press 2 to screen register patients");
            System.out.println("chose options: ");
            option = input.nextInt();
            input.nextLine();

            switch (option){
                case addPatient:
                    Patient patient = new Patient();
                    System.out.println("Name: ");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Last Name: ");
                    patient.setLastName(input.nextLine());
                    System.out.println("Pesel: ");
                    patient.setPesel(input.nextLine());
                    clinic.addPatient(patient);
                    System.out.println("Patient register.");
                    break;



                case printPatients:
                    clinic.printPatients();
                    break;
                case exit:
                    System.out.println("close program.");
                default:
                    System.out.println("chose other options");
            }
        }
        input.close();
    }
}
