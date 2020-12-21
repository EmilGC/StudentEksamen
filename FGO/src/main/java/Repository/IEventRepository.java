package Repository;

import Model.Event;

import java.util.List;

public interface IEventRepository {
    void create(Event e);
    Event read(int id);
    List<Event> readAll();
}
