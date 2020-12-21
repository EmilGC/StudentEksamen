package Repository;

import Model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EventDBRepository implements IEventRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Event event){
        String sql = "INSERT INTO Events(eventTitle, eventStartDate, eventEndDate, eventRequirement, eventImageLink, eventDescription, eventIsLottery) VALUES(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                event.getEventTitle(), event.getEventStartDate(), event.getEventEndDate(), event.getEventRequirements(),
                event.getEventImageLink(), event.getEventDescription(), event.isEventIsLottery());
    }

    @Override
    public Event read(int id) {
        return null;
    }

    @Override
    public List<Event> readAll(){
        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM Events";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()){
            events.add(new Event(
                    sqlRowSet.getString("eventTitle"),
                    sqlRowSet.getString("eventStartDate"),
                    sqlRowSet.getString("eventEndDate"),
                    sqlRowSet.getString("eventRequirements"),
                    sqlRowSet.getString("eventImageLink"),
                    sqlRowSet.getString("eventDescription"),
                    sqlRowSet.getBoolean("eventIsLottery"))
            );
        }
         return events;
    }
}
