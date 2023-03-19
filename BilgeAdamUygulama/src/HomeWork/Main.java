package HomeWork;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        int toplamKarakterSayisi= 0;
        int toplamKelimeSayisi =0;
        int toplamSatirSayisi =0;
        HashMap<String,Integer> map =new HashMap<>();


        try(BufferedReader okuyucu =new BufferedReader(new FileReader("istiklal.txt"))) {

            String satir=okuyucu.readLine();
            while (satir !=null){
                toplamSatirSayisi++;

                String [] kelimeler =satir.toLowerCase().split(" ");
                toplamKelimeSayisi += kelimeler.length;

                for (String kelime : kelimeler){
                    if (map.containsKey(kelime)){
                        map.put(kelime,map.get(kelime)+1);

                    }else
                    {
                        map.put(kelime,1);

                    }

                    toplamKarakterSayisi=toplamKarakterSayisi+kelime.length();

                }


                satir= okuyucu.readLine();
            }
            System.out.println("Toplam satır sayısı "+toplamSatirSayisi);
            System.out.println("Toplam kelime sayısı "+toplamKelimeSayisi);
            System.out.println("Toplam karakter sayısı "+toplamKarakterSayisi);

            int tekrarSayisi =0;
            String enCokTekrarEdenKelime=null;

            for (Map.Entry<String,Integer> temp : map.entrySet()){
                if (temp.getValue() > tekrarSayisi && !temp.getKey().equals("")){
                    enCokTekrarEdenKelime = temp.getKey();
                    tekrarSayisi=temp.getValue();

                }
            }
            System.out.println("En çok tekrar eden kelime :  " +enCokTekrarEdenKelime+ " --> tekrar sayısı : " +tekrarSayisi);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
