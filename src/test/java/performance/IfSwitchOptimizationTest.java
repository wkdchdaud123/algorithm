package performance;

import org.junit.jupiter.api.Test;

public class IfSwitchOptimizationTest {

    private static Integer count = 0;
    @Test
    public void if_switch_속도비교(){

        IfSwitchOptimizationTest iso = new IfSwitchOptimizationTest();

        int repeat = 10000000; //100만건
        //int repeat = 10000000; //1000만건

        System.out.println("-- 입력 값이 0인 경우 --");
        iso.ifResult(repeat, ()-> 0);
        iso.switchResult(repeat, ()-> 0);

        System.out.println("-- 입력 값이 5인 경우 --");
        iso.ifResult(repeat, ()-> 5);
        iso.switchResult(repeat, ()-> 5);

        System.out.println("-- 입력 값이 9인 경우 --");
        iso.ifResult(repeat, ()-> 9);
        iso.switchResult(repeat, ()-> 9);

        System.out.println("-- 입력 값이 20인 경우 --");
        iso.ifResult(repeat, ()-> 20);
        iso.switchResult(repeat, ()-> 20);

        System.out.println("-- 입력 값이 28인 경우 --");
        iso.ifResult(repeat, ()-> 28);
        iso.switchResult(repeat, ()-> 28);

        System.out.println("-- 입력 값이 30인 경우 --");
        iso.ifResult(repeat, ()-> 30);
        iso.switchResult(repeat, ()-> 30);

        System.out.println("-- 입력 값이 36인 경우 --");
        iso.ifResult(repeat, ()-> 36);
        iso.switchResult(repeat, ()-> 36);

        System.out.println("-- 입력 값이 조건에 포함 안되는 경우 --");
        iso.ifResult(repeat, ()-> 130);
        iso.switchResult(repeat, ()-> 130);

        System.out.println("-- 랜덤 숫자  -- : " + Math.random()*10);
        iso.ifResult(repeat, ()-> (int)Math.random()*10);
        iso.switchResult(repeat, ()-> (int)Math.random()*10);

        //////////////////////////////////////////////
        System.out.println("#####################################################");
        System.out.println("####################### SMALL ##################");

        System.out.println("-- small 입력 값이 0인 경우 --");
        iso.smallIfResult(repeat, ()-> 0);
        iso.smallSwitchResult(repeat, ()-> 0);

        System.out.println("-- small 입력 값이 2인 경우 --");
        iso.smallIfResult(repeat, ()-> 2);
        iso.smallSwitchResult(repeat, ()-> 2);

        System.out.println("-- small 입력 값이 99인 경우 --");
        iso.smallIfResult(repeat, ()-> 99);
        iso.smallSwitchResult(repeat, ()-> 99);

        System.out.println("-- small 입력 값이 조건에 포함 안되는 경우 --");
        iso.smallIfResult(repeat, ()-> 130);
        iso.smallSwitchResult(repeat, ()-> 130);

    }

    public interface VariableRuleGeneratable {
        int result();
    }

