package LLD_Sytem_Design.BookMyShowLLD;

public class BookMyShowDemo {

    MovieController movieController;
    TheatreController theatreController;

    /**
     * Concurrency: Optimistic locking
     * Timer: Redis cache timer based locking for 10min
     */

    public BookMyShowDemo() {
        this.movieController = new MovieController();
        this.theatreController = new TheatreController();
    }

    public void initialize(){
        //initializing the movies in the theatres with show times
    }

//    public void createBooking(String city, String movieName){
////        List<Movie> movies = movieController.getMoviesByCity(city);
//
//        Movie interestedMovie = null;
//        for(Movie movie : movies){
//            if(movie.name.equals(movieName)){
//                interestedMovie = movie;
//            }
//        }
//
//        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(interestedMovie, city);
//
//
//    }

    public static void main(String[] args) {
        BookMyShowDemo bookMyShowDemo = new BookMyShowDemo();

        bookMyShowDemo.initialize();

//        bookMyShowDemo.createBooking("Bangalore", "DHURRANDAR" );
//        bookMyShowDemo.createBooking("Bangalore", "DHURRANDAR-2" );

    }


}
