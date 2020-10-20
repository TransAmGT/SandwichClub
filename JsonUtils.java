package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {
        JSONObject sandwich = new JSONObject(json);


        JSONObject name = sandwich.getJSONObject("name");

        String mainName = name.getString("mainName");
        String alsoKnownAs = name.getJSONArray("alsoKnownAs");

        String placeOfOrigin = sandwich.getString("placeOfOrigin");
        String description = sandwich.getString("description");
        String image = sandwich.getString("image");
        String ingredients = sandwich.getString("ingredients");

        Sandwich sandwiches = new Sandwich(mainName, alsoKnownAs, placeOfOrigin, description, image, ingredients);


        return ;


    }
}
