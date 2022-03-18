package login;

public enum AxiosStatus {
    /**
     * 状态码
     */
    OK(20000,"成功"),
    ERROR(50000,"失败")
    ;
    private int status;

    private String code;

    AxiosStatus(int status, String code) {
        this.status = status;
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }
}
