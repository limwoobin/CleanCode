import java.util.*;

public class Test {
    static int[] a = {5, 3, 4, 6, 2, 1};
//    static int[] a = {6, 2, 3, 4, 1, 5};
    private static Map<Integer , Set<Integer>> teamMap = new HashMap<>();

    public static void main(String[] args) {
        int teamCount = 0;

        for (int user : a) {
            if (!teamMap.isEmpty()) {
                boolean overUserGrade = iterateTeam(user);
                if (overUserGrade) {
                    addTeamAndPlayer(++teamCount , user);
                }
            } else {
                addTeamAndPlayer(++teamCount , user);
            }
        }

        System.out.println(teamMap.size());
    }

    private static void addTeamAndPlayer(int teamCount , int user) {
        teamMap.put(teamCount , new HashSet<>(Arrays.asList(user)));
    }

    private static boolean iterateTeam(int user) {
        boolean overUserGrade = false;

        for (int key : teamMap.keySet()) {
            overUserGrade = iterateTeamUser(key , user);

            if (!overUserGrade) {
                teamMap.get(key).add(user);
                break;
            }
        }

        return overUserGrade;
    }

    private static boolean iterateTeamUser(int key , int user) {
        boolean overUserGrade = false;

        for (int teamUser : teamMap.get(key)) {
            if (teamUser > user) {
                overUserGrade = true;
                return overUserGrade;
            } else {
                overUserGrade = false;
            }
        }

        return overUserGrade;
    }
}
