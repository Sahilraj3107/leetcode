class Pair {
    String first;
    int second;

    Pair(String word, int step) {
        this.first = word;
        this.second = step;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> st = new HashSet<>();

        for (int i = 0; i < wordList.size(); i++)
            st.add(wordList.get(i));
        st.remove(beginWord);
        // int cng=1;
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int step = q.peek().second;
            q.poll();

            if (word.equals(endWord) == true)
                return step;
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char arr[] = word.toCharArray();
                    arr[i] = ch;
                    String s = new String(arr);

                    if (st.contains(s) == true) {
                        st.remove(s);
                        q.add(new Pair(s, step + 1));

                    }
                }
            }
        }
        return 0;
    }
}