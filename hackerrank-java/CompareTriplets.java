static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> answer = new ArrayList<>();
    Integer aScore = 0;
    Integer bScore = 0;
    for (int i = 0; i < a.size(); i++) {
        if (a.get(i) > b.get(i)) {
            aScore++;
        } else if (a.get(i) < b.get(i)) {
            bScore++;
        }
    }
    answer.add(aScore);
    answer.add(bScore);
    return answer;
}