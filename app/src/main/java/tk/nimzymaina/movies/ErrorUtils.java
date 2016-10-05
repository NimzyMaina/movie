package tk.nimzymaina.movies;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import tk.nimzymaina.movies.model.APIError;
import tk.nimzymaina.movies.rest.ApiClient;

/**
 * Created by user on 7/5/2016.
 */
public class ErrorUtils {

    public static APIError parseError(Response<?> response) {
        Converter<ResponseBody, APIError> converter = ApiClient.getClient().responseBodyConverter(APIError.class, new Annotation[0]);

        APIError error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new APIError();
        }

        return error;
    }
}
