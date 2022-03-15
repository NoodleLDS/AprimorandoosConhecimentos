package com.noodle.aprimorando

import android.os.Bundle
import android.view.Menu
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDestination
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
            Snackbar.make(view, "Botao de envio Whatsapp", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        // Mudar aqui no controller
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration(
            setOf(
                R.id.nav_conheca_o_aprimorando, R.id.nav_conheca_a_UFTM, R.id.nav_regu_graducao, R.id.nav_dir_dev_discentes, R.id.nav_pro_reitorias, R.id.nav_inst_uftm, R.id.nav_diretorios_academicos, R.id.nav_ligas, R.id.nav_iniciacao_cientifica, R.id.nav_coordenacoes, R.id.nav_mural_de_informacoes
            ), drawerLayout
        ).also { appBarConfiguration = it }
        navView.setupWithNavController(navController)

        setupActionBarWithNavController(navController, appBarConfiguration)

    }

    private fun setupNavigation() {
        // first find the nav controller
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        val drawerLayout: DrawerLayout = binding.drawerLayout

        setSupportActionBar(binding.appBarMain.toolbar)

        AppBarConfiguration(
            setOf(
                R.id.nav_conheca_o_aprimorando, R.id.nav_conheca_a_UFTM, R.id.nav_regu_graducao, R.id.nav_dir_dev_discentes, R.id.nav_pro_reitorias, R.id.nav_inst_uftm, R.id.nav_diretorios_academicos, R.id.nav_ligas, R.id.nav_iniciacao_cientifica, R.id.nav_coordenacoes, R.id.nav_mural_de_informacoes
            ), drawerLayout
        ).also { appBarConfiguration = it }


        // then setup the action bar, tell it about the DrawerLayout
        setupActionBarWithNavController(navController, drawerLayout)

        // finally setup the left drawer (called a NavigationView)
        binding.navView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            val toolBar = supportActionBar ?: return@addOnDestinationChangedListener
            when(destination.id) {
                R.id.home -> {
                    toolBar.setDisplayShowTitleEnabled(false)
                }
                else -> {
                    toolBar.setDisplayShowTitleEnabled(true)
                }
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}