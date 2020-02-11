package com.ebalance.showcase.dietaryjournal.service;

import com.ebalance.showcase.dietaryjournal.model.JournalEntity;
import com.ebalance.showcase.dietaryjournal.repository.JournalDAO;

import java.util.*;

public class JournalService {

    public static JournalEntity getJournalEntity(Integer mealId){
        return JournalDAO.journalMap.get(mealId);
    }

    public static JournalEntity putJournalEntity(JournalEntity meal){
        JournalDAO.journalMap.put(meal.getMealId(),meal);
        return meal;
    }

    public static void deleteJournalEntity(Integer mealId){
        JournalDAO.journalMap.remove(mealId);
    }

    public static List<JournalEntity> getAllJournalEntities(){
        Collection<JournalEntity> journalEntityCollection = JournalDAO.journalMap.values();
        List<JournalEntity> journalEntityList = new ArrayList<>();
        journalEntityList.addAll(journalEntityCollection);
        return journalEntityList;
    }


}
