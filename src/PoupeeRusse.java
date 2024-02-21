public class PoupeeRusse extends Poupee {


    private String name;
    private String color;
    private Poupee poupee;
    public PoupeeRusse(String name, String color, int taille){
        super(taille);
        this.name=name;
        this.color=color;
        this.poupee=poupee;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Poupee getPoupee() {
        return poupee;
    }

    public void setPoupee(Poupee poupee) {
        this.poupee = poupee;
    }
    public void ouvrir(){
        if(isOuverte()){
            System.out.println("La poupé est déjà ouverte");
        }
        else {
            System.out.println("Ouverture de la poupé ");
            setOuverte(true);
        }
    }
    public void fermer(){
        if(!isOuverte()){
            System.out.println("La poupé est déjà fermée");
        }
        else if(poupee!= null){
            System.out.println("Veuillez d'abord sortir le contenu de la poupee");
        }
        else {
            System.out.println("l'emplacement de la poupee du taille" + getTaille() + "dans la poupee de la taille" + poupee.getTaille());
        }
    }
    public void placerDans(Poupee p){
        if(p.getTaille() <= getTaille()){
            System.out.println("La poupée ne peut pas être placée dans une poupée de taille inférieure ou égale. ");
        }
        else if (!p.isOuverte()){
            System.out.println("Veuillez d'abord ouvrir la poupée de destination.");
        }else {
            System.out.println("Placement de la poupée russe de taille " + getTaille()+ " dans une poupée de taille " + p.getTaille());
            setPoupee(p);
        }
    }
    public void sortirDans(Poupee p) {
        if (p != getPoupee()) {
            System.out.println("La poupée n'est pas contenue dans cette poupée.");
        }
        else if(!isOuverte()) {
            System.out.println("La poupée est ferme");
        }
        else {
            System.out.println("Sortie de la poupée russe de taille " + getTaille() + " de la poupée de taille " + p.getTaille());
            setPoupee(null);
        }
    }
}
