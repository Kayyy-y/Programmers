import java.util.*;

class Solution {
    private class State {
        public final int x;
        public final int y;
        public final int step;
        
        private State(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
        }
    }
    
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};
    
    public int solution(int[][] maps) {
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];
        
        Queue<State> queue = new LinkedList<>();
        // 초기 상태
        queue.add(new State(0, 0, 1));
        isVisited[0][0] = true;
        
        while(!queue.isEmpty()) {
            State state = queue.poll();

            // 상대 진영에 도착함
            if(state.y == maps.length - 1 && state.x == maps[state.y].length - 1) {
                return state.step;
            }

            // 상하좌우로 이동
            for(int d = 0; d < 4; d++) {
                int nx = state.x + dx[d];
                int ny = state.y + dy[d];

                // 5x5를 넘는다면 실행x
                if(ny < 0 || ny >= maps.length || nx < 0 || nx >= maps[ny].length) {
                    continue;
                }

                // 벽이 있다면 실행x
                if(maps[ny][nx] != 1) {
                    continue;
                }

                // 방문한 적 있다면 실행x
                if(isVisited[ny][nx]) {
                     continue;
                }

                // 방문했다고 표시
                isVisited[ny][nx] = true;
                // 이동 후, 몇 번째인지 +1
                queue.add(new State(nx, ny, state.step + 1));
            }
        }    
        
        return -1;
    }
}
