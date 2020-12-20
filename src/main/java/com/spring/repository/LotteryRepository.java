package com.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Lottery;

@Repository
public interface LotteryRepository extends JpaRepository<Lottery, String>
{
    Lottery findLotteryByDateAndId(Date date, Long id);

    List<Lottery> findAllByDate(Date date);
}
