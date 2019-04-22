import java.util.Scanner;

class Clinic {
    private final int maxPatientNumber = 10;
    private Patient[] patients = new Patient[maxPatientNumber];
    private int regPatiens = 0;



    public void addPatient (Patient patient){
        if (regPatiens < maxPatientNumber) {
            patients[regPatiens] = patient;
            regPatiens++;
        }else {
            System.out.println("");
        }

    }

    public void printPatients(){
        for (int i = 0; i <regPatiens; i++) {
            System.out.println("Name: " + patients[i].getFirstName() + " LastName: "
                    + patients[i].getLastName() + " PESEL: "
                    + patients[i].getPesel());
          }
        }
    }


