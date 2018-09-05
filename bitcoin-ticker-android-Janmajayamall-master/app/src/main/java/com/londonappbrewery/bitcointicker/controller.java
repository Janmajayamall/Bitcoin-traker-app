package com.londonappbrewery.bitcointicker;
import org.json.JSONException;
import org.json.JSONObject;
import com.loopj.android.http.*;
import com.loopj.android.http.AsyncHttpClient;


public class controller {

    private String price;

    public static controller fromJson(JSONObject jsonObject){



        try {

            controller btcprice = new controller();
            btcprice.price = jsonObject.getString("last");
            return btcprice;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


    }

    public String getPrice() {
        return price;
    }
}
