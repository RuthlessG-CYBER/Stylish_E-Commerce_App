package com.example.stylishapp.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.stylishapp.R
import com.example.stylishapp.datas.itemDetails
import com.example.stylishapp.datas.itemImages
import com.example.stylishapp.datas.itemPrice
import com.example.stylishapp.datas.itemTitle


@Composable
fun TrendingProducts(navController: NavController){
    var search by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize())
    {
        Spacer(Modifier.height(30.dp))

        Card(modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(start = 5.dp, end = 7.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(2.dp))
            {
                IconButton(onClick = {},
                    modifier = Modifier
                        .align(Alignment.TopStart)
                )
                {
                    Image(painter = painterResource(R.drawable.menu),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                IconButton(onClick = {navController.navigate("Profile")},
                    modifier = Modifier.align(Alignment.BottomEnd)
                )
                {
                    Image(
                        painter = painterResource(R.drawable.profile),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Card(modifier = Modifier
                    .height(31.dp)
                    .width(111.dp)
                    .align(Alignment.Center),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Image(painter = painterResource(R.drawable.stylishbanner),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }

        Spacer(Modifier.height(6.dp))

        OutlinedTextField(
            modifier = Modifier
                .height(48.dp)
                .width(385.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(10.dp),
            value = search,
            onValueChange = { search = it },
            placeholder = { Text("Search",
                style = TextStyle(fontSize = 15.sp, lineHeight = 28.sp)
                )},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Email Icon"
                )
            },
            trailingIcon = {
                Icon(painter = painterResource( R.drawable.voice),
                    contentDescription = "",
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                )
            }
        )
        Spacer(Modifier.height(6.dp))

        Card(modifier = Modifier
            .height(30.dp)
            .width(395.dp)
            .align(Alignment.CenterHorizontally),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp)){
                Card(modifier = Modifier
                    .align(Alignment.CenterStart),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ){
                    Text("52,082+ Items",
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Row(modifier = Modifier
                    .height(30.dp)
                    .width(100.dp)
                    .align(Alignment.CenterEnd))
                {
                    ElevatedCard(modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        shape = RoundedCornerShape(2.dp)
                    )
                    {
                        Box(modifier = Modifier.fillMaxSize()){
                            Text("Sort",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(2.dp).align(Alignment.CenterStart)
                            )
                            Image(painter = painterResource(R.drawable.sort),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(15.dp)
                                    .width(15.dp)
                                    .align(Alignment.CenterEnd),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                    ElevatedCard(modifier = Modifier
                        .width(50.dp)
                        .padding(2.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        shape = RoundedCornerShape(2.dp)
                    )
                    {
                        Box(modifier = Modifier
                            .fillMaxSize()
                        ){
                            Text("Filter",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(2.dp).align(Alignment.CenterStart)
                            )
                            Image(painter = painterResource(R.drawable.filter),
                                contentDescription = "",
                                modifier = Modifier.height(13.dp).width(12.dp).align(Alignment.CenterEnd),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }

                }
            }
        }

        LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2),
            verticalItemSpacing = 5.dp,
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier
                .padding(start = 10.dp, top = 5.dp, end = 10.dp)
                .align(Alignment.CenterHorizontally)
            )
        {
            items(itemImages.size){ index ->
                OutlinedCard(modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Card(modifier = Modifier
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Image(painter = painterResource(itemImages[index]),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Card(modifier = Modifier,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Spacer(Modifier.height(10.dp))

                        Text(
                            itemTitle[index],
                            fontWeight = FontWeight.ExtraBold,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .padding(start = 4.dp),
                            fontSize = 17.sp
                        )

                        Spacer(Modifier.height(2.dp))

                        Text(
                            itemDetails[index],
                            modifier = Modifier
                                .padding(start = 4.dp),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle.Normal
                        )

                        Spacer(Modifier.height(5.dp))

                        Text(
                            itemPrice[index],
                            fontWeight = FontWeight.Black,
                            fontSize = 17.sp,
                            modifier = Modifier
                                .padding(start = 7.dp)
                        )

                        Spacer(Modifier.height(5.dp))

                    }

                }

            }
            
        }
    }
}