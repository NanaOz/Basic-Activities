package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val openActivityBButton = findViewById<Button>(R.id.btn_activity_a)
        openActivityBButton.setOnClickListener {
            // Обработка нажатия на кнопку "Open ActivityB"
        }
    }



}