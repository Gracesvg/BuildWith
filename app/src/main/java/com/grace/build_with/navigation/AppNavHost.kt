package com.grace.build_with.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.screens.architecture_photos.Architecture_Photos
import com.grace.build_with.screens.bathroom_project.BathroomProjectScreen
import com.grace.build_with.screens.bookmarks.BookmarkScreen
import com.grace.build_with.screens.cloackroom.Cloakroom_Photos
import com.grace.build_with.screens.contact_information.ContactInformationScreen
import com.grace.build_with.screens.decor.Decor_Photos
import com.grace.build_with.screens.dining.Dining_Photos
import com.grace.build_with.screens.diy.Diy_Photos
import com.grace.build_with.screens.electrical_installations_project.ElectricalInstallationsProjectScreen
import com.grace.build_with.screens.floor_work_project.FloorWorkProjectScreen
import com.grace.build_with.screens.furniture_design_project.FurnitureDesignProjectScreen
import com.grace.build_with.screens.gardening_project.GardeningProjectScreen
import com.grace.build_with.screens.general_information.GeneralInformationScreen
import com.grace.build_with.screens.home.HomeScreen
import com.grace.build_with.screens.house_building_project.HouseBuildingProjectScreen
import com.grace.build_with.screens.interior_design_project.InteriorDesignProjectScreen
import com.grace.build_with.screens.kitchen.Kitchen_Photos
import com.grace.build_with.screens.kitchen_planning_project.KitchenPlanningProjectScreen
import com.grace.build_with.screens.login.LoginScreen
import com.grace.build_with.screens.magazine.MagazineScreen
import com.grace.build_with.screens.nyumba.Nyumba_Photos
import com.grace.build_with.screens.plumbing_project.PlumbingProjectScreen
import com.grace.build_with.screens.pools.Pool_Photos
import com.grace.build_with.screens.professionals.ProfessionalsScreen
import com.grace.build_with.screens.profile.ProfileScreen
import com.grace.build_with.screens.projects.ProjectsScreen
import com.grace.build_with.screens.renovation_project.RenovationProjectScreen
import com.grace.build_with.screens.roof_project.RoofProjectScreen
import com.grace.build_with.screens.settings.SettingsScreen
import com.grace.build_with.screens.signup.SignupScreen
import com.grace.build_with.screens.sleeping_area.Bedroom_Photos
import com.grace.build_with.screens.tile_work_project.TileWorkProjectScreen
import com.grace.build_with.screens.yard.Yard_Photos

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController()) {
    NavHost(navController = navController,
        modifier=modifier,
        startDestination =BottomBarScreen.Home.route){

//        Screens with the bottombar
        composable(route=BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route=BottomBarScreen.Magazine.route){
            MagazineScreen(navController)
        }
        composable(route=BottomBarScreen.Professionals.route){
            ProfessionalsScreen(navController)
        }
        composable(route=BottomBarScreen.Bookmarks.route){
            BookmarkScreen(navController)
        }

//        SCREENS WITH NO BOTTOMBAR
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUTE_PROFILE){
            ProfileScreen(navController)
        }
        composable(ROUTE_SETTINGS){
            SettingsScreen(navController)
        }
        composable(ROUTE_PROJECTS){
            ProjectsScreen(navController)
        }
        composable(ROUTE_BATHROOM){
            BathroomProjectScreen(navController)
        }
        composable(ROUTE_GENERAL_INFORMATION){
           GeneralInformationScreen(navController)
        }
        composable(ROUTE_CONTACT_INFORMATION){
           ContactInformationScreen(navController)
        }
//        composable(ROUTE_PUBLISH){
//           PublishScreen(navController)
//        }
        composable(ROUTE_ELECTRICAL_INSTALLATIONS){
            ElectricalInstallationsProjectScreen(navController)
        }
        composable(ROUTE_FLOOR_WORK){
            FloorWorkProjectScreen(navController)
        }
        composable(ROUTE_FURNITURE_DESIGN){
            FurnitureDesignProjectScreen(navController)
        }
        composable(ROUTE_GARDENING){
            GardeningProjectScreen(navController)
        }
        composable(ROUTE_HOUSE_BUILDING){
            HouseBuildingProjectScreen(navController)
        }
        composable(ROUTE_KITCHEN_PLANNING){
            KitchenPlanningProjectScreen(navController)
        }
        composable(ROUTE_INTERIOR_DESIGN){
            InteriorDesignProjectScreen(navController)
        }
        composable(ROUTE_PLUMBING){
            PlumbingProjectScreen(navController)
        }
        composable(ROUTE_RENOVATION){
            RenovationProjectScreen(navController)
        }
        composable(ROUTE_ROOF_PROJECT){
            RoofProjectScreen(navController)
        }
        composable(ROUTE_TILE_WORK){
            TileWorkProjectScreen(navController)
        }


//        composables with images only


        composable(route=ROUTE_BEDROOM){
            Bedroom_Photos(navController)
        }
        composable(route=ROUTE_BATH_AREA){
            Cloakroom_Photos(navController)
        }
        composable(route=ROUTE_DECOR){
            Decor_Photos(navController)
        }
        composable(route=ROUTE_ARCHITECTURE_PHOTOS){
            Architecture_Photos(navController)
        }
        composable(route=ROUTE_DIY_PHOTOS){
            Diy_Photos(navController)
        }
        composable(route=ROUTE_GARDEN){
            Yard_Photos(navController)
        }
        composable(route=ROUTE_HOUSES){
            Nyumba_Photos(navController)
        }
        composable(route=ROUTE_POOLS){
            Pool_Photos(navController)
        }
        composable(route=ROUTE_KITCHEN){
            Kitchen_Photos(navController)
        }
        composable(route=ROUTE_DINING){
            Dining_Photos(navController)
        }







    }
}
