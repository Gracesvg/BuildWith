package com.grace.build_with.screens.bathroom_project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.grace.build_with.R
import com.grace.build_with.navigation.ROUTE_HOME


data class Content(
    val id:Int,
    val title:String,
    val desc: String,
)
const val EXPANSION_ANIMATION_DURATION =300
const val LOREM_TEXT ="lorem ipsum"
val contentList = listOf(
    Content(0,"What is your request?", LOREM_TEXT),
    Content(0,"How big is the bathroom?",LOREM_TEXT ),
    Content(0,"Need to renew/ install tiles?", LOREM_TEXT),
    Content(0,"Need to install underfloor heating?",LOREM_TEXT ),
    Content(0,"Barrier-free bathroom?",LOREM_TEXT ),
)

@Composable
fun ExpandableCard(
    content: Content,
    expanded:Boolean,
    onClickExpanded:(id:Int)-> Unit
){
    val transition = updateTransition(targetState = expanded,
        label = "transition")
    val iconRotationDeg by transition.animateFloat(label = "icon change") {
            state ->
        if (state){
            0f
        }else{
            180f
        }
    }

    Card(
        colors = CardDefaults.cardColors(Color(0xFF94AD95)),
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween)
            {
                Text(text = content.title)
                Icon(imageVector = Icons.Default.KeyboardArrowUp,
                    contentDescription =null,
                    modifier = Modifier
                        .rotate(iconRotationDeg)
                        .clickable { onClickExpanded(content.id) }
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            ExpandableContent(isExpanded = expanded,
                desc =content.desc )

        }

    }
}
@Composable
fun ExpandableContent(
    isExpanded:Boolean,
    desc: String
)

{
    val enterTransition = remember{
        expandVertically(
            expandFrom = Alignment.Top,
            animationSpec = tween(EXPANSION_ANIMATION_DURATION)
        ) + fadeIn(initialAlpha = 3f,
            animationSpec = tween(EXPANSION_ANIMATION_DURATION),
        )
    }
    val exitTransition = remember{
        shrinkVertically (
            shrinkTowards = Alignment.Top,
            animationSpec = tween(EXPANSION_ANIMATION_DURATION)
        ) + fadeOut(animationSpec = tween(EXPANSION_ANIMATION_DURATION))

    }
    AnimatedVisibility(
        visible = isExpanded,
        enter = enterTransition,
        exit = exitTransition)
    {
        Text(text = desc,
            textAlign = TextAlign.Justify)

    }

}
@Composable
fun BathroomProjectScreen(navController: NavHostController) {
    var expandedItem by remember {
        mutableStateOf(-1)
    }
    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0x7EF1F1F1)),
    ) {
    }

    Column{

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.KeyboardArrowLeft,
                null,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .size(32.dp)
                    .clickable { navController.navigate(ROUTE_HOME) },
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(25.dp))


            Text(
                "Bathroom Project",
                modifier = Modifier.padding(20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                fontFamily = FontFamily.SansSerif
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            contentPadding = PaddingValues(start = 15.dp, end = 15.dp),
            verticalArrangement =Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(contentList) { content ->
                ExpandableCard(
                    content = content,
                    expanded = expandedItem == content.id,
                    onClickExpanded = { id ->
                        expandedItem = if (expandedItem == id) {
                            -1
                        } else {
                            id
                        }
                    }
                )

            }
        }


    }
}




@Preview(showBackground = true)
@Composable
fun BathroomProjectScreenPreview() {
    BathroomProjectScreen(rememberNavController())
}
