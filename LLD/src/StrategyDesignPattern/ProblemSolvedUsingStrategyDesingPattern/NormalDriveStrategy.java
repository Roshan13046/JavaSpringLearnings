package StrategyDesignPattern.ProblemSolvedUsingStrategyDesingPattern;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Speed Drive");
    }
}
