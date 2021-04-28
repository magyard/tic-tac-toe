package com.kata.tictactoe.domain;

import com.kata.tictactoe.enums.Shape;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Set;

import static com.kata.tictactoe.enums.Shape.BLANK;

@Getter
@Setter
@Component
public class Game {
    private Set<Player> players;
    private Player winner;
    private Shape[] state; //TODO: check for overwriting non-blank elements in the StepRegistry's logic AND IndexOufOfBoundsException

    public Game() {
        this.state = new Shape[] {BLANK, BLANK, BLANK, BLANK, BLANK, BLANK};
    }
}