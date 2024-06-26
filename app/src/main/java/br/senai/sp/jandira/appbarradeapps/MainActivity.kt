package br.senai.sp.jandira.appbarradeapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.appbarradeapps.ui.theme.AppBarraDeAppsTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarraDeAppsTheme {

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exemplo() {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("app bar do alto")
                }
            )},

bottomBar = {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Bottom app bar",
        )
    }
},
floatingActionButton = {
    FloatingActionButton(onClick = {}) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                "Alice LINDA".trimIndent(),
            )

            Preview (showBackground = true, showSystemUi = true)
            @Composable
            fun GreetingPreview(showBackground: Boolean = true) {
                AppBarraDeAppsTheme {
                    Exemplo()
                }
            }
        }
    }
}