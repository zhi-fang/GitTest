package login;

import java.util.HashMap;

public class AxiosResult<T> {

    private int status;

    private String message;

    private  T data;

    /**
     * 成功并且携带数据
     * @param v
     * @param <V>
     * @return
     */
    public static <V> AxiosResult<V> success(V v){

        AxiosResult<V> axiosResult = new AxiosResult<>();

        axiosResult.setCode(AxiosStatus.OK.getStatus()) ;

        axiosResult.setMessage(AxiosStatus.OK.getCode());

        axiosResult.setData(v);

        return axiosResult;
    }


    public static  AxiosResult success(){

        AxiosResult axiosResult = new AxiosResult<>();

        axiosResult.setCode(AxiosStatus.OK.getStatus()) ;

        axiosResult.setMessage(AxiosStatus.OK.getCode());

        return axiosResult;
    }

    public int getCode() {
        return status;
    }

    private void setCode(int code) {
        this.status = code;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    private void setData(T data) {
        this.data = data;
    }

    private AxiosResult() {
    }
}
