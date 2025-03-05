package StatePattern;

public class ToTruong implements PositionState{
    @Override
    public double getAllowance() {
        return 1000;
    }

    @Override
    public ChucVu getChucVu() {
        return ChucVu.TO_TRUONG;
    }
}
