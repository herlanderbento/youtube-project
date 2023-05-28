public class Video  implements  IVideoActions{
    private  String title;
    private int evaluation;
    private int views;
    private int liked;
    private boolean playing;

    public Video(String title){
        this.title = title;
        this.evaluation = 1;
        this.views = 0;
        this.liked = 0;
        this.playing = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        int newEvaluation;
        newEvaluation = (int) ((this.evaluation + evaluation)/ this.views);
        this.evaluation = newEvaluation;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void play() {
        this.playing = true;
    }

    @Override
    public void stop() {
        this.playing = false;
    }

    @Override
    public void like() {
        this.liked ++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", evaluation=" + evaluation +
                ", views=" + views +
                ", liked=" + liked +
                ", playing=" + playing +
                '}';
    }
}
