package com.encapsulation;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    //Override
    public double calculateBill() {
        return consultationFee;
    }

    //Override
    public void addRecord(String record) {
        setDiagnosis(record);
    }

    //Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }

}
