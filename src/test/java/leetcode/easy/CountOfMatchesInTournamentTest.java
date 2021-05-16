package leetcode.easy;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.when;
import static org.mockito.BDDMockito.then;




@DisplayName("릿코드 토너먼트의 경기 수")
public class CountOfMatchesInTournamentTest {

    @Test
    @DisplayName("Input 3개의 팀, 토너먼트 수 2번")
    public void solution1(){

        //1. given 테스트 준비 - 상황주기
        int expectResult, ActualResult, inputNumberOfTeams;
        expectResult = 2;
        inputNumberOfTeams = 3;
        CountOfMatchesInTournament countOfMatchesInTournament = new CountOfMatchesInTournament();

        //2. when 테스트 시작 - 발생
        ActualResult = countOfMatchesInTournament.numberOfMatchesSolution2(inputNumberOfTeams);

        //3. then 테스트 단언 - 예상 결과값 wait
        Assertions.assertEquals(expectResult, ActualResult);

    }


    @Test
    @DisplayName("Input 3개의 팀, 토너먼트 수 2번")
    public void solution2(){


        //1. given 테스트 준비 - 상황주기
        int expectResult, ActualResult, inputNumberOfTeams;
        expectResult = 2;
        inputNumberOfTeams = 3;
        CountOfMatchesInTournament countOfMatchesInTournament = new CountOfMatchesInTournament();

        //2. when 테스트 시작 - 발생
        ActualResult = countOfMatchesInTournament.numberOfMatchesSolution1(inputNumberOfTeams);

        //3. then 테스트 단언 - 예상 결과값 wait
        Assertions.assertEquals(expectResult, ActualResult);

    }

}
