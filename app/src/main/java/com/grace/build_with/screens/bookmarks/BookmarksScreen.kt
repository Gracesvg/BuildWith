package com.grace.build_with.screens.bookmarks

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton
import androidx.compose.material.TabRow
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.navigation.ROUTE_PROFESSIONALS
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class,
    ExperimentalStdlibApi::class
)
@Composable
fun BookmarkScreen(navController: NavHostController) {
//    val scope= rememberCoroutineScope()
//    val pagerState = rememberPagerState(pageCount ={ entries.size})
//    val selectedTabIndex = remember {derivedStateOf { pagerState.currentPage }}
    var bottomState by remember {
        mutableStateOf("")
    }



    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0x7EF1F1F1))) {
    }
    Spacer(modifier = Modifier.height(50.dp))

    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "BookMarks",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(20.dp))




//        Scaffold(){
//            TabRow(selectedTabIndex = selectedTabIndex.value,
//                modifier = Modifier.fillMaxWidth()) {
//                entries.forEachIndexed { index, currentTab ->
//                    Tab(selected = selectedTabIndex.value== index,
//                        selectedContentColor = Color.White,
//                        unselectedContentColor = Color.Black,
//                        onClick = { scope.launch {
//                            pagerState.animateScrollToPage(currentTab.ordinal)
//                        }
//                        },
//                        text = { Text(text =currentTab.text )},
//                        icon = {
//                            Icon(
//                                imageVector = if (selectedTabIndex.value == index)
//                                    currentTab.selectedIcon else currentTab.unselectedIcon,
//                                contentDescription = "Tab Icon"
//                            )
//                        }
//                    )
//                }
//            }
//            HorizontalPager(state = pagerState,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .weight(1f)
//            ) {
//                Box (modifier = Modifier.fillMaxSize(),
//                    contentAlignment = Alignment.Center)
//                {
//                    Text(text = entries[selectedTabIndex.value].text)
//
//                }
//
//            }
//        }
//
    }
}

enum class HomeTabs(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val text: String,
){
    Professionals(
        unselectedIcon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
        text ="BROWSE PROFESSIONALS"
    ),
    Rooms(
        unselectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        text ="BROWSE PHOTOS"
    ),
    Magazine(
        unselectedIcon = Icons.Outlined.DateRange,
        selectedIcon = Icons.Filled.DateRange,
        text ="BROWSE ARTICLES",
    ),
    Projects(
        unselectedIcon = Icons.Outlined.Build,
        selectedIcon = Icons.Filled.Build,
        text = "Projects"
    )

}

@Preview(showBackground = true)
@Composable
fun BookmarkScreenPreview() {
    BookmarkScreen(rememberNavController())
}