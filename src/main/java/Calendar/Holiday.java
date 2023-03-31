package Calendar;

import java.time.LocalDate;

public class Holiday {
    private String globalName;
    private LocalDate date;
    private String localName;
    private String notes;

    public Holiday(String globalName, LocalDate date, String localName, String notes) {
        this.globalName = globalName;
        this.date = date;
        this.localName = localName;
        this.notes = notes;
    }

    public String getGlobalName() {
        return globalName;
    }

    public void setGlobalName(String globalName) {
        this.globalName = globalName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "globalName='" + globalName + '\'' +
                ", date=" + date +
                ", localName='" + localName + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
