class Solution {
    public int[] solution(int brown, int yellow) {

        // 갈색 격자의 수로 보아 최소 카펫의 넓이는 3*3, 최대는 확실하진 않지만 암튼 5000은 안 넘음
        // 사각형이기 때문에 2500이하로 설정할 수도 있겠지만 크게 수행 시간에 영향을 주지 않을 수치이기 때문에 그냥 5000으로 고
        for(int width = 3; width <= 5000; width++){
            // 갈색+노랑 격자의 최소 개수와 형태로 보아 높이도 3이 최소, 카펫의 가로는 세로보다 같거나 김
            for(int height = 3; height <= width; height++){
                // 경계(갈색) 격자 수
                int boundary = (width + height - 2) * 2;
                // 중앙(노란) 격자 수
                int center = width * height - boundary;
                // 입력받은 값이랑 같은가? 확인
                if(brown == boundary && yellow == center){
                    // 맞으면 출력!
                    return new int[] {width, height};
                }
            }
        }
        // 어차피 for문 안에서 무조건 return 되므로 함수 형태 유지 용도
        return null;
    }
}
