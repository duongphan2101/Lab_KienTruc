package StatePattern;

public class TienSi implements PositionState{
    @Override
    public double getAllowance() {
        return 3000;
    }

    @Override
    public ChucVu getChucVu() {
        return ChucVu.TIEN_SI;
    }
}
