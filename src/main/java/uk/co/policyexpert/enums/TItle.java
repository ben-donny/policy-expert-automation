package uk.co.policyexpert.enums;

public enum TItle {
    MR("Mr"),
    MRS("Mrs"),
    MISS("Miss"),
    MS("Ms"),
    DR("Dr");

    private String title;

    TItle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
