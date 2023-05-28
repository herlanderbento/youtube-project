public class Visualization {
    private User spectator;
    private Video film;

    public Visualization(User spectator, Video film){
        this.spectator = spectator;
        this.film = film;
        this.spectator.setTotal_Assisted(this.spectator.getTotal_Assisted() + 1);
        this.film.setViews(this.film.getViews() + 1);
    }

    public User getSpectator(){
        return this.spectator;
    }

    public void setSpectator(User spectator){
        this.spectator = spectator;
    }

    public Video getFilm(){
        return this.film;
    }

    public void setFilm(Video film){
        this.film = film;
    }

    public void evaluate(){
        evaluates(5);
    }

    public void evaluate(int note){
        evaluates(note);
    }

    public void evaluate(float percentage){
        int total = 0;
        if (percentage <= 20){
            total = 3;
        }else if (percentage <= 50){
            total = 5;
        }else if (percentage <= 90){
            total = 8;
        }else {
            total = 10;
        }

        evaluates(total);
    }

    private void evaluates(int total){
        this.film.setEvaluation(total);
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "spectator=" + spectator +
                ", film=" + film +
                '}';
    }
}