    public void ifResult(int repeat, VariableRuleGeneratable value) {
        int selected = 0;
        StringBuilder sb = new StringBuilder();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            selected = value.result();
            if (selected == 0) {
                sb.append("영");
            } else if (selected == 1) {
                sb.append("일");
            } else if (selected == 2) {
                sb.append("이");
            } else if (selected == 3) {
                sb.append("삼");
            } else if (selected == 4) {
                sb.append("사");
            } else if (selected == 5) {
                sb.append("오");
            } else if (selected == 6) {
                sb.append("육");
            } else if (selected == 7) {
                sb.append("칠");
            } else if (selected == 8) {
                sb.append("팔");
            } else if (selected == 9) {
                sb.append("구");
            }
            else if (selected == 10) {
                sb.append("일");
            } else if (selected == 11) {
                sb.append("이");
            } else if (selected == 12) {
                sb.append("삼");
            } else if (selected == 13) {
                sb.append("사");
            } else if (selected == 14) {
                sb.append("오");
            } else if (selected == 15) {
                sb.append("육");
            } else if (selected == 16) {
                sb.append("칠");
            } else if (selected == 17) {
                sb.append("팔");
            } else if (selected == 18) {
                sb.append("구");
            }
            else if (selected == 19) {
                sb.append("일");
            } else if (selected == 20) {
                sb.append("이");
            } else if (selected == 21) {
                sb.append("삼");
            } else if (selected == 22) {
                sb.append("사");
            } else if (selected == 23) {
                sb.append("오");
            } else if (selected == 24) {
                sb.append("육");
            } else if (selected == 25) {
                sb.append("칠");
            } else if (selected == 26) {
                sb.append("팔");
            } else if (selected == 27) {
                sb.append("구");
            }
            else if (selected == 28) {
                sb.append("일");
            } else if (selected == 29) {
                sb.append("이");
            } else if (selected == 30) {
                sb.append("삼");
            } else if (selected == 31) {
                sb.append("사");
            } else if (selected == 32) {
                sb.append("오");
            } else if (selected == 33) {
                sb.append("육");
            } else if (selected == 34) {
                sb.append("칠");
            } else if (selected == 35) {
                sb.append("팔");
            } else if (selected == 36) {
                sb.append("구");
            }else {
                sb.append("무");
            }
        }
        long resultTime = System.currentTimeMillis() - currentTime;
        System.out.println("if 연산 결과 : " + resultTime + "ms");
    } // end of ifResult

    public void switchResult(int repeat, VariableRuleGeneratable value) {
        int selected = 0;
        StringBuilder sb = new StringBuilder();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            selected = value.result();
            switch (selected) {
                case 0:
                    sb.append("영");
                    break;
                case 1:
                    sb.append("일");
                    break;
                case 2:
                    sb.append("이");
                    break;
                case 3:
                    sb.append("삼");
                    break;
                case 4:
                    sb.append("사");
                    break;
                case 5:
                    sb.append("오");
                    break;
                case 6:
                    sb.append("육");
                    break;
                case 7:
                    sb.append("칠");
                    break;
                case 8:
                    sb.append("팔");
                    break;
                case 9:
                    sb.append("구");
                    break;
                case 10:
                    sb.append("일");
                    break;
                case 11:
                    sb.append("이");
                    break;
                case 12:
                    sb.append("삼");
                    break;
                case 13:
                    sb.append("사");
                    break;
                case 14:
                    sb.append("오");
                    break;
                case 15:
                    sb.append("육");
                    break;
                case 16:
                    sb.append("칠");
                    break;
                case 17:
                    sb.append("팔");
                    break;
                case 18:
                    sb.append("구");
                    break;
                case 19:
                    sb.append("일");
                    break;
                case 20:
                    sb.append("이");
                    break;
                case 21:
                    sb.append("삼");
                    break;
                case 22:
                    sb.append("사");
                    break;
                case 23:
                    sb.append("오");
                    break;
                case 24:
                    sb.append("육");
                    break;
                case 25:
                    sb.append("칠");
                    break;
                case 26:
                    sb.append("팔");
                    break;
                case 27:
                    sb.append("구");
                    break;
                case 28:
                    sb.append("일");
                    break;
                case 29:
                    sb.append("이");
                    break;
                case 30:
                    sb.append("삼");
                    break;
                case 31:
                    sb.append("사");
                    break;
                case 32:
                    sb.append("오");
                    break;
                case 33:
                    sb.append("육");
                    break;
                case 34:
                    sb.append("칠");
                    break;
                case 35:
                    sb.append("팔");
                    break;
                case 36:
                    sb.append("구");
                    break;
                default:
                    sb.append("무");
            }
        }
        long resultTime = System.currentTimeMillis() - currentTime;
        System.out.println("switch 연산 결과 : " + resultTime + "ms");
    } // end of switchResult

    public void smallIfResult(int repeat, VariableRuleGeneratable value) {
        int selected = 0;
        StringBuilder sb = new StringBuilder();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            selected = value.result();
            if (selected == 0) {
                sb.append("영");
            } else if (selected == 1) {
                sb.append("일");
            } else if (selected == 2) {
                sb.append("이");
                // 중간 생략
            } else if (selected == 99) {
                sb.append("구");
            } else {
                sb.append("무");
            }
        }
        long resultTime = System.currentTimeMillis() - currentTime;
        System.out.println("if 연산 결과 : " + resultTime + "ms");
    } // end of bigIfResult

    public void smallSwitchResult(int repeat, VariableRuleGeneratable value) {
        int selected = 0;
        StringBuilder sb = new StringBuilder();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            selected = value.result();
            switch (selected) {
                case 0:
                    sb.append("영");
                    break;
                case 1:
                    sb.append("일");
                    break;
                case 2:
                    sb.append("이");
                    break;
                // 중간 생략
                case 99:
                    sb.append("구");
                    break;
                default:
                    sb.append("무");
            }
        }
        long resultTime = System.currentTimeMillis() - currentTime;
        System.out.println("switch 연산 결과 : " + resultTime + "ms");
    } // end of bigSwitchResult



}
