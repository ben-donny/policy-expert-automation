package uk.co.policyexpert;

public enum MaritalStatus {

    MARRIED("Married"),
    SINGLE("Single"),
    CO_HABITING_PARTNER("Co-habiting/partner"),
    DIVORCED("Divorced"),
    WIDOWED("Widowed"),
    SEPARATED("Separated"),
    CIVIC_PARTNERSHIP("Civil partnership");

    String maritalStatus;

    MaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
