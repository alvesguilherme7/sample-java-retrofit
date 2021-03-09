package eti.policarto.api.service;

import eti.policarto.api.interfaces.ViaCep;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpBuilder {

    private final Retrofit retrofit;

    public HttpBuilder() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public ViaCep getAPI() {
        return this.retrofit.create(ViaCep.class);
    }
}
