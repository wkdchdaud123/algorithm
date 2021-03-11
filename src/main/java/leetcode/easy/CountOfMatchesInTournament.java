package leetcode.easy;

/**
 * @url https://leetcode.com/problems/count-of-matches-in-tournament/
 * @author jang.cm
 * @since 1.0
 */

public class CountOfMatchesInTournament {

    public int numberOfMatchesSolution1(int n){

        return n-1;
    }

    public int numberOfMatchesSolution2(int n){

        if(n == 1) return 0;
        return n % 2 == 0 ? numberOfMatchesSolution2(n/2) + n/2: numberOfMatchesSolution2( ((n-1)/2) +1) + (n-1)/2 ;

    }

}
