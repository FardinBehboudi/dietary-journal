package com.ebalance.showcase.dietaryjournal.repository;

import com.ebalance.showcase.dietaryjournal.model.JournalEntity;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class JournalDAO {

    public static final Map<Integer, JournalEntity> journalMap = new HashMap<>();

    static {
        initJournal();



    }

    private static void initJournal(){
        LocalDateTime rightNow = LocalDateTime.now();
        LocalDateTime aDateTime = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40);

        JournalEntity journalEntity1 = new JournalEntity(101,501,"Pasta",200,rightNow);
        JournalEntity journalEntity2 = new JournalEntity(102,501,"Pizza",400, rightNow);
        JournalEntity journalEntity3 = new JournalEntity(103,502,"Stake",100, LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40));
        JournalEntity journalEntity4 = new JournalEntity(104,501,"Panini",300, aDateTime);



        journalMap.put(journalEntity1.getMealId(),journalEntity1);
        journalMap.put(journalEntity2.getMealId(),journalEntity2);
        journalMap.put(journalEntity3.getMealId(),journalEntity3);
        journalMap.put(journalEntity4.getMealId(),journalEntity4);




    }
}
