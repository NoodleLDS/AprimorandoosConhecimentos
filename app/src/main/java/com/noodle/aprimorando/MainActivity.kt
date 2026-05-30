package com.noodle.aprimorando

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.noodle.aprimorando.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(
                view,
                "Contato: aprimorandoconhecimentosuftm@gmail.com",
                Snackbar.LENGTH_LONG
            ).setAction("OK", null).show()
        }

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        // Cada item do menu lateral é um destino de topo (top-level destination),
        // então nenhum deles exibe a seta de "voltar" na toolbar.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_conheca_o_aprimorando,
                R.id.nav_conheca_a_UFTM,
                R.id.nav_regu_graduacao,
                R.id.nav_dir_dev_discentes,
                R.id.nav_pro_reitorias,
                R.id.nav_inst_uftm,
                R.id.nav_diretorios_academicos,
                R.id.nav_ligas,
                R.id.nav_iniciacao_cientifica,
                R.id.nav_coordenacoes,
                R.id.nav_mural_de_informacoes,
                R.id.nav_calendario_academico
            ),
            drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
