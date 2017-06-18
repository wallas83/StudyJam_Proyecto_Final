package com.wilson.ruapuma;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Maps extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ImageButton detallellojeta;
    private ImageButton detalleChasqui;
    private ImageButton detalleCaja;
    private ImageButton detalleirpavi;
    private ImageButton detallekala;
    private ImageButton detalleVilla;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_maps_incallojeta);
        setContentView(R.layout.activity_incallojeta);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapllojeta);
        mapFragment.getMapAsync(this);

        detallellojeta = (ImageButton) findViewById(R.id.imgBtnDetalleIncallojeta);
        detallellojeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paginaDetalle();
            }
        });


    }

    private void paginaDetalle() {
        intent = new Intent(getApplicationContext(), Detalle.class);
        startActivity(intent);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;
        Intent i = getIntent();
        Bundle extra = i.getExtras();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        int dato=extra.getInt("dato");

        switch (dato){
            case 1:
                    LatLng incallojetaMap = new LatLng(-16.529027, -68.143003);

                    LatLng raulSalmon =new LatLng(-16.534212, -68.145900);
                    LatLng uejos = new LatLng(-16.532482, -68.142355);
                    LatLng finBuenos = new LatLng(-16.533191, -68.140461);
                LatLng centroSaludvergel = new LatLng(-16.533465, -68.137937);
                LatLng vergelito = new LatLng(-16.533960, -68.134637);
                LatLng tomilo = new LatLng(-16.532997, -68.131375);
                LatLng petunias = new LatLng(-16.529761, -68.128613);
                 LatLng acacias =new LatLng(-16.530826, -68.126049);
                LatLng laPaz = new LatLng(-16.526501, -68.126442);
                LatLng japonP = new LatLng(-16.525883, -68.123672);
                LatLng jardin = new LatLng(-16.523293, -68.121570);
                LatLng emaverde = new LatLng(-16.519901, -68.125477);
                LatLng trillizos = new LatLng(-16.516813, -68.121491);
                LatLng cuartoCent = new LatLng(-16.514242, -68.114465);
                LatLng umsa = new LatLng(-16.503939, -68.128423);
                LatLng camachoLLojeta = new LatLng(-16.500233, -68.132088);
                LatLng sim = new LatLng(-16.500614, -68.130010);
                mMap.addMarker(new MarkerOptions().position(incallojetaMap).title("R. Tupac Katari").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(raulSalmon).title("Raul Salmon").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(uejos).title("U.E Jos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(finBuenos).title("Final Buenos Aires").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(centroSaludvergel).title("Centro de Salud El Vergel").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(vergelito).title("Vergelito").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));

                mMap.addMarker(new MarkerOptions().position(tomilo).title("Tomilo").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(petunias).title("Petunias").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(acacias).title("Las acacias").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(laPaz).title("H. Nuestra Sra. de La Paz").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(japonP).title("U.E Boliviano Japon").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(jardin).title("R. cementerio jardin").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(emaverde).title("Emaverde").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(trillizos).title("Puentes Trillizos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(cuartoCent).title("IV Centenario - U.E. Amor de Dios").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(umsa).title("U.M.S.A").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(camachoLLojeta).title("Pza. Camacho").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                mMap.addMarker(new MarkerOptions().position(sim).title("Sim").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_incallojeta_parada)));
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(incallojetaMap,15));
                    mMap.setBuildingsEnabled(true);
                    Polyline llojeta = mMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(-16.529027, -68.143003),new LatLng(-16.5294283,-68.1434726),
                                new LatLng(-16.529582, -68.143701), new LatLng(-16.530050, -68.144482)
                                ,new LatLng(-16.530253, -68.145040), new LatLng(-16.530329, -68.145090),
                                new LatLng(-16.530386, -68.145099), new LatLng(-16.530507, -68.145064),
                                new LatLng(-16.530363, -68.144610), new LatLng(-16.530243, -68.144198),
                                new LatLng(-16.530238, -68.144059), new LatLng(-16.530329, -68.143951),
                                new LatLng(-16.530490, -68.143976), new LatLng(-16.530577, -68.144046),
                                new LatLng(-16.530774, -68.144418),new LatLng(-16.531041, -68.144894),
                                new LatLng(-16.531202, -68.145088), new LatLng(-16.531844, -68.145485),
                                new LatLng(-16.531759, -68.145433), new LatLng(-16.532098, -68.145693),
                                new LatLng(-16.532427, -68.145891), new LatLng(-16.533610, -68.145916),
                                new LatLng(-16.534015, -68.145922), new LatLng(-16.534212, -68.145900),
                                new LatLng(-16.534212, -68.145900), new LatLng(-16.534837, -68.145753),
                                new LatLng(-16.534923, -68.145638), new LatLng(-16.534936, -68.145531),
                                new LatLng(-16.534772, -68.145386), new LatLng(-16.534345, -68.145210),
                                new LatLng(-16.533297, -68.144488), new LatLng(-16.533165, -68.144022),
                                new LatLng(-16.533115, -68.143387), new LatLng(-16.532482, -68.142355),
                                new LatLng(-16.532438, -68.142191), new LatLng(-16.534052, -68.141658),
                                new LatLng(-16.534110, -68.141454), new LatLng(-16.533872, -68.141179),
                                new LatLng(-16.532849, -68.140578), new LatLng(-16.532919, -68.140429),
                                new LatLng(-16.533191, -68.140461), new LatLng(-16.533913, -68.140540),
                                new LatLng(-16.534029, -68.140119), new LatLng(-16.533003, -68.139412),
                                new LatLng(-16.532348, -68.139248), new LatLng(-16.532389, -68.138981),
                                new LatLng(-16.533704, -68.138426), new LatLng(-16.533696, -68.138040),
                                new LatLng(-16.533465, -68.137937), new LatLng(-16.532813, -68.137697),
                                new LatLng(-16.532885, -68.137313), new LatLng(-16.534304, -68.137297),
                                new LatLng(-16.534589, -68.136753), new LatLng(-16.534070, -68.136592),
                                new LatLng(-16.532499, -68.135318), new LatLng(-16.532661, -68.135082),
                                new LatLng(-16.533245, -68.135136), new LatLng(-16.533960, -68.134637),
                                new LatLng(-16.534503, -68.133910), new LatLng(-16.532737, -68.132177),
                                new LatLng(-16.532997, -68.131375), new LatLng(-16.533133, -68.130987),
                                new LatLng(-16.532956, -68.130649), new LatLng( -16.532203, -68.130389),
                                new LatLng(-16.531342, -68.129308), new LatLng(-16.530108, -68.129305),
                                new LatLng(-16.529761, -68.128613), new LatLng(-16.529449, -68.127460),
                                new LatLng(-16.529706, -68.127068), new LatLng(-16.530056, -68.126918),
                                new LatLng(-16.531450, -68.127712), new LatLng(-16.531990, -68.127656),
                                new LatLng(-16.532245, -68.127058), new LatLng(-16.530826, -68.126049),
                                new LatLng(-16.528995, -68.124981), new LatLng(-16.528536, -68.124902),
                                new LatLng(-16.527829, -68.125142), new LatLng(-16.526501, -68.126442),
                                new LatLng(-16.526208, -68.126595), new LatLng(-16.526025, -68.125970),
                                new LatLng(-16.526120, -68.125817), new LatLng(-16.528383, -68.124342),
                                new LatLng(-16.528280, -68.123822), new LatLng(-16.527722, -68.123688),
                                new LatLng(-16.525883, -68.123672), new LatLng(-16.525047, -68.123743),
                                new LatLng(-16.523712, -68.122083), new LatLng(-16.523740, -68.121750),
                                new LatLng(-16.523496, -68.121444), new LatLng(-16.523293, -68.121570),
                                new LatLng(-16.523293, -68.121570), new LatLng(-16.522931, -68.122018),
                                new LatLng(-16.522262, -68.122053), new LatLng(-16.521845, -68.122399),
                                new LatLng(-16.521269, -68.123966), new LatLng(-16.520878, -68.125479),
                                new LatLng(-16.520401, -68.125737), new LatLng(-16.520109, -68.125616),
                                new LatLng(-16.519901, -68.125477), new LatLng(-16.519636, -68.124664),
                                new LatLng(-16.519788, -68.124141), new LatLng(-16.519827, -68.123605),
                                new LatLng(-16.519423, -68.123216), new LatLng(-16.518973, -68.123280),
                                new LatLng(-16.518289, -68.123452), new LatLng(-16.518073, -68.123315),
                                new LatLng(-16.517510, -68.122266), new LatLng(-16.517348, -68.121799),
                                new LatLng(-16.516813, -68.121491), new LatLng(-16.516738, -68.121097),
                                new LatLng(-16.516537, -68.118501), new LatLng(-16.516169, -68.117275),
                                new LatLng(-16.515845, -68.116454), new LatLng(-16.515490, -68.115990),
                                new LatLng(-16.514292, -68.114568), new LatLng(-16.514242, -68.114465),
                                new LatLng(-16.514175, -68.114456), new LatLng(-16.514132, -68.114522),
                                new LatLng(-16.514218, -68.114601), new LatLng(-16.515013, -68.115599),
                                new LatLng(-16.515617, -68.116286), new LatLng(-16.515764, -68.116549),
                                new LatLng(-16.515983, -68.117048), new LatLng(-16.516418, -68.118437),
                                new LatLng(-16.515742, -68.118724), new LatLng(-16.514590, -68.118850),
                                new LatLng(-16.513644, -68.119137), new LatLng(-16.511985, -68.119724),
                                new LatLng(-16.511761, -68.119654), new LatLng(-16.511697, -68.119729),
                                new LatLng(-16.511584, -68.120040), new LatLng(-16.510463, -68.120947),
                                new LatLng(-16.508694, -68.122393), new LatLng(-16.508694, -68.122393),
                                new LatLng(-16.507059, -68.123303), new LatLng(-16.506380, -68.123893),
                                new LatLng(-16.505488, -68.125044), new LatLng(-16.504994, -68.125334),
                                new LatLng(-16.504140, -68.125710), new LatLng(-16.503970, -68.125753),
                                new LatLng(-16.503921, -68.125933), new LatLng(-16.503931, -68.126027),
                                new LatLng(-16.503527, -68.126459), new LatLng(-16.503301, -68.126832),
                                new LatLng(-16.503014, -68.127718), new LatLng(-16.502990, -68.128469),
                                new LatLng(-16.503172, -68.128580), new LatLng(-16.503939, -68.128423),
                                new LatLng(-16.504286, -68.128482), new LatLng(-16.504512, -68.128680),
                                new LatLng(-16.503422, -68.129369), new LatLng(-16.502905, -68.129750),
                                new LatLng(-16.502316, -68.130278), new LatLng(-16.501688, -68.131005),
                                new LatLng(-16.501068, -68.131815), new LatLng(-16.500675, -68.132244),
                                new LatLng(-16.500233, -68.132088), new LatLng(-16.499999, -68.131957),
                                new LatLng(-16.500637, -68.130621), new LatLng(-16.500694, -68.130203),
                                new LatLng(-16.500614, -68.130010)).color(Color.rgb(51,0,153)));
                break;
            case 2:
                LatLng cosmos = new LatLng(-16.485194, -68.093639);
                LatLng losGr =new LatLng(-16.488713, -68.097897);
                LatLng antenas = new LatLng(-16.490517, -68.100241);
                LatLng ergueta = new LatLng(-16.494765, -68.100713);
                LatLng samapa = new LatLng(-16.496043, -68.101913);
                LatLng circunvalacion = new LatLng(-16.498959, -68.101212);
                LatLng marzo = new LatLng(-16.499417, -68.104362);
                LatLng enero10 = new LatLng(-16.501576, -68.104308);
                LatLng antonio =new LatLng(-16.497311, -68.109018);
                LatLng judio = new LatLng(-16.495338, -68.111090);
                LatLng viejas = new LatLng(-16.493661, -68.114072);
                LatLng rafael = new LatLng(-16.493398, -68.116662);
                LatLng claveles = new LatLng(-16.494354, -68.118218);
                LatLng paraguay = new LatLng(-16.491535, -68.119592);
                LatLng buch = new LatLng(-16.493923, -68.121442);
                LatLng carrasco = new LatLng(-16.499176, -68.121178);
                LatLng romero = new LatLng(-16.501569, -68.123597);
                LatLng umsasalome = new LatLng(-16.503948, -68.128444);
                mMap.addMarker(new MarkerOptions().position(cosmos).title("Cosmos 85").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(losGr).title("Los Gr").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(antenas).title("Antenas Entel").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(ergueta).title("Plaza Ergueta").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(samapa).title("Samapa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(circunvalacion).title("Circunvalacion").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));

                mMap.addMarker(new MarkerOptions().position(marzo).title("23 de Marzo").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(enero10).title("M. 10 de Enero").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(antonio).title("Cruce Alto San Antonio").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(judio).title("Cementerio Jud").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(viejas).title("3 Viejas").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(rafael).title("Rafael Ballivian").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(claveles).title("Los Claveles").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(paraguay).title("Puentes Paraguay").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(buch).title("Buch").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(carrasco).title("Carrasco").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(romero).title("Diaz Romero-VillaLobos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));
                mMap.addMarker(new MarkerOptions().position(umsasalome).title("U.M.S.A").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_salome)));

                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cosmos,15));
                mMap.setBuildingsEnabled(true);
                Polyline salome = mMap.addPolyline(new PolylineOptions().add(new LatLng(-16.485194, -68.093639),
                        new LatLng(-16.485380, -68.094057), new LatLng(-16.485534, -68.094368),new LatLng(-16.485956, -68.094958),
                        new LatLng(-16.487180, -68.096052), new LatLng(-16.487468, -68.096234), new LatLng(-16.488713, -68.097897),
                        new LatLng(-16.490517, -68.100241), new LatLng(-16.490473, -68.101034), new LatLng(-16.490627, -68.101378),
                        new LatLng(-16.491491, -68.101721), new LatLng(-16.492149, -68.101549), new LatLng(-16.494392, -68.100680),
                        new LatLng(-16.494765, -68.100713), new LatLng(-16.494911, -68.100919), new LatLng(-16.495446, -68.102086),
                        new LatLng(-16.496043, -68.101913), new LatLng(-16.496991, -68.101801), new LatLng(-16.497330, -68.101700),
                        new LatLng(-16.497495, -68.101475), new LatLng(-16.497577, -68.101389), new LatLng(-16.498959, -68.101212),
                        new LatLng(-16.499166, -68.101182), new LatLng(-16.499361, -68.102328), new LatLng(-16.499402, -68.103143),
                        new LatLng(-16.499412, -68.103921), new LatLng(-16.499417, -68.104362), new LatLng(-16.500912, -68.104221),
                        new LatLng(-16.500933, -68.104469), new LatLng(-16.501576, -68.104308), new LatLng(-16.501921, -68.104222),
                        new LatLng(-16.501864, -68.105134), new LatLng(-16.502080, -68.105263), new LatLng(-16.502317, -68.105606),
                        new LatLng(-16.500666, -68.106657), new LatLng(-16.498084, -68.107714), new LatLng(-16.497626, -68.108213),
                        new LatLng(-16.497626, -68.108213), new LatLng(-16.497311, -68.109018), new LatLng(-16.497108, -68.109233),
                        new LatLng(-16.496650, -68.109926), new LatLng(-16.495158, -68.110484), new LatLng(-16.495158, -68.110629),
                        new LatLng(-16.495338, -68.111090), new LatLng(-16.495539, -68.111267), new LatLng(-16.495822, -68.111347),
                        new LatLng(-16.496233, -68.112136), new LatLng(-16.495971, -68.112447), new LatLng(-16.495652, -68.113123),
                        new LatLng(-16.495086, -68.113799), new LatLng(-16.494438, -68.113729), new LatLng(-16.493661, -68.114072),
                        new LatLng(-16.493496, -68.114276), new LatLng(-16.493455, -68.114566), new LatLng(-16.492431, -68.115188),
                        new LatLng(-16.493228, -68.116341), new LatLng(-16.493228, -68.116416), new LatLng(-16.493305, -68.116555),
                        new LatLng(-16.493398, -68.116662), new LatLng(-16.493753, -68.117172), new LatLng(-16.494056, -68.117671),
                        new LatLng(-16.494354, -68.118218), new LatLng(-16.494596, -68.118406), new LatLng(-16.494586, -68.118535),
                        new LatLng(-16.493609, -68.118825), new LatLng(-16.492714, -68.119125), new LatLng(-16.491289, -68.119211),
                        new LatLng(-16.491330, -68.119533), new LatLng(-16.491404, -68.119579), new LatLng(-16.491535, -68.119592),
                        new LatLng(-16.492880, -68.119653), new LatLng(-16.493286, -68.119774), new LatLng(-16.493328, -68.119929),
                        new LatLng(-16.493146, -68.120127), new LatLng(-16.492976, -68.120095), new LatLng(-16.492894, -68.120232),
                        new LatLng(-16.493038, -68.120385), new LatLng(-16.493079, -68.121474), new LatLng(-16.493923, -68.121442),
                        new LatLng(-16.494229, -68.121423), new LatLng(-16.494386, -68.121546), new LatLng(-16.494558, -68.121535),
                        new LatLng(-16.494630, -68.121404), new LatLng(-16.495576, -68.121353), new LatLng(-16.496505, -68.121297),
                        new LatLng(-16.496952, -68.121296), new LatLng(-16.499176, -68.121178), new LatLng(-16.501473, -68.121096),
                        new LatLng(-16.501569, -68.123597), new LatLng(-16.501681, -68.124153), new LatLng(-16.502082, -68.124444),
                        new LatLng(-16.502380, -68.125313),new LatLng(-16.501670, -68.128049),new LatLng(-16.501760, -68.128433),
                        new LatLng(-16.502151, -68.128750), new LatLng(-16.502471, -68.128783), new LatLng(-16.503948, -68.128444)).color(Color.rgb(29,240,39)));

                break;
            case 3:
                LatLng calle = new LatLng(-16.533680, -68.037116);
                LatLng calle60 =new LatLng(-16.534554, -68.041708);
                LatLng calle53 = new LatLng(-16.536381, -68.045748);
                LatLng calle46 = new LatLng(-16.538400, -68.050551);
                LatLng calle37 = new LatLng(-16.540127, -68.053997);
                LatLng calle35 = new LatLng(-16.541114, -68.057531);
                LatLng cota = new LatLng(-16.541794, -68.062097);
                LatLng calle28 = new LatLng(-16.542526, -68.065775);
                LatLng pinos =new LatLng(-16.545446, -68.064365);
                LatLng pinos25 = new LatLng(-16.545400, -68.070562);
                LatLng calle21 = new LatLng(-16.544984, -68.076206);
                LatLng calle15 = new LatLng(-16.544564, -68.082778);
                LatLng sauces = new LatLng(-16.545080, -68.090579);
                LatLng ferial = new LatLng(-16.531077, -68.100163);
                LatLng julio = new LatLng(-16.529452, -68.103145);
                LatLng loba = new LatLng(-16.528124, -68.105976);
                LatLng calle4 = new LatLng(-16.524480, -68.111027);
                LatLng holhin = new LatLng(-16.519551, -68.116384);


                LatLng umsachasqui = new LatLng(-16.503927, -68.128445);
                LatLng camachochasqui = new LatLng(-16.500265, -68.132058);
                mMap.addMarker(new MarkerOptions().position(calle).title("Calle 63").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle60).title("Calle 60").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle53).title("Calle 53").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle46).title("Calle 46").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle37).title("Calle 37").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle35).title("Calle 35 Del Escultor").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));

                mMap.addMarker(new MarkerOptions().position(cota).title("Laguna de Cota Cota").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle28).title("Calle 28-Cota Cota").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(pinos).title("Calle 28 Los pinos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(pinos25).title("Calle 25 Los pinos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle21).title("Final Calle 21").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle15).title("Final Calle 15").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(sauces).title("Los Sauces").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(ferial).title("Adesu-Campo Ferial").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(julio).title("M.16 de Julio").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(loba).title("Plza. de la loba").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(calle4).title("C. 4 Obrajes - C. 6 Obrajes").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(holhin).title("Curva de Holguín").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));

                mMap.addMarker(new MarkerOptions().position(umsachasqui).title("U.M.S.A").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));
                mMap.addMarker(new MarkerOptions().position(camachochasqui).title("Plza. Camacho").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_chasqui_parada)));


                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(calle,15));
                mMap.setBuildingsEnabled(true);

                Polyline chasqui = mMap.addPolyline(new PolylineOptions().add(new LatLng(-16.533680, -68.037116), new LatLng(-16.534554, -68.041708),
                        new LatLng(-16.534715, -68.042169), new LatLng(-16.534705, -68.042143), new LatLng(-16.535220, -68.043207),
                        new LatLng(-16.536011, -68.044469), new LatLng(-16.536381, -68.045748), new LatLng(-16.537196, -68.047903),
                        new LatLng(-16.538055, -68.047709), new LatLng(-16.538236, -68.048830), new LatLng(-16.538400, -68.050551),
                        new LatLng(-16.538414, -68.050690), new LatLng(-16.540250, -68.050709), new LatLng(-16.540127, -68.053997),
                        new LatLng(-16.540142, -68.054426), new LatLng(-16.540147, -68.054576), new LatLng(-16.540317, -68.055225),
                        new LatLng(-16.540219, -68.055488), new LatLng(-16.539669, -68.056089), new LatLng(-16.539432, -68.056105),
                        new LatLng(-16.539566, -68.057103), new LatLng(-16.539849, -68.057339), new LatLng(-16.539844, -68.057516),
                        new LatLng(-16.539957, -68.057596), new LatLng(-16.541114, -68.057531), new LatLng(-16.541608, -68.057499),
                        new LatLng(-16.541639, -68.057907), new LatLng(-16.541552, -68.058009), new LatLng(-16.541742, -68.058347),
                        new LatLng(-16.541480, -68.058712), new LatLng(-16.541506, -68.059833), new LatLng(-16.541794, -68.062097),
                        new LatLng(-16.541876, -68.062521), new LatLng(-16.541866, -68.062972), new LatLng(-16.541902, -68.063079),
                        new LatLng(-16.542961, -68.063299), new LatLng(-16.542694, -68.065016), new LatLng(-16.542751, -68.065118),
                        new LatLng(-16.542934, -68.065246), new LatLng(-16.542526, -68.065775), new LatLng(-16.542997, -68.065177),
                        new LatLng(-16.543703, -68.063927), new LatLng(-16.544065, -68.063705), new LatLng(-16.544422, -68.063673),
                        new LatLng(-16.545551, -68.064003), new LatLng(-16.545446, -68.064365), new LatLng(-16.544645, -68.067225),
                        new LatLng(-16.544897, -68.068239), new LatLng(-16.545056, -68.068829), new LatLng(-16.545195, -68.069135),
                        new LatLng(-16.545390, -68.070170), new LatLng(-16.545400, -68.070562), new LatLng(-16.545307, -68.072209),
                        new LatLng(-16.544984, -68.076206), new LatLng(-16.544961, -68.076821), new LatLng(-16.546663, -68.076462),
                        new LatLng(-16.546221, -68.079263), new LatLng(-16.546236, -68.079805), new LatLng(-16.546030, -68.080932),
                        new LatLng(-16.545469, -68.082112), new LatLng(-16.545428, -68.082429), new LatLng(-16.544564, -68.082778),
                        new LatLng(-16.544025, -68.083015), new LatLng(-16.543940, -68.083747), new LatLng(-16.543800, -68.085189),
                        new LatLng(-16.543887, -68.086550), new LatLng(-16.543928, -68.086647), new LatLng(-16.543841, -68.087350),
                        new LatLng(-16.544252, -68.088122), new LatLng(-16.544489, -68.088460), new LatLng(-16.545080, -68.090579),
                        new LatLng(-16.545301, -68.091405), new LatLng(-16.545466, -68.091367), new LatLng(-16.545430, -68.092335),
                        new LatLng(-16.545196, -68.092533), new LatLng(-16.545070, -68.092546), new LatLng(-16.545013, -68.092626),
                        new LatLng(-16.544794, -68.092709), new LatLng(-16.544159, -68.092819), new LatLng(-16.543915, -68.093017),
                        new LatLng(-16.543421, -68.093634), new LatLng(-16.542897, -68.093732), new LatLng(-16.541628, -68.094042),
                        new LatLng(-16.537959, -68.095501), new LatLng(-16.535192, -68.096617), new LatLng(-16.534782, -68.096799),
                        new LatLng(-16.531224, -68.099734), new LatLng(-16.531077, -68.100163), new LatLng(-16.530403, -68.101668),
                        new LatLng(-16.530279, -68.102089), new LatLng(-16.529794, -68.102253), new LatLng(-16.529441, -68.103186),
                        new LatLng(-16.528995, -68.104435), new LatLng(-16.528124, -68.105976),new LatLng(-16.527723, -68.106808),
                        new LatLng(-16.527404, -68.107205), new LatLng(-16.525491, -68.110746), new LatLng(-16.524845, -68.110426),
                        new LatLng(-16.524480, -68.111027), new LatLng(-16.523531, -68.112824), new LatLng(-16.522430, -68.114722),
                        new LatLng(-16.521994, -68.114922), new LatLng(-16.520832, -68.114882), new LatLng(-16.519731, -68.114619),
                        new LatLng(-16.519695, -68.114807), new LatLng(-16.519793, -68.115048), new LatLng(-16.520600, -68.115719),
                        new LatLng(-16.520646, -68.115955), new LatLng(-16.520466, -68.116250), new LatLng(-16.519551, -68.116384),
                        new LatLng(-16.517295, -68.116744), new LatLng(-16.516441, -68.116862), new LatLng(-16.515484, -68.117581),
                        new LatLng(-16.513879, -68.117774), new LatLng(-16.513221, -68.118300), new LatLng(-16.511801, -68.119105),
                        new LatLng(-16.511678, -68.119448), new LatLng(-16.511637, -68.120027), new LatLng(-16.508791, -68.122323),
                        new LatLng(-16.508426, -68.122555), new LatLng(-16.507069, -68.123262), new LatLng(-16.506373, -68.123914),
                        new LatLng(-16.505411, -68.125104), new LatLng(-16.505046, -68.125313), new LatLng(-16.504182, -68.125619),
                        new LatLng(-16.503837, -68.125758), new LatLng(-16.503678, -68.126246), new LatLng(-16.503364, -68.126707),
                        new LatLng(-16.502989, -68.127828), new LatLng(-16.502974, -68.128456), new LatLng(-16.502943, -68.128649),
                        new LatLng(-16.503927, -68.128445), new LatLng(-16.504289, -68.128471), new LatLng(-16.504526, -68.128679),
                        new LatLng(-16.502983, -68.129677), new LatLng(-16.502024, -68.130591), new LatLng(-16.500673, -68.132244),
                        new LatLng(-16.500265, -68.132058)).color(Color.rgb(250,159,68)));

                break;

            case 4:
                LatLng lagunas = new LatLng(-16.442785, -68.150570);
                LatLng cerezos =new LatLng(-16.446054, -68.149586);
                LatLng comunal = new LatLng(-16.447639, -68.149619);
                LatLng retamas = new LatLng(-16.449863, -68.149140);
                LatLng primavera = new LatLng(-16.452672, -68.149321);
                LatLng calle3fero = new LatLng(-16.455892, -68.149712);
                LatLng parroquia = new LatLng(-16.458104, -68.149401);
                LatLng pasarela = new LatLng(-16.461937, -68.151139);
                LatLng calle5ferro =new LatLng(-16.463825, -68.152641);
                LatLng calle2ferro = new LatLng(-16.468044, -68.153987);
                LatLng coro = new LatLng(-16.472114, -68.153736);
                LatLng industrial = new LatLng(-16.476645, -68.153113);
                LatLng papelera = new LatLng(-16.479737, -68.151316);
                LatLng puenteferial = new LatLng(-16.482551, -68.149192);
                LatLng pescaditos = new LatLng(-16.485423, -68.146357);
                LatLng piloto = new LatLng(-16.487685, -68.145241);
                LatLng munecas = new LatLng(-16.490458, -68.140762);
                LatLng mendoza = new LatLng(-16.493139, -68.138539);


                mMap.addMarker(new MarkerOptions().position(lagunas).title("7 Lagunas").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(cerezos).title("Cerezos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(comunal).title("Casa Comunal").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(retamas).title("Retamas").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(primavera).title("Parque Primavera").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(calle3fero).title("Ciudadela Ferroviaria calle 3").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));

                mMap.addMarker(new MarkerOptions().position(parroquia).title("Parroquia Señor de La Paz").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(pasarela).title("Pasarela Autopista").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(calle5ferro).title("M. Gamarra calle 5").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(calle2ferro).title("H. Siles Calle 2").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(coro).title("Coro Coro").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(industrial).title("Escuela Industrial").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(papelera).title("La Papelera").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(puenteferial).title("Puente Ferrobeni").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(pescaditos).title("Los Pescaditos").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(piloto).title("Centro Piloto").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(munecas).title("Montes- I. de las Muñecas").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));
                mMap.addMarker(new MarkerOptions().position(mendoza).title("Plaza Alonzo de Mendoza").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_parada_ferroviaria)));



                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lagunas,15));
                mMap.setBuildingsEnabled(true);

                Polyline ferroviaria = mMap.addPolyline(new PolylineOptions().add(new LatLng(-16.442785, -68.150570), new LatLng(-16.443294, -68.150651),
                        new LatLng(-16.443881, -68.149728), new LatLng(-16.444004, -68.149589), new LatLng(-16.444333, -68.149535),
                        new LatLng(-16.444827, -68.149621), new LatLng(-16.446054, -68.149586), new LatLng(-16.446958, -68.149896),
                        new LatLng(-16.447639, -68.149619), new LatLng(-16.448539, -68.149332), new LatLng(-16.449863, -68.149140),
                        new LatLng(-16.450897, -68.149359),new LatLng(-16.452672, -68.149321), new LatLng(-16.453094, -68.149337),
                        new LatLng(-16.453557, -68.149283), new LatLng(-16.454133, -68.149846), new LatLng(-16.455892, -68.149712),
                        new LatLng(-16.456849, -68.149299), new LatLng(-16.458104, -68.149401), new LatLng(-16.459740, -68.149519),
                        new LatLng(-16.459863, -68.149498), new LatLng(-16.460506, -68.150088),new LatLng(-16.460990, -68.150238),
                        new LatLng(-16.461937, -68.151139), new LatLng(-16.462673, -68.151767), new LatLng(-16.463373, -68.152271),
                        new LatLng(-16.463527, -68.152555), new LatLng(-16.463825, -68.152641), new LatLng(-16.465101, -68.152984),
                        new LatLng(-16.465307, -68.153166), new LatLng(-16.466706, -68.153719), new LatLng(-16.468044, -68.153987),
                        new LatLng(-16.468466, -68.154304), new LatLng(-16.469171, -68.154315), new LatLng(-16.469999, -68.154310),
                        new LatLng(-16.471630, -68.153790), new LatLng(-16.472114, -68.153736), new LatLng(-16.472273, -68.153715),
                        new LatLng(-16.472520, -68.153221), new LatLng(-16.474850, -68.153521), new LatLng(-16.476645, -68.153113),
                        new LatLng(-16.478013, -68.152582), new LatLng(-16.478260, -68.152362), new LatLng(-16.478605, -68.152282),
                        new LatLng(-16.479737, -68.151316), new LatLng(-16.480514, -68.150780), new LatLng(-16.481260, -68.150013),
                        new LatLng(-16.481641, -68.149734), new LatLng(-16.482551, -68.149192), new LatLng(-16.482883, -68.148892),
                        new LatLng(-16.483685, -68.147871), new LatLng(-16.484652, -68.147280), new LatLng(-16.485094, -68.146798),
                        new LatLng(-16.485125, -68.146740), new LatLng(-16.485423, -68.146357), new LatLng(-16.486922, -68.145490),
                        new LatLng(-16.487685, -68.145241), new LatLng(-16.488939, -68.144510), new LatLng(-16.488522, -68.144313),
                        new LatLng(-16.488368, -68.143262), new LatLng(-16.488368, -68.142468), new LatLng(-16.488193, -68.140703),
                        new LatLng(-16.488424, -68.140333), new LatLng(-16.489185, -68.139845), new LatLng(-16.489329, -68.139765),
                        new LatLng(-16.489478, -68.139776), new LatLng(-16.490836, -68.139272), new LatLng(-16.491175, -68.139261),
                        new LatLng(-16.490902, -68.139540), new LatLng(-16.490458, -68.140762), new LatLng(-16.491282, -68.141432),
                        new LatLng(-16.492141, -68.140475), new LatLng(-16.492856, -68.139617), new LatLng(-16.493406, -68.138737),
                        new LatLng(-16.493139, -68.138539)).color(Color.rgb(26,21,195)));
                break;

            case 5:
                LatLng deulio16 = new LatLng(-16.451669, -68.093169);
                LatLng abril27 =new LatLng(-16.451638, -68.095712);
                LatLng kalaj = new LatLng(-16.453552, -68.096592);
                LatLng felipe = new LatLng(-16.455983, -68.100205);
                LatLng padua = new LatLng(-16.459687, -68.102976);
               LatLng calle3jahuira = new LatLng(-16.462050, -68.106730);
                LatLng exaltacion = new LatLng(-16.464346, -68.109451);
                LatLng fatima = new LatLng(-16.466435, -68.111323);
                 LatLng carmen =new LatLng(-16.467660, -68.113254);
                LatLng minasa = new LatLng(-16.468992, -68.116360);
                LatLng condarco = new LatLng(-16.472501, -68.116591);
                LatLng maestro = new LatLng(-16.474757, -68.117724);
                LatLng petrolero = new LatLng(-16.477689, -68.118620);
                LatLng grafico = new LatLng(-16.480600, -68.119211);
                LatLng iris = new LatLng(-16.482628, -68.120331);
                LatLng villaroel = new LatLng(-16.484829, -68.121050);
                LatLng honduras = new LatLng(-16.489251, -68.123165);
                LatLng guatemala = new LatLng(-16.493070, -68.123114);


                LatLng panama = new LatLng(-16.496177, -68.123101);
                LatLng club = new LatLng(-16.500419, -68.123045);
                LatLng bolivar = new LatLng(-16.500146, -68.128249);


                mMap.addMarker(new MarkerOptions().position(deulio16).title("Calle 16 de julio").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(abril27).title("Calle. 27 de abril").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(kalaj).title("Kalajahuira").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(felipe).title("Kalajahuira - c. Felipe Paz").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(padua).title("Parroquia San Antonio de Padua").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(calle3jahuira).title("Chuquiaguillo - Calle 3").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));

                mMap.addMarker(new MarkerOptions().position(exaltacion).title("Señor de la Exaltación").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(fatima).title("Hogares Fátima").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(carmen).title("El Carmen").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(minasa).title("Terminal Minasa").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(condarco).title("Calle Condarco").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(maestro).title("Plaza del Maestro").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(petrolero).title("Barrio Petrolero").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(grafico).title("Barrio Gráfico").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(iris).title("H. Arcoiris-Policlinico Villa Fatima").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(villaroel).title("Plaza Villarroel").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(honduras).title("Honduras").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(guatemala).title("Guatemala").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));

                mMap.addMarker(new MarkerOptions().position(panama).title("Héroes del Pacifico-Panamá").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(club).title("Club The Strongest-Bolivar").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));
                mMap.addMarker(new MarkerOptions().position(bolivar).title("Simón Bolívar").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_kalajahuira)));




                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(deulio16,15));
                mMap.setBuildingsEnabled(true);

                Polyline jahuira = mMap.addPolyline(new PolylineOptions().add(new LatLng(-16.451669, -68.093169), new LatLng(-16.451751, -68.093974),
                        new LatLng(-16.451967, -68.094875), new LatLng(-16.451638, -68.095712), new LatLng(-16.451473, -68.096270),
                        new LatLng(-16.451710, -68.096860), new LatLng(-16.452883, -68.096678), new LatLng(-16.453480, -68.096453),
                        new LatLng(-16.453552, -68.096592), new LatLng(-16.455065, -68.099317), new LatLng(-16.455983, -68.100205),
                        new LatLng(-16.457701, -68.101527), new LatLng(-16.458956, -68.102332),new LatLng(-16.459687, -68.102976),
                        new LatLng(-16.460438, -68.103652), new LatLng(-16.460767, -68.104189), new LatLng(-16.461168, -68.105318),
                        new LatLng(-16.462050, -68.106730), new LatLng(-16.462556, -68.107462), new LatLng(-16.464104, -68.109097),
                        new LatLng(-16.464346, -68.109451), new LatLng(-16.464876, -68.110390), new LatLng(-16.465828, -68.110728),
                        new LatLng(-16.466435, -68.111323), new LatLng(-16.467181, -68.112192), new LatLng(-16.467376, -68.112530),
                        new LatLng(-16.467633, -68.113227), new LatLng(-16.467839, -68.113742), new LatLng(-16.468770, -68.114761),
                        new LatLng(-16.468755, -68.115260), new LatLng(-16.468359, -68.115598), new LatLng(-16.468338, -68.116097),
                        new LatLng(-16.468441, -68.116242), new LatLng(-16.468755, -68.116376), new LatLng(-16.468992, -68.116360),
                        new LatLng(-16.469764, -68.116060), new LatLng(-16.471688, -68.116232), new LatLng(-16.472151, -68.116355),
                        new LatLng(-16.472501, -68.116591),new LatLng(-16.474613, -68.118013), new LatLng(-16.474762, -68.117880),
                        new LatLng(-16.474757, -68.117724), new LatLng(-16.474798, -68.117880), new LatLng(-16.475148, -68.118030),
                        new LatLng(-16.477689, -68.118620), new LatLng(-16.480600, -68.119211), new LatLng(-16.481295, -68.119348),
                        new LatLng(-16.481851, -68.119452), new LatLng(-16.481846, -68.119929), new LatLng(-16.482628, -68.120331),
                        new LatLng(-16.483379, -68.120637), new LatLng(-16.483492, -68.120707), new LatLng(-16.483821, -68.121104),
                        new LatLng(-16.484829, -68.121050), new LatLng(-16.485030, -68.121045), new LatLng(-16.485102, -68.122574),
                        new LatLng(-16.487242, -68.123180),new LatLng(-16.489279, -68.123201), new LatLng(-16.493070, -68.123114),
                        new LatLng(-16.496177, -68.123101), new LatLng(-16.498296, -68.123133), new LatLng(-16.498472, -68.123000),
                        new LatLng(-16.498413, -68.122717), new LatLng(-16.498557, -68.122160), new LatLng(-16.498732, -68.122015),
                        new LatLng(-16.498912, -68.121977), new LatLng(-16.500136, -68.121972), new LatLng(-16.500347, -68.122090),
                        new LatLng(-16.500512, -68.122578), new LatLng(-16.500419, -68.123045), new LatLng(-16.499719, -68.123941),
                        new LatLng(-16.499801, -68.124172), new LatLng(-16.499806, -68.124311), new LatLng(-16.499693, -68.124536),
                        new LatLng(-16.500629, -68.126752), new LatLng(-16.500650, -68.127069), new LatLng(-16.500146, -68.128249)
                        ).color(Color.rgb(248,97,220)));

                break;

            case 6:
                LatLng irpavi2 = new LatLng(-16.499089, -68.083607);
                LatLng arantaya =new LatLng(-16.501989, -68.083238);
                LatLng veren = new LatLng(-16.507498, -68.085439);
                LatLng calle18irpavi = new LatLng(-16.511454, -68.086273);
                LatLng calle15irpavi = new LatLng(-16.515338, -68.087516);
                LatLng calle12irpavi = new LatLng(-16.518505, -68.087677);
                LatLng calle9irpavi = new LatLng(-16.521092, -68.087343);
                LatLng calle6irpavi = new LatLng(-16.524429, -68.086295);
                LatLng calle3irpavi =new LatLng(-16.528002, -68.085936);
                LatLng bedregal = new LatLng(-16.525883, -68.087285);
                LatLng salle = new LatLng(-16.525058, -68.090120);
                LatLng kaliri = new LatLng(-16.517446, -68.090116);
                LatLng bolognia = new LatLng(-16.521170, -68.090245);
                LatLng litoral = new LatLng(-16.526491, -68.094784);
                LatLng bVista = new LatLng(-16.527602, -68.097901);
                LatLng huano = new LatLng(-16.526270, -68.098942);
                LatLng huira = new LatLng(-16.525365, -68.099865);
                LatLng sector = new LatLng(-16.523482, -68.102736);
                LatLng pingeniero = new LatLng(-16.520335, -68.104898);
                LatLng teleferico = new LatLng(-16.520219, -68.110682);
                LatLng olimpica = new LatLng(-16.519434, -68.113400);


                LatLng normal = new LatLng(-16.517103, -68.113398);
                LatLng umsairpavi= new LatLng(-16.503957, -68.128442);
                LatLng camachoirpavi = new LatLng(-16.500324, -68.132090);

                LatLng simirpavi = new LatLng(-16.500711, -68.130310);


                mMap.addMarker(new MarkerOptions().position(irpavi2).title("irpavi II").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(arantaya).title("Aruntaya").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(veren).title("Plazuela El Vergel").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(calle18irpavi).title("Calle 18").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(calle15irpavi).title("Calle 15 ").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(calle12irpavi).title("Calle 12").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));

                mMap.addMarker(new MarkerOptions().position(calle9irpavi).title("Calle 9- San Martín de Porres").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(calle6irpavi).title("Calle 6").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(calle3irpavi).title("Calle 3 ").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(bedregal).title("Yolanda Bedregal").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(salle).title("La Salle").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(kaliri).title("Ingreso Caliri").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(bolognia).title("Plaza Bolognia").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(litoral).title("Litoral").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(bVista).title("Bella Vista - Complejo Bella Vista").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(huano).title("Huano Huanuni").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(huira).title("Kollpajahuira").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(sector).title("Secto A- Sector B").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(pingeniero).title("Parque del Ingeniero").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(teleferico).title("Teleférico Alto Obrajes").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(olimpica).title("Piscina Olímpica").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));


                mMap.addMarker(new MarkerOptions().position(normal).title("Normal Superior").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(umsairpavi).title("U.M.S.A").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));
                mMap.addMarker(new MarkerOptions().position(camachoirpavi).title("Plaza Camacho").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));

                mMap.addMarker(new MarkerOptions().position(simirpavi).title("Sim").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_parada_irpavi2)));





                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(irpavi2,15));
                mMap.setBuildingsEnabled(true);

                Polyline irpavi = mMap.addPolyline(new PolylineOptions().add(new LatLng(-16.499089, -68.083607), new LatLng(-16.499998, -68.083229),
                        new LatLng(-16.501066, -68.082644), new LatLng(-16.501486, -68.083440), new LatLng(-16.501989, -68.083238),
                        new LatLng(-16.502559, -68.083035), new LatLng(-16.503747, -68.082771), new LatLng(-16.504081, -68.082387),
                        new LatLng(-16.504368, -68.082194), new LatLng(-16.504807, -68.082240), new LatLng(-16.505296, -68.082687),
                        new LatLng(-16.505610, -68.083148), new LatLng(-16.506001, -68.084291), new LatLng(-16.506454, -68.085230),
                        new LatLng(-16.506706, -68.085402), new LatLng(-16.507179, -68.085477), new LatLng(-16.507498, -68.085439),
                        new LatLng(-16.510693, -68.085550), new LatLng(-16.511012, -68.085743), new LatLng(-16.511722, -68.086494),
                        new LatLng(-16.513137, -68.087416), new LatLng(-16.514295, -68.087526), new LatLng(-16.515338, -68.087516),
                        new LatLng(-16.515338, -68.087516), new LatLng(-16.518505, -68.087677), new LatLng(-16.521061, -68.087794),
                        new LatLng(-16.521092, -68.087343), new LatLng(-16.521143, -68.086420), new LatLng(-16.522460, -68.086495),
                        new LatLng(-16.523447, -68.086538), new LatLng(-16.524429, -68.086295), new LatLng(-16.525472, -68.085984),
                        new LatLng(-16.526449, -68.085711),new LatLng(-16.527992, -68.085593), new LatLng(-16.528002, -68.085936),
                        new LatLng(-16.528074, -68.086322), new LatLng(-16.528177, -68.086923), new LatLng(-16.526974, -68.087062),
                        new LatLng(-16.525883, -68.087285), new LatLng(-16.525836, -68.087386), new LatLng(-16.526044, -68.088043),
                        new LatLng(-16.526116, -68.088474), new LatLng(-16.526120, -68.088907), new LatLng(-16.526014, -68.089323),
                        new LatLng(-16.525603, -68.090276), new LatLng(-16.525212, -68.090218), new LatLng(-16.525058, -68.090120),
                        new LatLng(-16.523578, -68.089736), new LatLng(-16.522179, -68.089803), new LatLng(-16.521268, -68.089785),
                        new LatLng(-16.520309, -68.090060), new LatLng(-16.518459, -68.089980), new LatLng(-16.517446, -68.090116),

                        new LatLng(-16.517446, -68.090116), new LatLng(-16.517348, -68.090357), new LatLng(-16.518475, -68.090256),
                        new LatLng(-16.520285, -68.090342), new LatLng(-16.521170, -68.090245), new LatLng(-16.522147, -68.090470),
                        new LatLng(-16.522113, -68.090738), new LatLng(-16.522458, -68.091339), new LatLng(-16.523682, -68.091538),
                        new LatLng(-16.523631, -68.091748), new LatLng(-16.523348, -68.092242), new LatLng(-16.523405, -68.092451),
                        new LatLng(-16.523827, -68.092982), new LatLng(-16.524917, -68.093245), new LatLng(-16.525025, -68.093417),
                        new LatLng(-16.525154, -68.093846), new LatLng(-16.525457, -68.093921), new LatLng(-16.526079, -68.093792),
                        new LatLng(-16.526352, -68.094049), new LatLng(-16.526573, -68.094516), new LatLng(-16.526491, -68.094784),
                        new LatLng(-16.526398, -68.095272), new LatLng(-16.526501, -68.095707), new LatLng(-16.526167, -68.096415),
                        new LatLng(-16.526213, -68.096608), new LatLng(-16.526902, -68.097166), new LatLng(-16.527252, -68.097638),
                        new LatLng(-16.527602, -68.097901), new LatLng(-16.528003, -68.098266), new LatLng(-16.527905, -68.098599),
                        new LatLng(-16.526846, -68.098738), new LatLng(-16.526270, -68.098942), new LatLng(-16.525874, -68.099457),

                        new LatLng(-16.525360, -68.099709),new LatLng(-16.525365, -68.099865), new LatLng(-16.525046, -68.099844),

                        new LatLng(-16.523976, -68.099415), new LatLng(-16.523853, -68.099560), new LatLng(-16.524069, -68.099823),

                        new LatLng(-16.524511, -68.100274), new LatLng(-16.525966, -68.100784), new LatLng(-16.525529, -68.101068),
                        new LatLng(-16.525092, -68.101712), new LatLng(-16.524516, -68.102350), new LatLng(-16.523739, -68.102543),
                        new LatLng(-16.523482, -68.102736), new LatLng(-16.523127, -68.103154), new LatLng(-16.522685, -68.103878),
                        new LatLng(-16.522690, -68.104195), new LatLng(-16.522803, -68.104281), new LatLng(-16.522397, -68.104710),
                        new LatLng(-16.522289, -68.104823), new LatLng(-16.520335, -68.104898), new LatLng(-16.520112, -68.104903),
                        new LatLng(-16.520225, -68.107912), new LatLng(-16.520230, -68.109727), new LatLng(-16.520425, -68.110054),
                        new LatLng(-16.520687, -68.110247), new LatLng(-16.520219, -68.110682), new LatLng(-16.519730, -68.111202),
                        new LatLng(-16.520198, -68.111604), new LatLng(-16.520588, -68.112020), new LatLng(-16.520264, -68.112374),
                        new LatLng(-16.519907, -68.113184), new LatLng(-16.519434, -68.113400), new LatLng(-16.517833, -68.113570),
                        new LatLng(-16.517103, -68.113398), new LatLng(-16.515149, -68.113334), new LatLng(-16.514594, -68.113441),
                        new LatLng(-16.513833, -68.113302), new LatLng(-16.513298, -68.113828), new LatLng(-16.513507, -68.114101),
                        new LatLng(-16.513652, -68.114445), new LatLng(-16.513875, -68.114433), new LatLng(-16.514130, -68.114542),
                        new LatLng(-16.515614, -68.116271), new LatLng(-16.515933, -68.116919), new LatLng(-16.516422, -68.118453),
                        new LatLng(-16.515440, -68.118812), new LatLng(-16.514253, -68.118941), new LatLng(-16.512022, -68.119731),
                        new LatLng(-16.511728, -68.119614), new LatLng(-16.511543, -68.120085), new LatLng(-16.510710, -68.120772),
                        new LatLng(-16.508802, -68.122312), new LatLng(-16.507869, -68.122865), new LatLng(-16.506696, -68.123572),
                        new LatLng(-16.506694, -68.123583), new LatLng(-16.506200, -68.124113), new LatLng(-16.505418, -68.125093),
                        new LatLng(-16.505161, -68.125275), new LatLng(-16.504338, -68.125565), new LatLng(-16.503880, -68.125678),
                        new LatLng(-16.503664, -68.126247), new LatLng(-16.503314, -68.126778), new LatLng(-16.503047, -68.127577),
                        new LatLng(-16.502949, -68.128189), new LatLng(-16.502954, -68.128532), new LatLng(-16.502995, -68.128643),
                        new LatLng(-16.503957, -68.128442), new LatLng(-16.504327, -68.128517), new LatLng(-16.504522, -68.128689),
                        new LatLng(-16.502886, -68.129757), new LatLng(-16.501667, -68.130996), new LatLng(-16.500705, -68.132251),
                        new LatLng(-16.500324, -68.132090), new LatLng(-16.499985, -68.131951), new LatLng(-16.500510, -68.130857),
                        new LatLng(-16.500711, -68.130310)).color(Color.rgb(63,176,112)));



                break;


     }


        // Add a marker in Sydney and move the camera


//        LatLng sydney = new LatLng(-34, 151);
  //      mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
    //    mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
