package pbo_3_inherite;

public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim boynyutEsport = new Tim("Boynyut Esport");
        
        //Deklarasi Member
        Member orang_1 = new Member("Reza", 20);
        Member orang_2 = new Member("Rendy", 23);
        Member orang_3 = new Member("Konteng", 22);
        
        //Deklarasi Trainee
        Member orang_4 = new Trainee("Mbepy", 26, 8);
        Member orang_5 = new Trainee("Ferdy", 21, 10);
        Member orang_6 = new Trainee("Ulum", 30, 12);
        
        //Menambahkan data pada ArrayList
        boynyutEsport.addMember(orang_1);
        boynyutEsport.addMember(orang_2);
        boynyutEsport.addMember(orang_3);
        boynyutEsport.addMember(orang_4);
        boynyutEsport.addMember(orang_5);
        boynyutEsport.addMember(orang_6);
        
        //Output
        boynyutEsport.displayFullMember();
        boynyutEsport.displayTrainee();
    }
    
}
