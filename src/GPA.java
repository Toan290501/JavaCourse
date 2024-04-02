public class GPA extends Student {
    private Double score;
    private Integer activeScore;
    private Boolean payFee;

    public GPA(String name, String ID, int old, String aClass, String phoneNumber, Double score, Integer activeScore, Boolean payFee) {
        super(name, ID, old, aClass, phoneNumber);
        this.score = score;
        this.activeScore = activeScore;
        this.payFee = payFee;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getActiveScore() {
        return activeScore;
    }

    public void setActiveScore(Integer activeScore) {
        this.activeScore = activeScore;
    }

    public Boolean getPayFee() {
        return payFee;
    }

    public void setPayFee(Boolean payFee) {
        this.payFee = payFee;
    }

    @Override
    public String toString() {
        return "GPA{" +
                "score=" + score +
                ", activeScore=" + activeScore +
                ", payFee=" + payFee + super.toString()+
                '}';
    }

    public GPA(){
        super();
    }
}
