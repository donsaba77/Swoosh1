package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun onMensClicked(view : View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
        if(!mensLeagueBtn.isChecked){
            selectedLeague = ""
        }
    }
    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
        if(!womensLeagueBtn.isChecked){
            selectedLeague = ""
        }
    }
    fun onCoedClicked (view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
        if(!coedLeagueBtn.isChecked){
            selectedLeague = ""
        }
    }
    fun leagueNextClicked(view: View) {
        if(selectedLeague != ""){
          val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
          startActivity(skillActivity)
        } else{
            Toast.makeText(this,"Please Select a League", Toast.LENGTH_SHORT).show()
        }
    }



}