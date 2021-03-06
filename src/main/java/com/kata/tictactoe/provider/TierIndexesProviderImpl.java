package com.kata.tictactoe.provider;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TierIndexesProviderImpl implements TierIndexesProvider{
    private final static List<Integer> FIRST_TIER_CANDIDATE_INDEXES = List.of(4);
    private final static List<Integer> SECOND_TIER_CANDIDATE_INDEXES = List.of(1, 3, 5, 7);

    @Override
    public List<Integer> getFirstTierCandidatePositions() {
        return FIRST_TIER_CANDIDATE_INDEXES;
    }

    @Override
    public List<Integer> getSecondTierCandidatePositions() {
        return SECOND_TIER_CANDIDATE_INDEXES;
    }
}
