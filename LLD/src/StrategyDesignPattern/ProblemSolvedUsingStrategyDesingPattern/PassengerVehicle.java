package StrategyDesignPattern.ProblemSolvedUsingStrategyDesingPattern;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
