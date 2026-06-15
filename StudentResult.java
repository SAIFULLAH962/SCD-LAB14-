public class StudentResult {

    private int[] marks;

    public StudentResult(int[] marks) {

        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("Marks cannot be empty");
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 85) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 85"
                );
            }
        }

        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public String getResultStatus() {

        for (int mark : marks) {
            if (mark < 40) {
                return "Fail";
            }
        }

        return "Pass";
    }

    public String getGrade() {

        double avg = calculateAverage();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }
}
