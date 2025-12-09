package LLD_Sytem_Design.CompositeDesignPattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        FileSystem dhurandar = new File("Dhurandar");
        movieDirectory.add(dhurandar);

        Directory comedy = new Directory("Comedy movies");
        FileSystem bhagamBhag = new File("Bhagam Bhag");

        comedy.add(bhagamBhag);
        movieDirectory.add(comedy);

        movieDirectory.ls();
    }
}
