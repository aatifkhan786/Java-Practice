class Mad {
    private int sad;
    private String dad;
    public int getSad() {
        return sad;
    }
    public String getDad() {
        return dad;
    }
    public void setSad(int a) {
        sad = a;
    }
    public void setDad(String b) {
        dad = b;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Mad obj = new Mad();
        obj.setSad(5);           // Set the value of sad
        obj.setDad("Aatif");     // Set the value of dad

        // Print the values of sad and dad using getters
        System.out.println(obj.getSad() + " : " + obj.getDad());
    }
}
