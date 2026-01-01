package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Sanvi", 21, 5, 3000);
        Patient p2 = new OutPatient(102, "Priyanshi", 22, 800);

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {

            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Normal Checkup");
                record.viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}
