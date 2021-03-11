package leetcode.easy;


import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountOfMatchesInTournamentTest {

    @Test
    public void solution1(){


        //1. given 테스트 준비 - 상황주기
        int expectResult, ActualResult, inputNumberOfTeams;
        expectResult = 2;
        inputNumberOfTeams = 3;
        CountOfMatchesInTournament countOfMatchesInTournament = new CountOfMatchesInTournament();

        //2. when 테스트 시작 - 발생
        ActualResult = countOfMatchesInTournament.numberOfMatchesSolution2(inputNumberOfTeams);

        //3. then 테스트 단언 - 예상 결과값 wait
        assertEquals(expectResult, ActualResult);

    }

}
