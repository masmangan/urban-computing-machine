public class BirdApp {

    public static void main(String[] args) {
        System.out.println("Birds!\n");

        //Tyrannidae;Pitangus sulphuratus;bem-te-vi;25;1952 
        Bird b = new Bird();
        b.family = "Tyrannidae";
        b.specie = "Pitangus sulphuratus";
        b.commomName = "bem-te-vi";
        b.height = 25;
        b.year = 1952;  
        
        System.out.println(b);
    }
}

