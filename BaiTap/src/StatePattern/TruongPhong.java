package StatePattern;

public class TruongPhong implements PositionState{
    @Override
    public double getAllowance() {
        return 5000;
    }

    @Override
    public ChucVu getChucVu() {
        return ChucVu.TRUONG_PHONG;
    }
}
