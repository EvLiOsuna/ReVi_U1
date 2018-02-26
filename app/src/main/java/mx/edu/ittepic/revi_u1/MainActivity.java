package mx.edu.ittepic.revi_u1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.SortedList;
import android.support.v7.util.SortedList.Callback;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>listDatos1;

    ArrayList<String>listDatos2;

    ArrayList<String>listDatos3;

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyclerview);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos1=new ArrayList<String>();

            listDatos1.add("ARANDA PATRON NOMAR JAZIEL");
        listDatos1.add("CARDENAS RAMOS FRANCISCO EMANUEL");
                listDatos1.add("CASTILLO CORRALES VICTOR EMMANUEL");
                listDatos1.add("CERVANTES JIMÉNEZ JOSÉ MIGUEL");
                listDatos1.add( "CORDERO RIVERA SELVA YAZMIN");
                listDatos1.add("CORDERO VILLA OSCAR ALBERTO");
                listDatos1.add( "ESPINOSA ABANDO DENISSE YANETH");
                listDatos1.add( "FIGUEROA CUETO JUAN RAMON");
                listDatos1.add( "GALLEGOS GODINEZ FRANCISCO JAVIER");
                listDatos1.add( "GIL LLANOS JUAN PEDRO");
                listDatos1.add(  "GONZALEZ ARELLANO ERNESTO");
                listDatos1.add("GUTIERREZ ESPARZA BRAYAN JESUS");
                listDatos1.add("GUTIÉRREZ ROJAS BRYAN");
                listDatos1.add("LOPEZ ALVARADO MISSAEL");
                listDatos1.add(  "MARTINEZ BAÑUELOS ERIKA LIZBETH");
                listDatos1.add(  "MENDEZ SANTANA KEVIN ALEJANDRO");
                listDatos1.add( "MONROY SALCEDO JOSE DE JESUS");
                listDatos1.add( "PADILLA SIMÓN BRIAN EFRÉN");
                listDatos1.add( "PARRA DOMINGUEZ DYLAN SALVADOR");
                listDatos1.add( "PEREZ ARAIZA FLOR MARIELA");
                listDatos1.add( "PUGA FLORES CARLOS");
                listDatos1.add("REYES GODINEZ CARLA GUADALUPE");
                listDatos1.add("REYES GUERRERO GUILLERMO GUADALUPE");
                listDatos1.add( "RICO ESPARZA HENRY");
                listDatos1.add(  "RIVERA RAMIREZ DAVID");
                listDatos1.add(  "SANCHEZ CARRILLO BETSY DEL CARMEN");
                listDatos1.add(  "SILVA CAMACHO EDUARDO LUIS");
                listDatos1.add(  "TORRES CUETO JESUS MANUEL");
                listDatos1.add(  "VALDEZ LOPEZ HOLLIVER EDUARDO");
                listDatos1.add(  "VALENZUELA MIRAMONTES JOSE PABLO");
                listDatos1.add(  "ZAMORANO ALCALÁ GUILLERMO");


        listDatos2 = new ArrayList<String>();
        for(int i=0;i<=30;i++){
            listDatos2.add("No.Control "+i);
        }
        listDatos3=new ArrayList<String>();
        for(int i=0;i<=30;i++){
            listDatos3.add("Carrera "+i+"\n\n");
        }


        AdapterDato adapter = new AdapterDato(listDatos1, listDatos2, listDatos3);
        recycler.setAdapter(adapter);



    }


}