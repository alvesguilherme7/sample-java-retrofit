package eti.policarto.app;

import eti.policarto.api.interfaces.ViaCep;
import eti.policarto.api.pojos.CepPojo;
import eti.policarto.api.service.HttpBuilder;
import retrofit2.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ViaCep api = new HttpBuilder().getAPI();
        Response<CepPojo> execute = api.getCEP("32410103").execute();
        if(execute.isSuccessful() && execute.body() != null)
            System.out.println(execute.body().toString());
    }
}
