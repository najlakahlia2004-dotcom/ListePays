package com.example.listepays

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewProduits)

        // Charger le tableau de produits défini dans strings.xml
        val products = resources.getStringArray(R.array.products)

        // Créer l’adaptateur : lie les données au ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, products)
        listView.adapter = adapter

        // Gérer le clic sur un élément
        listView.setOnItemClickListener { parent, _, position, _ ->
            val item = parent.getItemAtPosition(position).toString()
            Toast.makeText(this, "Produit sélectionné : $item", Toast.LENGTH_SHORT).show()
        }
    }
}
