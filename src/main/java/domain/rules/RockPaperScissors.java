package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        //Met dit if statement heb je 5 cases ipv 9 cases
        if ((mine == Move.PAPER && theirs == Move.SCISSORS) || (mine == Move.SCISSORS && theirs == Move.ROCK) || (mine == Move.ROCK && theirs == Move.PAPER)) {
            return Result.LOSE;
        }
        else if (mine == theirs) {
            return Result.DRAW;
        }
        else {
            return Result.WIN;
        }
    }
}
