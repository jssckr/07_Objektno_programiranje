class Video{
    private int dolzina;
    private String naslov;
    private int stVseckov;
    private Komentar[] komentarji = new Komentar[10];
    //relacija s komentarji je združevanje
    public boolean predvajaj(){

    }
    public void dodajKomentar(Komentar komentar){
        for(int i = 0;i<komentarji.length;i++){
            if(komentarji[i] == null){
                komentarji[i] = komentar;
                break;
            }
        }
    }
}