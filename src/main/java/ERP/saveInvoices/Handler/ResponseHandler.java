package ERP.saveInvoices.Handler;

import org.springframework.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

        public static final String STATUS_SUCCESS = "SUCCESS";

        public static Map<String, Object> success(String successMessage) {
            Map<String, Object> map = new HashMap<>();
            map.put("statusCode", HttpStatus.OK.value());
            map.put("status", STATUS_SUCCESS);
            map.put("data", successMessage);
            map.put("msg", successMessage);
            return map;
        }
}
