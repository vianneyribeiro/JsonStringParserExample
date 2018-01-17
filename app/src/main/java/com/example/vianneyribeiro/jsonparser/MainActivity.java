package com.example.vianneyribeiro.jsonparser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public static final String jsonPlanetas="{\"planetas\": " +"  [" +"     { \"nome\": \"Mercurio\"," +"       \"posicao\":1," +"       \"habitavel\":false" +"     }," +"     { \"nome\": \"Terra\"," +"       \"posicao\":3," +"       \"habitavel\":true" +"     }" +"  ]" +"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            JSONObject planetasObj = new JSONObject(jsonPlanetas);
            JSONArray planetasArray = planetasObj.getJSONArray("planetas");

            for (int i=0; i< planetasArray.length(); i++){
                String nome, posicao, habitavel;
            JSONObject planetas =  planetasArray.getJSONObject(i);
            String plan = planetas.getString("nome");
            int pos = planetas.getInt("posicao");
            boolean hab = planetas.getBoolean("habitavel");

            Log.e("PLANETA",plan );
            Log.e("POSICAO", Integer.toString(pos));
         Log.e("HABITAVEL", Boolean.toString(hab));

         PlanetaClasse planetaClasse = new PlanetaClasse(plan, pos, hab);

         Log.e("CLasse Planeta", planetaClasse.getNome());
         Log.e("Classe Posicao", String.valueOf(planetaClasse.getPosicao()));
         Log.e("Classe Habitabel", String.valueOf(planetaClasse.isHabitavel()));



            }




        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
