package com.javagenerics.aidrivenresume;

public class Resume<T extends JobRole> {
	String candidateName;
    T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public void processResume() {
        System.out.println(candidateName + " applied for " + role.getRoleName());
    }
}
