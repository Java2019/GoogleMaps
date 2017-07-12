package com.nemo.googlemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final LatLng TutorialsPoint = new LatLng(21 , 57);
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            if (googleMap == null){
                googleMap = ((MapFragment) getFragmentManager().
                        findFragmentById(R.id.map)).getMapAsync();
            }
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            Marker TP = googleMap
                    .addMarker(new MarkerOptions()
                    .position(TutorialsPoint)
                    .title("TutorialsPoint"));
        }catch (Exception e){

        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
