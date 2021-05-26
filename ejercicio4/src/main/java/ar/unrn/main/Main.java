package ar.unrn.main;

import ar.unrn.model.Item;
import ar.unrn.services.RestCall;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        RestCall rest = new RestCall(
                "https://jsonplaceholder.typicode.com/posts");
        final String json = rest.run();



    }


}
