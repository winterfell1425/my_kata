package kata2;

public class TheOffice {
    public static String outed(Person[] meet,String boss) {
        int numberOfPersons = meet.length;
        int score = 0;
        for (Person p: meet) {
            if (boss.equals(p.getName())) {
                score += p.getHappiness() * 2;
            } else {
                score += p.getHappiness();
            }
        }
        double groupHappines = score / numberOfPersons;
        if (groupHappines <= 5) {
            return "Get Out Now!";
        } else {
            return "Nice Work Champ!";
        }
    }
}