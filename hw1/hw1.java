package seminar1.hw1;

public class hw1 {
    public static void main(String[] args) {
        String tmp, s = "the sky is blue";
        String[] words = s.split(" ");
        tmp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = tmp;
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
