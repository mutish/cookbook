package com.example.cookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cookbook.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                TransparentStatusBar()
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "home") {
                        composable("home") {
                            HomeScreen(onDetailsClick = { id ->
                                navController.navigate("details/id=$id?name=hi")
                            },
                                onAboutClick = {
                                    navController.navigate("About")
                                })
                        }
                        composable("About") {
                            AboutScreen(onNavigateUp = {
                                navController.popBackStack()
                            })
                        }
                        composable(
                            "details/id={id}?name={name}",
                            arguments = listOf(navArgument("id") {
                                type = NavType.LongType
                            },
                                navArgument("name") {
                                    type = NavType.StringType
                                    nullable = false
                                }),
                        ) {
                            val arguments =
                                requireNotNull(it.arguments)
                            val id = arguments.getLong("id")
                            val name = arguments.getString("name")

                            DetailsScreen(id, name) {
                                navController.popBackStack()
                            }


                        }
                    }

                }
            }


        }
    }

    @Composable
    private fun TransparentStatusBar() {
        val status = MaterialTheme.colors.background
        SideEffect {
            window.statusBarColor = status.toArgb()
            window.navigationBarColor = status.toArgb()
        }
    }


    //callback functions -> a fun that is passed to another fun as an argument
    @Composable
    fun AboutScreen(onNavigateUp: () -> Unit) {
        //Scaffold -> inbuilt composable function that can create a TopApp Bar, Bottom Nav bar & other UI Elements
        Scaffold {
            Column(Modifier.padding(it)) {
                AppBar(title = "About", onNavigateUp)
                Spacer(Modifier.height(20.dp))
                Column(Modifier.padding(16.dp)) {
                    Text("Welcome to my cookbook store.")
                    Spacer(Modifier.height(20.dp))
                    val na = LocalUriHandler.current
                    Button(onClick = {
                        na.openUri("https://www.youtube.com/results?search_query=cooking+recipes")
                    }) {
                        Text("Learn more cooking recipes here")
                    }
                }

            }

        }

    }

    @Composable
    fun AppBar(title: String, onNavigateUp: () -> Unit) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            IconButton(onClick = onNavigateUp) {
                Icon(Icons.Rounded.ArrowBack, contentDescription = "Go Back")
                Spacer(Modifier.width(10.dp))
                Text(title, style = MaterialTheme.typography.h6)

            }

        }

    }
}





