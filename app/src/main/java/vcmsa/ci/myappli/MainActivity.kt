package vcmsa.ci.myappli

import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup variables to allow us to get the UI data
        val inputTime = findViewById<EditText>(R.id.timeInput)
        val suggestionOutput = findViewById<TextView>(R.id.mealSuggestion)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        //The main code that gets started by the click of the Suggest Meal button
        suggestButton.setOnClickListener {
            val timeOfDay = inputTime.text.toString().trim().lowercase()

           //If statements logic that checks what users entered in InputTime and displays the meal suggestion on the suggestion OUtput text field
            if (TextUtils.isEmpty(timeOfDay)) {
                suggestionOutput.text = "Please enter the time of day."
            } else if (timeOfDay == "morning") {
                suggestionOutput.text = "Suggested meal: Bacon, Avo and  Eggs for breakfast."
            } else if (timeOfDay == "mid-morning") {
                suggestionOutput.text = "Suggested meal: Fruit Salad for a light snack."
            } else if (timeOfDay == "afternoon") {
                suggestionOutput.text = "Suggested meal: Tuna or Chicken Mayo Sandwich for lunch."
            } else if (timeOfDay == "mid-afternoon") {
                suggestionOutput.text = "Suggested meal: Crackers or Nuts for a quick bite."
            } else if (timeOfDay == "dinner") {
                suggestionOutput.text = "Suggested meal: Rice with chicken breast or seafood Pasta for dinner."
            } else if (timeOfDay == "after dinner") {
                suggestionOutput.text = "Suggested meal: Yogurt or Ice cream for dessert."
            } else {
                suggestionOutput.text = "Invalid input. Please enter Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, or After Dinner."
            }
        }

        resetButton.setOnClickListener {
            inputTime.text.clear()
            suggestionOutput.text = ""
        }
    }
}
