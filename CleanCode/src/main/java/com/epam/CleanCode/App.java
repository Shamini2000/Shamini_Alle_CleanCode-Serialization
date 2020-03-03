package com.epam.CleanCode;

public class App 
{
    public static void main( String[] args )
    {
        SimpleAndCompoundInterest simpleAndCompoundInterest = new SimpleAndCompoundInterest();
        simpleAndCompoundInterest.takeInput();
        HouseConstructionCost houseConstructionCost = new HouseConstructionCost();
        houseConstructionCost.constructionCost();
    }
}
