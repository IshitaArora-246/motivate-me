package com.ishita.motivateme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var message: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.et_Name)
        message = findViewById(R.id.tvHeading)
        val submitButton: Button = findViewById(R.id.btn_motivateMe)
        submitButton.setOnClickListener{
            updateMessage()
        }
    }

    private fun updateMessage(){

        val userName = name.text

        val motivationalMessages = listOf<String>("I’ll be there.",
        "I love you",
        "Maybe you’re right.",
        "I trust you.",
        "Go for it.",
        "Got your back.",
        "How are you?",
        "I want you.",
        "Get lost, creep.",
        "Let’s get high.",
        "I respect you.",
        "Please forgive me.",
        "Now or never.",
        "Get enough sleep.",
        "I miss you.",
        "Let’s get drunk.",
        "Nurture your best.",
        "Let’s just dance.",
        "Let it go.",
        "Try something new.",
        "Keep it legal.",
        "I am sorry.",
        "Thanks so much.",
        "Protect your health.",
        "Do it now.",
        "Appreciate the moment.",
        "Be a giver.",
        "Block out haters.",
        "Change is good.",
        "Count your blessings.",
        "Against all odds.",
        "All is well.",
        "Try something new.",
        "Dreams come true.",
        "Never give up.",
        "Winners never quit.",
        "Success breeds success.",
        "Never look back.",
        "Now or never.",
        "Make it happen.",
        "Be obsessively grateful.",
        "Good vibes only.",
        "Feed your soul.",
        "You are enough.",
        "Nobody is perfect.",
        "Keep it cool.",
        "Learn from yesterday.",
        "Try something new.",
        "Never stop dreaming.",
        "Learn from yesterday.",
        "Keep it fun.",
                "Don’t drive drunk.",
        "Celebrate your victories.",
        "Let’s be friends.",
        "This is music.",
        "Over and out.",
        "Where are you?",
        "Wake your dreams.",
        "Life won’t wait.",
        "Believe in yourself.",
        "Let it be.",
        "Hold my hand.",
        "Who are you?",
        "This will pass.",
        "Speak the truth.",
        "Live your potential.",
        "Live, learn, love.",
        "Love conquers all.",
        "Love endures delay.",
        "Love, light, laughter.",
        "Love your enemies.",
        "Love your job.",
        "Love your parents.",
        "Maintain your integrity.",
        "Make enough money.",
        "Have meaningful goals.",
        "Make new friends.",
        "Make people grin.",
        "Make somebody’s day.",
        "Make things happy.",
        "Never hold grudges.",
        "Never look back.",
        "No strings attached.",
        "Nurture your best.",
        "Only hope remains.",
        "Organize your life.",
        "Passion, strength, fire.",
        "Pick yourself flowers.",
        "Plan your vacation.",
        "Please forgive me.",
        "Procrastination steals time.",
        "Rain will fall.",
        "RequiresPermission.Read a book.",
        "Read interesting articles.",
        "Ready… Aim… Fire.",
        "Remember to live.",
        "Respect your elders.",
        "Ride or die.",
        "Save every penny.",
        "Seize the day.",
        "Shine your light.",
        "Creativity takes courage.",
        "Don’t overthink it.",
        "Try new things.",
        "Nourish your soul.",
        "Happiness is homemade.",
        "Be the exception.",
        "Conquer from within.",
        "Escape the ordinary.",
        "Aspire to inspire.",)
        val index = (0..110).random()
        if(userName.toString()==""){
            message.text = getString(R.string.Enter_you_name_first)
        }
        else {
            message.text = "Hello $userName, ${motivationalMessages[index]}"
        }
        name.setText("")
        hideKeyboard()
    }

    private fun hideKeyboard(){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(name.windowToken,0)
    }
}