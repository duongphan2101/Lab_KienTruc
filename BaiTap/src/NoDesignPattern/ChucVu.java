package NoDesignPattern;

public enum ChucVu {
    TIEN_SI(500),
    TO_TRUONG(300),
    TRUONG_PHONG(1000);
    private final double allowance; // phụ cấp

    ChucVu(double allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }
}

