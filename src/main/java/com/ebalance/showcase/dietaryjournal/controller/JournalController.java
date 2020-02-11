package com.ebalance.showcase.dietaryjournal.controller;

import com.ebalance.showcase.dietaryjournal.model.JournalEntity;
import com.ebalance.showcase.dietaryjournal.repository.JournalDAO;
import com.ebalance.showcase.dietaryjournal.service.JournalService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Path("/meals")
public class JournalController {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JournalEntity> getMeals(){
        List<JournalEntity> listOfMeals = JournalService.getAllJournalEntities();

        System.out.println(Arrays.toString(listOfMeals.toArray()));//========================================

        return listOfMeals;
    }

    @GET
    @Path("/{mealId}")
    @Produces({MediaType.APPLICATION_JSON})
    public JournalEntity getMeal(@PathParam("mealId") Integer mealId){
        return JournalService.getJournalEntity(mealId);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public JournalEntity addMeal(JournalEntity meal){
        return JournalService.putJournalEntity(meal);
    }

    @DELETE
    @Path("/{mealId}")
    @Produces({MediaType.APPLICATION_JSON})
    public void deleteMeal(@PathParam("mealId") Integer mealId){
        JournalService.deleteJournalEntity(mealId);
    }




}
