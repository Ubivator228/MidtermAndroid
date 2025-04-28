import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myhobbyapp.DetailsScreen
import com.example.myhobbyapp.HobbyViewModel

@Composable
fun HobbyScreen(viewModel: HobbyViewModel, navController: NavHostController) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "hobby_screen") {

//        composable("hobby_screen") {
//            HobbyScreen(viewModel = viewModel, navController = navController)
//        }

        composable(
            "detail_screen/{hobbyId}",
            arguments = listOf(navArgument("hobbyId") { type = NavType.StringType })
        ) { backStackEntry ->
            val hobbyId = backStackEntry.arguments?.getString("hobbyId") ?: ""
            DetailsScreen(hobbyId = hobbyId, viewModel = viewModel)
        }
    }
}
