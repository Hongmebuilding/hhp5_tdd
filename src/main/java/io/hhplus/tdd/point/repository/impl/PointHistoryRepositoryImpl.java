package io.hhplus.tdd.point.repository.impl;

import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.point.aggregate.entity.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import io.hhplus.tdd.point.repository.PointHistoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PointHistoryRepositoryImpl implements PointHistoryRepository {
    private final PointHistoryTable pointHistoryTable;

    @Override
    public PointHistory insert(long userId, long amount, TransactionType type, long updateMillis) {
        return pointHistoryTable.insert(userId, amount, type, updateMillis);
    }

    @Override
    public List<PointHistory> selectAllByUserId(long userId) {
        return pointHistoryTable.selectAllByUserId(userId);
    }
}
