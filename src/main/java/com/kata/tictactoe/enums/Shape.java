package com.kata.tictactoe.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Shape {
    CIRCLE("O"),
    CROSS("X"),
    BLANK(" ");

    private final String value;
}
