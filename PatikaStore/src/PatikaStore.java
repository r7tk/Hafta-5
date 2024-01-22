import java.util.Scanner;
import java.util.TreeSet;

public class PatikaStore {
    Scanner scanner = new Scanner(System.in);

    public void NoteBookDB(){
        TreeSet<Notebook> notebookTreeSet = new TreeSet<>();
        
    }


    boolean isRunning = true;
    public void run(){
        while(isRunning){
            System.out.println("Patika Store Yönetim Paneli");
            System.out.println("1 - Notebook işlemleri ");
            System.out.println("2 - Cep telefon İşlemleri");
            System.out.println("3 - Markaları Listele");
            System.out.println("0 - Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                case 3:
                    Marka marka = new Marka();
                    marka.printMarka();
                    break;
                case 0:
                    isRunning=false;
                    break;
                default:
                    System.out.println("Hatalı Değer Girdiniz.");
            }
        }
    }
}
