public class ikan extends Hewan{
    @Override
    public void jenis(){
        System.out.println("ikan adalah hewan air");
    }

    @Override
    public void makanan(){
        System.out.println("ikan memakan pelet dan sisa-sisa makanan");
    }

    @Override
    public void bergerak() {
        System.out.println("ikan bergerak dengan berenang");
    }

    @Override
    public void suara() {
        System.out.println("ikan tidak bersuara kecuali ikan tertentu");
    }
}
