public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(73 % 5);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38 && grades.get(i) % 5 >= 3) {
                newGrades.add(grades.get(i)+(5 - (grades.get(i) % 5)));
            } else {
                newGrades.add(grades.get(i));
            }
        }
        return newGrades;
    }
}