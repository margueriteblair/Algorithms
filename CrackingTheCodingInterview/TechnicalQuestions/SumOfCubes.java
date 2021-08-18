import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class SubOfCubes {

    public static void main(String[] args) {
        sumCubes4();
    }

    static void sumCubes() {
        int limit = 1000;
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    for (int d = 1; d <= limit; d++) {
                        if ((Math.pow(a, 3)+Math.pow(b, 3)) == (Math.pow(c, 3)+Math.pow(d, 3))) {
                            System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
                        }
                    }
                }
            }
        }
    }

    static void sumCubes2() {
        int limit = 1000;
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    for (int d = 1; d <= limit; d++) {
                        if ((Math.pow(a, 3)+Math.pow(b, 3)) == (Math.pow(c, 3)+Math.pow(d, 3))) {
                            System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
                            break;                    }
                    }
                }
            }
        }
    }

    static void sumCubes3() {
        int limit = 1000;
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    int d = (int)Math.pow(Math.pow(a, 3)+Math.pow(b, 3)-Math.pow(c, 3), (1/3));
                    if ((Math.pow(a, 3)+Math.pow(b, 3)) == (Math.pow(c, 3)+Math.pow(d, 3))) {
                        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
                        break;                    
                    }
                }
            }
        }
    }

    static void sumOfCubes4() {
        int limit = 1000;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int c = 1; c <= limit; c++) {
            for (int d = 1; d <= limit; d++) {
                result = Math.pow(d, 3) + Math.pow(c, 3);
                List<Integer> list = new ArrayList<>();
                list.add(c);
                list.add(d);
                map.put(list, result);
            }
        }
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                int result = (int) Math.pow(a, 3) + Math.pow(b, 3);
                List<Integer> list = map.get(result);
                for (int i : list) {
                    System.out.println(i);
                }
            }
        }
    }
}