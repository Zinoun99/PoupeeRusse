public abstract class Poupee {
    public int taille;
    public boolean ouvert;

    public Poupee(int taille){
        this.taille=taille;
        this.ouvert=false;
    }

    public void ouvrir(){
        this.ouvert=true;
    }

    public void fermer(){
        this.ouvert=false;
    }

    public abstract void placeDans(Poupee p);
    public abstract void sortirDans(Poupee p);
    public int getTaille(){
        return taille;
    }

    public boolean isOuvert(){
        return ouvert;
    }
}
