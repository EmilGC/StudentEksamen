package Model;

public class Event {
    private String eventTitle;
    private String eventStartDate;
    private String eventEndDate;
    private String eventRequirements;
    private boolean eventIsLottery;
    private String eventImageLink;
    private String eventDescription;


    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public String getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(String eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getEventRequirements() {
        return eventRequirements;
    }

    public void setEventRequirements(String eventRequirements) {
        this.eventRequirements = eventRequirements;
    }

    public boolean isEventIsLottery() {
        return eventIsLottery;
    }

    public void setEventIsLottery(boolean eventIsLottery) {
        this.eventIsLottery = eventIsLottery;
    }

    public String getEventImageLink() {
        return eventImageLink;
    }

    public void setEventImageLink(String eventImageLink) {
        this.eventImageLink = eventImageLink;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Event(String eventTitle, String eventStartDate, String eventEndDate, String eventRequirements, String eventImageLink, String eventDescription, boolean eventIsLottery) {
        this.eventTitle = eventTitle;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventRequirements = eventRequirements;
        this.eventImageLink = eventImageLink;
        this.eventDescription = eventDescription;
        this.eventIsLottery = eventIsLottery;

    }
    public Event(){}

    @Override
    public String toString(){
        return "Placeholder";
    }




}
