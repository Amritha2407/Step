package AS2.P5;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().toLowerCase();

        text = text.replace(".", "");
        text = text.replace(",", "");

        String[] words = text.split("\\s+");

        String[] stop = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            boolean skip = false;

            for (int j = 0; j < stop.length; j++) {
                if (words[i].equals(stop[j]))
                    skip = true;
            }

            if (!skip)
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        for (String word : list)
            System.out.println(word + ": " + map.get(word));
    }
}
