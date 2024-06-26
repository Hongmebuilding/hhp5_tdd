package io.hhplus.tdd.point.repository.impl;

import io.hhplus.tdd.database.UserPointTable;
import io.hhplus.tdd.point.aggregate.entity.UserPoint;
import io.hhplus.tdd.point.repository.UserPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserPointRepositoryImpl implements UserPointRepository {
    private final UserPointTable userPointTable;

    @Override
    public UserPoint selectById(Long id) {
        return userPointTable.selectById(id);
    }

    @Override
    public UserPoint insertOrUpdate(long id, long amount) {
        return userPointTable.insertOrUpdate(id, amount);
    }
}
