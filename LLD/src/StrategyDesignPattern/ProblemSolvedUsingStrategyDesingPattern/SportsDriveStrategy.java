package StrategyDesignPattern.ProblemSolvedUsingStrategyDesingPattern;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("High Speed Driving");
    }
}