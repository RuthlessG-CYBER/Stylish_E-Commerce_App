package com.example.stylishapp.homeScreen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState


import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.stylishapp.R
import com.example.stylishapp.datas.banner
import com.example.stylishapp.datas.images
import com.example.stylishapp.datas.text
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun HomePage(navController: NavController){

    // Back Button Handler
    BackHandler{}
    var search by remember { mutableStateOf("") }

    // All the datas are present on productsdata file

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.width(300.dp),
                drawerShape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp),
                drawerContainerColor = Color.White
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    "Menu",
                    modifier = Modifier.padding(16.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Divider()

                // Drawer Items
                DrawerItem("Home", Icons.Default.Home, onClick = { navController.navigate("home") })
                DrawerItem("Profile", Icons.Default.Person, onClick = { navController.navigate("profile") })
                DrawerItem("Settings", Icons.Default.Settings, onClick = { navController.navigate("settings") })
                DrawerItem("Logout", Icons.Default.ExitToApp, onClick = { navController.navigate("login") })
            }
        }
    ) {
        // Bottom Navigation Bar
        Scaffold(
            bottomBar = {
                BottomAppBar(
                    containerColor = Color.LightGray,
                    contentColor = Color.White,
                    modifier = Modifier.height(84.dp).shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 10.dp)
                    )
                ) {
                    Card(
                        modifier = Modifier,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column {
                            Icon(
                                Icons.Default.Home, contentDescription = "Home",
                                modifier = Modifier.height(24.dp).width(24.dp)
                                    .align(Alignment.CenterHorizontally),
                                tint = Color.Black
                            )
                            Text(
                                text = "Home",
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                    .padding(start = 5.dp, end = 5.dp),
                                color = Color.Black
                            )
                        }
                    }

                    Spacer(Modifier.weight(1f))

                    Card(
                        modifier = Modifier,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column {
                            Icon(
                                Icons.Default.FavoriteBorder, contentDescription = "Wishlist",
                                modifier = Modifier.height(24.dp).width(24.dp)
                                    .align(Alignment.CenterHorizontally),
                                tint = Color.Black
                            )
                            Text(
                                text = "Wishlist",
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                    .padding(start = 5.dp, end = 5.dp),
                                color = Color.Black
                            )
                        }
                    }
                    Spacer(Modifier.weight(1f))

                    Card(
                        modifier = Modifier.size(60.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFEB3030)
                        ),
                        shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp),
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                Icons.Default.ShoppingCart, contentDescription = "Cart",
                                modifier = Modifier.size(40.dp),
                                tint = Color.White
                            )
                        }
                    }

                    Spacer(Modifier.weight(1f))

                    Card(
                        modifier = Modifier,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column {
                            Icon(
                                Icons.Default.Search, contentDescription = "Search",
                                modifier = Modifier.height(24.dp).width(24.dp)
                                    .align(Alignment.CenterHorizontally),
                                tint = Color.Black
                            )
                            Text(
                                text = "Search",
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                    .padding(start = 5.dp, end = 5.dp),
                                color = Color.Black
                            )
                        }
                    }

                    Spacer(Modifier.weight(1f))

                    Card(
                        modifier = Modifier,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Column {
                            Icon(
                                Icons.Default.Settings, contentDescription = "Setting",
                                modifier = Modifier.height(24.dp).width(24.dp)
                                    .align(Alignment.CenterHorizontally),
                                tint = Color.Black
                            )
                            Text(
                                text = "Setting",
                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                    .padding(start = 5.dp, end = 5.dp),
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        ) { innerPadding ->
            // Content of the screen
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            )
            {
                Card(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(2.dp)
                    )
                    {
                        IconButton(
                            onClick = {
                                scope.launch {
                                    drawerState.open()
                                }
                            },
                            modifier = Modifier.align(Alignment.TopStart)
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.menu),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        IconButton(
                            onClick = { navController.navigate("profile") },
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.profile),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Card(
                            modifier = Modifier
                                .height(31.dp)
                                .width(125.dp)
                                .align(Alignment.Center),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.stylishbanner),
                                contentDescription = "",
                                modifier = Modifier.height(31.dp).width(125.dp)
                            )
                        }
                    }
                }

                Spacer(Modifier.height(6.dp))

                Surface(
                    modifier = Modifier
                        .height(55.dp)
                        .width(385.dp)
                        .align(Alignment.CenterHorizontally),
                    shadowElevation = 8.dp,
                    shape = RoundedCornerShape(10.dp),
                    color = Color.White
                ) {
                    BasicTextField(
                        value = search,
                        onValueChange = { search = it },
                        singleLine = true,
                        decorationBox = { innerTextField ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(horizontal = 16.dp)
                                    .fillMaxSize()
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "Search Icon",
                                    tint = Color.Gray
                                )
                                Spacer(Modifier.width(10.dp))
                                Box(
                                    modifier = Modifier.weight(1f),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    if (search.isEmpty()) {
                                        Text(
                                            "Search",
                                            style = TextStyle(fontSize = 15.sp, color = Color.Gray)
                                        )
                                    }
                                    innerTextField()
                                }
                                Spacer(Modifier.width(10.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.voice),
                                    contentDescription = "Voice Icon",
                                    modifier = Modifier
                                        .size(20.dp),
                                    tint = Color.Gray
                                )
                            }
                        }
                    )
                }

                Spacer(Modifier.height(6.dp))

                Card(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState()),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Card(
                        modifier = Modifier
                            .height(30.dp)
                            .width(390.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp, end = 10.dp)
                        )
                        {
                            Card(
                                modifier = Modifier
                                    .align(Alignment.CenterStart),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Text(
                                    "All Featured",
                                    modifier = Modifier,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .height(30.dp)
                                    .width(110.dp)
                                    .align(Alignment.CenterEnd)
                            )
                            {
                                OutlinedCard(
                                    modifier = Modifier
                                        .width(50.dp)
                                        .padding(top = 2.dp, bottom = 2.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    ),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(start = 2.dp, end = 2.dp)
                                    ) {
                                        Text(
                                            "Sort",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium,
                                            modifier = Modifier
                                                .padding(2.dp)
                                                .align(Alignment.CenterStart)
                                        )
                                        Image(
                                            painter = painterResource(R.drawable.sort),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .height(13.dp)
                                                .width(12.dp)
                                                .align(Alignment.CenterEnd),
                                            contentScale = ContentScale.Crop
                                        )
                                    }
                                }
                                Spacer(Modifier.width(3.dp))
                                OutlinedCard(
                                    modifier = Modifier
                                        .width(52.dp)
                                        .padding(top = 2.dp, bottom = 2.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    ),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize().padding(start = 2.dp, end = 2.dp)
                                    )
                                    {
                                        Text(
                                            "Filter",
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Medium,
                                            modifier = Modifier
                                                .padding(2.dp)
                                                .align(Alignment.CenterStart)
                                        )
                                        Image(
                                            painter = painterResource(R.drawable.filter),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .height(13.dp).width(12.dp)
                                                .align(Alignment.CenterEnd),
                                            contentScale = ContentScale.Crop
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(10.dp))

                    Card(
                        modifier = Modifier
                            .height(75.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        LazyRow(
                            modifier = Modifier
                                .height(75.dp)
                        )
                        {
                            items(images.size and text.size) { index ->
                                Spacer(Modifier.padding(start = 8.dp))
                                Card(
                                    modifier = Modifier
                                        .height(71.dp)
                                        .width(56.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Transparent
                                    )
                                )
                                {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize()
                                    )
                                    {
                                        Card(
                                            modifier = Modifier
                                                .height(56.dp)
                                                .width(56.dp),
                                            shape = RoundedCornerShape(1.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent,
                                                contentColor = Color.Transparent
                                            )
                                        )
                                        {
                                            Image(
                                                painter = painterResource(images[index]),
                                                contentDescription = "",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop
                                            )
                                        }
                                        Card(
                                            modifier = Modifier.height(11.dp).width(56.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent,
                                                contentColor = Color.Transparent
                                            )
                                        )
                                        {
                                            Text(
                                                text[index],
                                                fontSize = 10.sp,
                                                color = Color.Black,
                                                modifier = Modifier.align(Alignment.CenterHorizontally)
                                            )
                                        }
                                    }
                                }
                                Spacer(Modifier.width(10.dp))
                            }
                        }
                    }

                    Spacer(Modifier.height(1.dp))


                    // Track the current index for the slider
                    var currentIndex by remember { mutableStateOf(0) }
                    val listState = rememberLazyListState() // State for scrolling
                    val coroutineScope = rememberCoroutineScope()

                    // Auto-scroll logic using LaunchedEffect
                    LaunchedEffect(banner.size) {
                        while (true) {
                            delay(4000) // Wait for the specified duration
                            val nextIndex = (currentIndex + 1) % banner.size
                            coroutineScope.launch {
                                listState.animateScrollToItem(nextIndex)
                            }
                            currentIndex = nextIndex
                        }
                    }

                    Card(
                        modifier = Modifier.height(150.dp).width(380.dp)
                            .align(Alignment.CenterHorizontally),
                        shape = RoundedCornerShape(20.dp)
                    )
                    {
                        LazyRow(
                            state = listState,
                            modifier = Modifier
                                .width(380.dp)
                                .height(150.dp)

                        ) {
                            items(banner.size) { index ->
                                Card(modifier = Modifier.fillMaxSize())
                                {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Image(
                                            painter = painterResource(banner[index]),
                                            contentDescription = "",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .width(380.dp)
                                                .height(150.dp)
                                        )
                                        Card(
                                            modifier = Modifier
                                                .height(105.dp)
                                                .width(180.dp)
                                                .align(Alignment.CenterStart),
                                            colors = CardDefaults.cardColors(
                                                contentColor = Color.White,
                                                containerColor = Color.Transparent
                                            )
                                        ) {
                                            Card(
                                                modifier = Modifier
                                                    .align(Alignment.CenterHorizontally),
                                                colors = CardDefaults.cardColors(
                                                    contentColor = Color.White,
                                                    containerColor = Color.Transparent
                                                )
                                            ) {
                                                Text(
                                                    "40-50% OFF",
                                                    fontSize = 25.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.White
                                                )
                                                Text("Now in (product)")
                                                Text("All colours")
                                                Spacer(Modifier.height(5.dp))
                                                OutlinedCard(
                                                    onClick = {},
                                                    modifier = Modifier
                                                        .height(30.dp)
                                                        .width(100.dp),
                                                    shape = RoundedCornerShape(10.dp),
                                                    colors = CardDefaults.cardColors(
                                                        containerColor = Color.Transparent,
                                                        contentColor = Color.White
                                                    )
                                                )
                                                {
                                                    Text(
                                                        "Shop Now->",
                                                        fontSize = 17.sp,
                                                        modifier = Modifier.padding(
                                                            top = 5.dp,
                                                            start = 5.dp
                                                        )
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(5.dp))

                    Card(
                        modifier = Modifier
                            .height(60.dp)
                            .width(380.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF0f80d4)
                        )
                    ) {
                        Box {
                            Card(
                                modifier = Modifier
                                    .padding(
                                        top = 7.dp,
                                        start = 20.dp
                                    ),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF0f80d4),
                                    contentColor = Color.White
                                )
                            )
                            {
                                Text(
                                    "Deal of the Day",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Black,
                                    fontStyle = FontStyle.Normal
                                )
                                Text(
                                    "22h 55m 20s remaining",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontStyle = FontStyle.Italic
                                )
                            }
                            OutlinedCard(
                                modifier = Modifier
                                    .padding(
                                        start = 265.dp,
                                        top = 12.dp,
                                        end = 10.dp
                                    )
                                    .height(35.dp)
                                    .width(95.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF0f80d4),
                                    contentColor = Color.White
                                )
                            )
                            {
                                TextButton(
                                    onClick = { navController.navigate("trendingproducts") },
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(start = 2.dp, end = 2.dp)
                                )
                                {
                                    Text(
                                        "View All",
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Normal,
                                        fontStyle = FontStyle.Italic,
                                        color = Color(0xFFFFFFFF)
                                    )
                                }
                            }
                        }
                    }
                    Spacer(Modifier.height(6.dp))
                    Row(
                        modifier = Modifier
                            .height(230.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    {
                        Card(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(190.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            {
                                Card(
                                    modifier = Modifier
                                        .height(124.dp)
                                        .fillMaxWidth(),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Image(
                                        painter = painterResource(R.drawable.image1),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 124.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Spacer(Modifier.height(10.dp))

                                    Text(
                                        "Women Printed Kurta",
                                        fontWeight = FontWeight.ExtraBold,
                                        fontStyle = FontStyle.Italic,
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 17.sp
                                    )

                                    Spacer(Modifier.height(2.dp))

                                    Text(
                                        "This is the best kurta and it is arrived in valuable price",
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Medium,
                                        fontStyle = FontStyle.Normal
                                    )

                                    Spacer(Modifier.height(5.dp))

                                    Text(
                                        "₹1500",
                                        fontWeight = FontWeight.Black,
                                        fontSize = 17.sp,
                                        modifier = Modifier
                                            .padding(start = 7.dp)
                                    )

                                    Text(
                                        "₹2499",
                                        textDecoration = TextDecoration.LineThrough,
                                        modifier = Modifier
                                            .padding(start = 18.dp),
                                        fontSize = 14.sp
                                    )

                                }
                            }

                        }

                        Spacer(Modifier.width(5.dp))

                        Card(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(190.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            {
                                Card(
                                    modifier = Modifier
                                        .height(124.dp)
                                        .fillMaxWidth()
                                )
                                {
                                    Image(
                                        painter = painterResource(R.drawable.image2),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Card(
                                    modifier = Modifier
                                        .padding(top = 124.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Spacer(Modifier.height(10.dp))

                                    Text(
                                        "HRX by Hrithik Roshan",
                                        fontWeight = FontWeight.ExtraBold,
                                        fontStyle = FontStyle.Italic,
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 17.sp
                                    )

                                    Spacer(Modifier.height(2.dp))

                                    Text(
                                        "Specially recommended for HRX lover",
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Medium,
                                        fontStyle = FontStyle.Normal
                                    )

                                    Spacer(Modifier.height(5.dp))

                                    Text(
                                        "₹2499",
                                        fontWeight = FontWeight.Black,
                                        fontSize = 17.sp,
                                        modifier = Modifier
                                            .padding(start = 7.dp)
                                    )

                                    Text(
                                        "₹4999",
                                        textDecoration = TextDecoration.LineThrough,
                                        modifier = Modifier
                                            .padding(start = 18.dp),
                                        fontSize = 14.sp
                                    )

                                }
                            }

                        }

                    }

                    Spacer(Modifier.height(5.dp))

                    Card(
                        modifier = Modifier
                            .height(80.dp)
                            .width(380.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFdcddd6)
                        )
                    )
                    {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        {
                            Card(
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(100.dp)
                                    .padding(start = 25.dp)
                                    .align(Alignment.CenterStart),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Image(
                                    painter = painterResource(R.drawable.specialoffer),
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Card(
                                modifier = Modifier
                                    .height(35.dp)
                                    .padding(start = 150.dp, top = 10.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Row {

                                    Card(
                                        modifier = Modifier,
                                        colors = CardDefaults.cardColors(
                                            containerColor = Color.Transparent
                                        )
                                    )
                                    {
                                        Text(
                                            "Special Offers",
                                            fontSize = 22.sp,
                                            fontWeight = FontWeight.Black
                                        )
                                    }

                                    Card(
                                        modifier = Modifier
                                            .height(25.dp)
                                            .width(30.dp),
                                        colors = CardDefaults.cardColors(
                                            containerColor = Color.Transparent
                                        )
                                    )
                                    {
                                        Image(
                                            painter = painterResource(R.drawable.emoji),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxSize()

                                        )
                                    }

                                }
                            }
                            Card(
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(335.dp)
                                    .padding(start = 150.dp, top = 35.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Text(
                                    "We make sure you get the offer you need at best prices",
                                    modifier = Modifier.padding(start = 2.dp),
                                    fontSize = 12.sp
                                )
                            }

                        }

                    }

                    Spacer(Modifier.height(5.dp))

                    Card(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                    {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        )
                        {
                            Card(
                                modifier = Modifier
                                    .height(171.dp).width(11.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(R.drawable.line),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }

                            Card(
                                modifier = Modifier.height(151.dp).width(100.dp)
                                    .align(Alignment.CenterStart),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Image(
                                    painter = painterResource(R.drawable.bubble),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }

                            Card(
                                modifier = Modifier.height(130.dp).width(194.dp)
                                    .padding(start = 20.dp)
                                    .align(Alignment.CenterStart),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Image(
                                    painter = painterResource(R.drawable.shoe),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }

                            Card(
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .height(70.dp)
                                    .width(175.dp)
                                    .padding(start = 2.dp, end = 2.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Card(
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(start = 2.dp, end = 2.dp)
                                ) {
                                    Text(
                                        text = "Flat and Heels",
                                        fontSize = 16.sp
                                    )
                                }
                                Card(
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(start = 2.dp, end = 2.dp)
                                ) {
                                    Text(
                                        text = "Stand a chance to get rewarded",
                                        fontSize = 11.sp
                                    )
                                }

                                Spacer(Modifier.height(5.dp))

                                Card(
                                    onClick = {},
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(95.dp)
                                        .align(Alignment.End)
                                        .padding(end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color(0xFFF83758)
                                    ),
                                    shape = RoundedCornerShape(5.dp)
                                )
                                {
                                    Row(modifier = Modifier.fillMaxSize()) {
                                        Text(
                                            "Visit Now",
                                            color = Color.White,
                                            fontSize = 15.sp,
                                            modifier = Modifier.align(Alignment.CenterVertically)
                                                .padding(start = 5.dp)
                                        )

                                        Icon(
                                            Icons.Default.ArrowForward,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier.align(Alignment.CenterVertically)
                                                .padding(end = 3.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(5.dp))

                    Card(
                        modifier = Modifier
                            .height(60.dp)
                            .width(380.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFD6E87)
                        )
                    )
                    {
                        Box {
                            Card(
                                modifier = Modifier
                                    .padding(
                                        top = 7.dp,
                                        start = 20.dp
                                    ),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFFD6E87),
                                    contentColor = Color.White
                                )
                            )
                            {
                                Text(
                                    "Trending Products",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Black,
                                    fontStyle = FontStyle.Normal
                                )
                                Row {
                                    Icon(Icons.Default.DateRange, contentDescription = "")

                                    Card(
                                        modifier = Modifier
                                            .padding(top = 2.dp),
                                        colors = CardDefaults.cardColors(
                                            containerColor = Color(0xFFFD6E87)
                                        )
                                    )
                                    {
                                        Text(
                                            "Last Date 29/02/22",
                                            fontSize = 18.sp,
                                            fontWeight = FontWeight.Normal,
                                            fontStyle = FontStyle.Italic
                                        )
                                    }
                                }
                            }
                            OutlinedCard(
                                modifier = Modifier
                                    .padding(
                                        start = 265.dp,
                                        top = 12.dp,
                                        end = 10.dp
                                    )
                                    .height(35.dp)
                                    .width(95.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFFD6E87),
                                    contentColor = Color.White
                                )
                            )
                            {
                                TextButton(
                                    onClick = { navController.navigate("trendingproducts") },
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(start = 2.dp, end = 2.dp)
                                )
                                {
                                    Text(
                                        "View All",
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Normal,
                                        fontStyle = FontStyle.Italic,
                                        color = Color(0xFFFFFFFF)
                                    )
                                }
                            }
                        }
                    }

                    Spacer(Modifier.height(5.dp))

                    Row(
                        modifier = Modifier
                            .height(230.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    {
                        Card(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(190.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            {
                                Card(
                                    modifier = Modifier
                                        .height(124.dp)
                                        .fillMaxWidth(),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Image(
                                        painter = painterResource(R.drawable.watch),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 124.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Spacer(Modifier.height(10.dp))

                                    Text(
                                        "IWC Schaffhause 2021 Pilot's Watch SIHH 2019 44mm",
                                        fontWeight = FontWeight.Black,
                                        fontStyle = FontStyle.Italic,
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 15.sp
                                    )

                                    Spacer(Modifier.height(5.dp))

                                    Row {
                                        Text(
                                            "₹649",
                                            fontWeight = FontWeight.Black,
                                            fontSize = 17.sp,
                                            modifier = Modifier
                                                .padding(start = 7.dp)
                                        )

                                        Text(
                                            "₹1499",
                                            textDecoration = TextDecoration.LineThrough,
                                            modifier = Modifier
                                                .padding(start = 5.dp),
                                            fontSize = 13.sp
                                        )
                                    }

                                }
                            }
                        }

                        Spacer(Modifier.width(5.dp))

                        Card(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(190.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                            {
                                Card(
                                    modifier = Modifier
                                        .height(124.dp)
                                        .fillMaxWidth()
                                )
                                {
                                    Image(
                                        painter = painterResource(R.drawable.shoe1),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Card(
                                    modifier = Modifier
                                        .padding(top = 124.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Spacer(Modifier.height(10.dp))

                                    Text(
                                        "Labbin White Sneakers For Men and Female",
                                        fontWeight = FontWeight.Black,
                                        fontStyle = FontStyle.Italic,
                                        modifier = Modifier
                                            .padding(start = 4.dp),
                                        fontSize = 15.sp
                                    )

                                    Spacer(Modifier.height(5.dp))

                                    Row {
                                        Text(
                                            "₹499",
                                            fontWeight = FontWeight.Black,
                                            fontSize = 17.sp,
                                            modifier = Modifier
                                                .padding(start = 7.dp)
                                        )

                                        Text(
                                            "₹999",
                                            textDecoration = TextDecoration.LineThrough,
                                            modifier = Modifier
                                                .padding(start = 5.dp),
                                            fontSize = 13.sp
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Card(
                        modifier = Modifier
                            .height(270.dp)
                            .width(380.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF)
                        )
                    )
                    {
                        Card(
                            modifier = Modifier.height(200.dp).width(380.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFFFFFF)
                            )
                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.background2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        }

                        Spacer(Modifier.height(10.dp))

                        Row {
                            Card(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .height(70.dp)
                                    .width(200.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFFFFFFF)
                                )
                            )
                            {
                                Text(
                                    "New Arrivals",
                                    fontSize = 20.sp
                                )
                                Text(
                                    "Summer’ 25 Collections",
                                    fontSize = 16.sp
                                )
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            TextButton(
                                onClick = {},
                                modifier = Modifier
                                    .padding(end = 10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFF83758)
                                ),
                                shape = RoundedCornerShape(7.dp)
                            )
                            {
                                Text(
                                    "View All",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontStyle = FontStyle.Italic,
                                    color = Color(0xFFFFFFFF)
                                )
                            }
                        }
                        Spacer(Modifier.height(15.dp))
                    }
                }
            }
        }
    }
}

// Model Drawer
@Composable
fun DrawerItem(text: String, icon: ImageVector, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, contentDescription = text, modifier = Modifier.size(24.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Text(text, fontSize = 18.sp)
    }
}