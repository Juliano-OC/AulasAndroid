package juliano.correa.pokefighters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAlertMisdreavus: Button
    private lateinit var buttonAlertMismagius: Button
    private lateinit var buttonAlertGastly: Button
    private lateinit var buttonAlertHaunter: Button
    private lateinit var buttonAlertGengar: Button
    private lateinit var buttonAlertAbra: Button
    private lateinit var buttonAlertKadabra: Button
    private lateinit var buttonAlertAlakazam: Button
    private lateinit var buttonAlertCharmander: Button
    private lateinit var buttonAlertCharmeleon: Button
    private lateinit var buttonAlertCharizard: Button
    private lateinit var buttonAlertMegacharizard: Button
    private lateinit var buttonMisdreavus: Button
    private lateinit var buttonMismagius: Button
    private lateinit var buttonGastly: Button
    private lateinit var buttonHaunter: Button
    private lateinit var buttonGengar: Button
    private lateinit var buttonAbra: Button
    private lateinit var buttonKadabra: Button
    private lateinit var buttonAlakazam: Button
    private lateinit var buttonCharmander: Button
    private lateinit var buttonCharmeleon: Button
    private lateinit var buttonCharizard: Button
    private lateinit var buttonMegacharizard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAlertMisdreavus = findViewById(R.id.button_misdreavus)
        buttonAlertMismagius = findViewById(R.id.button_mismagius)
        buttonAlertGastly = findViewById(R.id.button_gastly)
        buttonAlertHaunter = findViewById(R.id.button_haunter)
        buttonAlertGengar = findViewById(R.id.button_gengar)
        buttonAlertAbra = findViewById(R.id.button_abra)
        buttonAlertKadabra = findViewById(R.id.button_kadabra)
        buttonAlertAlakazam = findViewById(R.id.button_alakazam)
        buttonAlertCharmander = findViewById(R.id.button_charmander)
        buttonAlertCharmeleon = findViewById(R.id.button_charmeleon)
        buttonAlertCharizard = findViewById(R.id.button_charizard)
        buttonAlertMegacharizard = findViewById(R.id.button_megacharizard)
        buttonMisdreavus = findViewById(R.id.button_misdreavus)
        buttonMismagius = findViewById(R.id.button_mismagius)
        buttonGastly = findViewById(R.id.button_gastly)
        buttonHaunter = findViewById(R.id.button_haunter)
        buttonGengar = findViewById(R.id.button_gengar)
        buttonAbra = findViewById(R.id.button_abra)
        buttonKadabra = findViewById(R.id.button_kadabra)
        buttonAlakazam = findViewById(R.id.button_alakazam)
        buttonCharmander = findViewById(R.id.button_charmander)
        buttonCharmeleon = findViewById(R.id.button_charmeleon)
        buttonCharizard= findViewById(R.id.button_charizard)
        buttonMegacharizard = findViewById(R.id.button_megacharizard)

        buttonMisdreavus.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_misdreavus), Toast.LENGTH_SHORT).show()
            }
        })

        buttonMismagius.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_mismagius), Toast.LENGTH_SHORT).show()
            }
        })

        buttonGastly.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_gastly), Toast.LENGTH_SHORT).show()
            }
        })

        buttonHaunter.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_haunter), Toast.LENGTH_SHORT).show()
            }
        })

        buttonGengar.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_gengar), Toast.LENGTH_SHORT).show()
            }
        })

        buttonAbra.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_abra), Toast.LENGTH_SHORT).show()
            }
        })

        buttonKadabra.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_kadabra), Toast.LENGTH_SHORT).show()
            }
        })

        buttonAlakazam.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_alakazam), Toast.LENGTH_SHORT).show()
            }
        })

        buttonCharmander.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_charmander), Toast.LENGTH_SHORT).show()
            }
        })

        buttonCharmeleon.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_charmeleon), Toast.LENGTH_SHORT).show()
            }
        })

        buttonCharizard.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_charizard), Toast.LENGTH_SHORT).show()
            }
        })

        buttonMegacharizard.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.toast_megacharizard), Toast.LENGTH_SHORT).show()
            }
        })

        buttonAlertMisdreavus.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert1 = AlertDialog.Builder(this@MainActivity)
                alert1.setMessage(getText(R.string.alert_misdreavus))
                alert1.setTitle(getText(R.string.alert_tittle_misdreavus))
                alert1.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.misdreavus_poke))
                alert1.setNeutralButton(getText(R.string.neutral_button), null)
                alert1.show()
                return true
            }
        })

        buttonAlertMismagius.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert2 = AlertDialog.Builder(this@MainActivity)
                alert2.setMessage(getText(R.string.alert_mismagius))
                alert2.setTitle(getText(R.string.alert_tittle_Mismagius))
                alert2.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.mismagius_poke))
                alert2.setNeutralButton(getText(R.string.neutral_button), null)
                alert2.show()
                return true
            }
        })

        buttonAlertGastly.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert3 = AlertDialog.Builder(this@MainActivity)
                alert3.setMessage(getText(R.string.alert_gastly))
                alert3.setTitle(getText(R.string.alert_tittle_gastly))
                alert3.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.gastly_poke))
                alert3.setNeutralButton(getText(R.string.neutral_button), null)
                alert3.show()
                return true
            }
        })

        buttonAlertHaunter.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert4 = AlertDialog.Builder(this@MainActivity)
                alert4.setMessage(getText(R.string.alert_haunter))
                alert4.setTitle(getText(R.string.alert_tittle_haunter))
                alert4.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.haunter_poke))
                alert4.setNeutralButton(getText(R.string.neutral_button), null)
                alert4.show()
                return true
            }
        })

        buttonAlertGengar.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert5 = AlertDialog.Builder(this@MainActivity)
                alert5.setMessage(getText(R.string.alert_gengar))
                alert5.setTitle(getText(R.string.alert_tittle_gengar))
                alert5.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.gengar_poke))
                alert5.setNeutralButton(getText(R.string.neutral_button), null)
                alert5.show()
                return true
            }
        })

        buttonAlertAbra.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert6 = AlertDialog.Builder(this@MainActivity)
                alert6.setMessage(getText(R.string.alert_abra))
                alert6.setTitle(getText(R.string.alert_tittle_abra))
                alert6.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.abra_poke))
                alert6.setNeutralButton(getText(R.string.neutral_button), null)
                alert6.show()
                return true
            }
        })

        buttonAlertKadabra.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert7 = AlertDialog.Builder(this@MainActivity)
                alert7.setMessage(getText(R.string.alert_kadabra))
                alert7.setTitle(getText(R.string.alert_tittle_kadabra))
                alert7.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.kadabra_poke))
                alert7.setNeutralButton(getText(R.string.neutral_button), null)
                alert7.show()
                return true
            }
        })

        buttonAlertAlakazam.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert8 = AlertDialog.Builder(this@MainActivity)
                alert8.setMessage(getText(R.string.alert_alakazam))
                alert8.setTitle(getText(R.string.alert_tittle_alakazam))
                alert8.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.alakazam_poke))
                alert8.setNeutralButton(getText(R.string.neutral_button), null)
                alert8.show()
                return true
            }
        })

        buttonAlertCharmander.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert9 = AlertDialog.Builder(this@MainActivity)
                alert9.setMessage(getText(R.string.alert_charmander))
                alert9.setTitle(getText(R.string.alert_tittle_charmander))
                alert9.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.charmander_poke))
                alert9.setNeutralButton(getText(R.string.neutral_button), null)
                alert9.show()
                return true
            }
        })

        buttonAlertCharmeleon.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert10 = AlertDialog.Builder(this@MainActivity)
                alert10.setMessage(getText(R.string.alert_charmeleon))
                alert10.setTitle(getText(R.string.alert_tittle_charmeleon))
                alert10.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.charmeleon_poke))
                alert10.setNeutralButton(getText(R.string.neutral_button), null)
                alert10.show()
                return true
            }
        })

        buttonAlertCharizard.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert11 = AlertDialog.Builder(this@MainActivity)
                alert11.setMessage(getText(R.string.alert_charizard))
                alert11.setTitle(getText(R.string.alert_tittle_charizard))
                alert11.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.charizard_poke))
                alert11.setNeutralButton(getText(R.string.neutral_button), null)
                alert11.show()
                return true
            }
        })

        buttonAlertMegacharizard.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alert12 = AlertDialog.Builder(this@MainActivity)
                alert12.setMessage(getText(R.string.alert_megacharizard))
                alert12.setTitle(getText(R.string.alert_tittle_megacharizard))
                alert12.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.megacharizard_poke))
                alert12.setNeutralButton(getText(R.string.neutral_button), null)
                alert12.show()
                return true
            }
        })
    }

}