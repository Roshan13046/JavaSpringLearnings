package LLD_Sytem_Design.BookMyShowLLD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Show {

    int showId;
    Movie movie;
    Screen screen;
    Date startTime, endTime;
    List<Integer> bookedSeatIds = new ArrayList<>();
}
