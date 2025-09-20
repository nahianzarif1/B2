public class Grade {

    public String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    public static void main(String[] args) {
        Grade g = new Grade();
        System.out.println("Marks 95: " + g.getGrade(95));
        System.out.println("Marks 75: " + g.getGrade(75));
        System.out.println("Marks 55: " + g.getGrade(55));
    }
}