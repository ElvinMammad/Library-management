class DVD extends Item {
    private int duration;

    public DVD(int id, String title, int duration) {
        super(id, title);
        this.duration = duration;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    @Override
    public int getLoanDays() { return 3; }

    @Override
    public String toString() {
        return "DVD   " + super.toString() + " | Uzunluq: " + duration + " deq";
    }
}