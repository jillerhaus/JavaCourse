public class Houses {
    private String color;

    public Houses(String color) {
        // This keyword is required, same parameter name as field
        this.color = color;
    }

    public String getColor() {
        // this is optional
        return color;
    }

    public void setColor(String color) {
        // this keyword is required, same parameter names as field
        this.color = color;
    }
}
