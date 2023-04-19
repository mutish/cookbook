package com.example.cookbook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalUriHandler
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
                            AboutScreen()
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
    fun AboutScreen() {
        //Scaffold -> inbuilt composable function that can create a TopApp Bar, Bottom Nav bar & other UI Elements
        Scaffold {
            Column(Modifier.padding(it)) {

                    val na = LocalUriHandler.current
                        na.openUri("https://youtu.be/9OAPCV2ev14")

                    }


            }

        }

    }









