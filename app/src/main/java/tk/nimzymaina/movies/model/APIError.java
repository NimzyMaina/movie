package tk.nimzymaina.movies.model;

/**
 * Created by user on 7/5/2016.
 */
public class APIError {

    private int status_code;
    private String status_message;

    public APIError() {
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }
}
