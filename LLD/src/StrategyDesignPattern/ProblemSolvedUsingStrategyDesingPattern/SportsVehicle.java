package StrategyDesignPattern.ProblemSolvedUsingStrategyDesingPattern;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
