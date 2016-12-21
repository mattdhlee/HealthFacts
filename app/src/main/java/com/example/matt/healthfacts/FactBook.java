package com.example.matt.healthfacts;

import java.util.Random;

/**
 * Created by Matt on 2016-12-20.
 */

public class FactBook {
    private String[] mFacts = {
            "People who regularly eat dinner or breakfast in restaurants double their risk of becoming obese.",
            "Farting helps reduce high blood pressure and is good for your health.",
            "Laughing 100 times is equivalent to 15 minutes of exercise on a stationary bicycle.",
            "Sitting for more than three hours a day can cut two years off a person's life expectancy.",
            "Over 30% of cancer could be prevented by avoiding tobacco and alcohol, having a healthy diet and physical activity.",
            "Sleeping less than 7 hours each night reduces your life expectancy.",
            "1 Can of Soda a day increases your chances of getting type 2 diabetes by 22%.",
            "There are more skin cancer cases due to indoor tanning than lung cancer cases due to smoking.",
            "McDonalds' Caesar salad is more fattening than their hamburger.",
            "Exercise, like walking, can reduce Cancer'>breast cancer risk by 25%.",
            "Severe Depression can cause us to biologically age more by increasing the aging process in cells.",
            "Chicken contains 266% more fat than it did 40 years ago.",
            "Heavy marijuana smokers are at risk for some of the same health effects as cigarette smokers, like bronchitis and other respiratory illnesses.",
            "Constipation-related health-care costs total US$6.9 billion per year in the U.S."


    };

    public String getFact() {
        //The button was clicked so do something about it.


        //TODO: randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        //update screen with dynamic fact
        String fact = mFacts[randomNumber];
        return fact;
    }


}
