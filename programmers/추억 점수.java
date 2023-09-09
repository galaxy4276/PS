import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        int photoSize = photo.length;
        int[] result = new int[photoSize];
        int resultIndex = 0;

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int sum = 0;
        for (int i = 0; i < photoSize; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                Integer value = map.get(photo[i][j]);
                if (Objects.nonNull(value)) sum += value;
            }

            result[resultIndex++] = sum;
            sum = 0;
        }

        return result;
    }
}
