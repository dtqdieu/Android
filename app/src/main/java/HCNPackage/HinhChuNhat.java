package HCNPackage;

public class HinhChuNhat implements HCNInterface {
    float chieuDai;
    float chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public float dientichHCN() {
        return chieuDai*chieuRong;
    }

    @Override
    public float getChieuDai() {
        return chieuDai;
    }

    @Override
    public float getChieuRong() {
        return chieuRong;
    }

    public void setDaiRong(float chieuDai , float chieuRong) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }
}
