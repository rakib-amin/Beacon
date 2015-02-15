package com.example.beacon;

import java.io.IOException;
import java.util.List;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindRoute extends Activity{
	
	static LatLng myLL,toPosition;
	EditText street;
	Button submit;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find_route);
		
		LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		LocationListener locationListener = new MyLocationListener();
		locationManager.requestLocationUpdates(
		LocationManager.GPS_PROVIDER, 5000, 10, locationListener);

		street = (EditText) findViewById(R.id.street);
		submit = (Button) findViewById(R.id.btnSubmit);
		
		Geocoder g = new Geocoder(this);
	    List<Address> addressList = null;
	    String searchRoad = "Insert Road Name Here!";
	    try {
	        addressList = g.getFromLocationName(searchRoad, 1);

	    } catch (IOException e) {
	        Toast.makeText(this, "Location not found", Toast.LENGTH_SHORT)
	                    .show();
	            e.printStackTrace();

	    } finally {
	        Address address = addressList.get(0);

	        if (address.hasLatitude() && address.hasLongitude()) {
	            double selectedLat = address.getLatitude();
	            double selectedLng = address.getLongitude();
	            toPosition = new LatLng(selectedLat, selectedLng);
	            
	        	}
	    }
		
		submit.setOnClickListener(new View.OnClickListener() {
			 
            public void onClick(View v) {
                
                Intent i = new Intent(getApplicationContext(), DirectionActivity.class);
                startActivity(i);
            }
        });
		
	}
		
	public static LatLng getFrom()
	{
		return myLL;
	}
	
	public static LatLng getTo()
	{
		return toPosition;
	}
	
	private class MyLocationListener implements LocationListener{

		@Override
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
		 double latitude = location.getLatitude();
		 
		 double longitude = location.getLongitude();
	
		 myLL = new LatLng(latitude, longitude);
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
		
	}


}

