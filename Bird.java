public class Bird {
    String family;
    String specie;
    String commomName;
    double height;
    int year;

    @Override
    public String toString() {        
        return String.format("%s %s %s %f %d", family, specie, commomName, height, year);
    }
}