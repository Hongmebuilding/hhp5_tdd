package io.hhplus.tdd.point.repository;

import io.hhplus.tdd.point.aggregate.entity.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PointHistoryRepository {
    PointHistory insert(long userId, long amount, TransactionType type, long updateMillis);
    List<PointHistory> selectAllByUserId(long userId);
}
