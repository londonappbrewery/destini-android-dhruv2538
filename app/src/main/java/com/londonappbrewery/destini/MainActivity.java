package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    TextView buttonTopTextView;
    TextView buttonBottomTextView;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = findViewById(R.id.storyTextView);
        buttonTopTextView = findViewById(R.id.buttonTop);
        buttonBottomTextView = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTopTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 3) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTopTextView.setText(R.string.T3_Ans1);
                    buttonBottomTextView.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    storyTextView.setText(R.string.T6_End);
                    buttonTopTextView.setVisibility(View.GONE);
                    buttonBottomTextView.setVisibility(View.GONE);
                }
            }
        });

        buttonBottomTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonTopTextView.setText(R.string.T2_Ans1);
                    buttonBottomTextView.setText(R.string.T2_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2) {
                    storyTextView.setText(R.string.T5_End);
                    buttonTopTextView.setVisibility(View.GONE);
                    buttonBottomTextView.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    storyTextView.setText(R.string.T4_End);
                    buttonTopTextView.setVisibility(View.GONE);
                    buttonBottomTextView.setVisibility(View.GONE);
                }
            }
        });
    }
}
