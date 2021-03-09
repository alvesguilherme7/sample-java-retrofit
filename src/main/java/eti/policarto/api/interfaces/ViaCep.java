package eti.policarto.api.interfaces;

import eti.policarto.api.pojos.CepPojo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCep {

    @GET("ws/{cep}/json/")
    Call<CepPojo> getCEP(@Path("cep") String cep);
}
