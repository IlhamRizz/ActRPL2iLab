package rpl2_pert2_50421834;

public class RPL2_Pert2_50421834 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(); 
        
        mahasiswa.setName("Ilham");
        mahasiswa.setNpm("50421834");
        mahasiswa.setClassNumber("4IA06");
        mahasiswa.setBirthYear(2003);
        mahasiswa.setAlamat("Jakarta Timur");
        
        System.out.println(mahasiswa.toString());
    }
    
}
