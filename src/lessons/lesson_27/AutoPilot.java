package lessons.lesson_27;

public class AutoPilot {

    private String softwareVersion;

    public AutoPilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String toString() {
        return String.format("Autopilot: { SV: %s }", softwareVersion);
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
