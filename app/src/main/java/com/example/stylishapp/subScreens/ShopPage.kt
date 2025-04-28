package com.example.stylishapp.subScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stylishapp.R
import com.example.stylishapp.datas.itemImages


@Composable
fun ShopPage(){
    var selected by remember { mutableStateOf(-1) }
    var selectedIndex by remember { mutableStateOf(0) }
    val sizes = listOf("5 UK", "6 UK", "7 UK", "8 UK", "9 UK")


    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.LightGray,
                contentColor = Color.White,
                modifier = Modifier.height(84.dp).shadow(elevation = 5.dp, shape = RoundedCornerShape(topStart = 20.dp, topEnd = 10.dp))
            ) {
                Card(modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )){
                    Column {
                        Icon(Icons.Default.Home, contentDescription = "Home",
                            modifier = Modifier.height(24.dp).width(24.dp).align(Alignment.CenterHorizontally),
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

                Card(modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )){
                    Column {
                        Icon(Icons.Default.FavoriteBorder,contentDescription = "Wishlist",
                            modifier = Modifier.height(24.dp).width(24.dp).align(Alignment.CenterHorizontally),
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

                Card(modifier = Modifier.size(60.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFEB3030)
                    ),
                    shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp),
                    ){
                    Box(modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                        ){
                        Icon(Icons.Default.ShoppingCart,contentDescription = "Cart",
                            modifier = Modifier.size(40.dp),
                            tint = Color.White
                        )
                    }
                }

                Spacer(Modifier.weight(1f))

                Card(modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )){
                    Column {
                        Icon(Icons.Default.Search, contentDescription = "Search",
                            modifier = Modifier.height(24.dp).width(24.dp).align(Alignment.CenterHorizontally),
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

                Card(modifier = Modifier,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )){
                    Column {
                        Icon(Icons.Default.Settings, contentDescription = "Setting",
                            modifier = Modifier.height(24.dp).width(24.dp).align(Alignment.CenterHorizontally),
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            Spacer(Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 7.dp),
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
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .height(30.dp)
                            .width(30.dp)
                    )
                    {
                        Icon(Icons.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    IconButton(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterEnd)
                            .height(30.dp)
                            .width(30.dp)
                    )
                    {
                        Icon(Icons.Default.ShoppingCart, contentDescription = "",
                            modifier = Modifier.fillMaxSize())
                    }

                }
            }

            Spacer(Modifier.height(5.dp))

            Card(modifier = Modifier
                .verticalScroll(rememberScrollState()),
                shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Display image inside Card
                    Card(
                        modifier = Modifier
                            .height(210.dp)
                            .width(380.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                    ) {
                        Image(
                            painter = painterResource(id = itemImages[selectedIndex]),
                            contentDescription = "Image ${selectedIndex + 1}",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Manual controls
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        IconButton(
                            onClick = {
                                if (selectedIndex > 0) selectedIndex--
                            },
                            enabled = selectedIndex > 0
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Previous"
                            )
                        }

                        Text("${selectedIndex + 1} / ${itemImages.size}")

                        IconButton(
                            onClick = {
                                if (selectedIndex < itemImages.size - 1) selectedIndex++
                            },
                            enabled = selectedIndex < itemImages.size - 1
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowForward,
                                contentDescription = "Next"
                            )
                        }
                    }
                }

                Spacer(Modifier.height(5.dp))

                Card(modifier = Modifier.width(100.dp).padding(start = 15.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ){
                    Text(
                        text = if (selected != -1) "Size: ${sizes[selected]}" else "Select Size",
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold
                    )
                }

                Card(modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Row(modifier = Modifier.padding(start = 15.dp)) {
                        sizes.forEachIndexed { index, size ->
                            FilterChip(
                                onClick = { selected = if (selected == index) -1 else index },
                                label = {
                                    Text(
                                        size,
                                        fontStyle = FontStyle.Italic
                                    )
                                },
                                selected = selected == index,
                                leadingIcon = if (selected == index) {
                                    {
                                        Icon(
                                            imageVector = Icons.Filled.Done,
                                            contentDescription = "Done icon",
                                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                                        )
                                    }
                                } else null,
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = Color.Red,
                                    disabledSelectedContainerColor = Color.LightGray,
                                    selectedLabelColor = Color.White,
                                    disabledLabelColor = Color.Black,
                                    selectedLeadingIconColor = Color.White
                                ),
                                modifier = Modifier.padding(end = 5.dp)
                            )
                        }
                    }
                }
                Card(modifier = Modifier
                    .padding(start = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )

                )
                {
                    Text("NIke Sneakers",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp),
                        color = Color.Black
                    )
                }

                Spacer(Modifier.height(5.dp))

                Card(modifier = Modifier
                    .padding(start = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Vision Alta Men’s Shoes Size (All Colours)",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                    )
                }

                Card(modifier = Modifier
                    .height(30.dp)
                    .padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Row(modifier = Modifier
                        .fillMaxSize())
                    {
                        Card(modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                            .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Icon(Icons.Default.FavoriteBorder,
                                contentDescription = ""
                            )
                        }
                        Card(modifier = Modifier
                            .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        ){
                            Text("52,080",
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }

                Card(modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .height(25.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Row(modifier = Modifier
                        .fillMaxSize()
                    )
                    {
                        Card(modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                            .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Text("₹2,499",
                                textDecoration = TextDecoration.LineThrough,
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.sp
                            )
                        }

                        Card(modifier = Modifier
                            .align(Alignment.CenterVertically),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Text("₹1,249",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.Black
                            )
                        }

                        Card(modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 5.dp, end = 5.dp)
                            .width(100.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Text("50% Off",
                                fontWeight = FontWeight.Medium,
                                fontStyle = FontStyle.Normal,
                                fontSize = 15.sp,
                                color = Color.Red
                            )
                        }
                    }
                }

                Card(modifier = Modifier
                    .padding(start = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Product Details",
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal,
                        fontSize = 17.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                    )
                }

                Card(modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Text("Perhaps the most iconic sneaker of all-time, this original 'Chicago'? colorway is the cornerstone to any sneaker collection. Made famous in 1985 by Michael Jordan, the shoe has stood the test of time, becoming the most famous colorway of the Air Jordan 1. This 2015 release saw the ...More",
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                    )
                }
                Spacer(Modifier.height(5.dp))

                Card(modifier = Modifier
                    .height(25.dp)
                    .padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ){
                    Row(modifier = Modifier
                        .fillMaxSize())
                    {

                        OutlinedCard(onClick = {},
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .height(25.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Row(modifier = Modifier
                                .padding(start = 5.dp, end = 5.dp, top = 5.dp, bottom = 5.dp))
                            {
                                Icon(Icons.Default.LocationOn,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                                Text("Nearest Store",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                            }
                        }
                        Spacer(Modifier.width(3.dp))

                        OutlinedCard(onClick = {},
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .height(25.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Row(modifier = Modifier
                                .padding(start = 5.dp, end = 5.dp, top = 5.dp, bottom = 5.dp)){
                                Icon(Icons.Default.Lock,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                                Text("VIP",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                            }
                        }
                        Spacer(Modifier.width(3.dp))

                        OutlinedCard(onClick = {},
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .height(25.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Row(modifier = Modifier
                                .padding(start = 5.dp, end = 5.dp, top = 5.dp, bottom = 5.dp)){
                                Icon(Icons.Default.Refresh,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                                Text("Return Policy",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                            }
                        }
                    }
                }

                Card(onClick = {},
                    modifier = Modifier
                        .padding(start = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Row {
                        Card(onClick = {},
                            modifier = Modifier,
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        ){
                            Image(painter = painterResource(R.drawable.cart),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(136.dp)
                            )
                        }

                        Spacer(Modifier.width(5.dp))

                        Card(onClick = {},
                            modifier = Modifier,
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        ){
                            Image(painter = painterResource(R.drawable.buynow),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(137.dp)
                            )
                        }
                    }
                }

                Card(modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFCCD5)
                    )
                ){
                    Box(modifier = Modifier
                        .fillMaxSize())
                    {
                        Card(modifier = Modifier
                            .padding(start = 39.dp, top = 8.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFFCCD5)
                            )
                        )
                        {
                            Text("Delivery in",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        }
                        Card(modifier = Modifier
                            .padding(start = 39.dp, top = 28.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFFCCD5)
                            )
                        )
                        {
                            Text("1 within Hour",
                                fontSize = 21.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                    }
                }

                Spacer(Modifier.height(5.dp))

                Card(modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Row(modifier = Modifier
                        .fillMaxSize())
                    {
                        Card(modifier = Modifier
                            .height(40.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFEDEEE9)
                            )
                        ){
                            Row {
                                Card(modifier = Modifier
                                    .padding(start = 5.dp, top = 7.dp, bottom = 7.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                ){
                                    Icon(Icons.Default.Lock,
                                        contentDescription = ""
                                    )
                                }
                                Card(modifier = Modifier
                                    .padding(top = 9.dp, bottom = 9.dp, end = 5.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Text("View Similar",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Black
                                    )
                                }
                            }
                        }

                        Spacer(Modifier.width(5.dp))

                        Card(modifier = Modifier
                            .height(40.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFEDEEE9)
                            )
                        ){
                            Row {
                                Card(modifier = Modifier
                                    .padding(start = 5.dp, top = 7.dp, bottom = 7.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                ){
                                    Icon(Icons.Default.DateRange,
                                        contentDescription = ""
                                    )
                                }
                                Card(modifier = Modifier
                                    .padding(top = 9.dp, bottom = 9.dp, end = 5.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Text("Add to Compare",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Black
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(Modifier.height(5.dp))

                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                )
                {
                    Card(modifier = Modifier
                        .padding(start = 7.dp, end = 5.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Text("Similar To",
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF000000)
                        )
                    }
                }

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
                            Text("282+ Items",
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
                                        modifier = Modifier
                                            .padding(2.dp)
                                            .align(Alignment.CenterStart)
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
                                        modifier = Modifier
                                            .padding(2.dp)
                                            .align(Alignment.CenterStart)
                                    )
                                    Image(painter = painterResource(R.drawable.filter),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .height(13.dp)
                                            .width(12.dp)
                                            .align(Alignment.CenterEnd),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }

                        }
                    }
                }

                Row(modifier = Modifier
                    .height(230.dp)
                    .align(Alignment.CenterHorizontally)
                )
                {
                    Card(modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Box(modifier = Modifier
                            .fillMaxSize()
                        )
                        {
                            Card(modifier = Modifier
                                .height(124.dp)
                                .fillMaxWidth(),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Image(painter = painterResource(R.drawable.image1),
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Card(modifier = Modifier
                                .padding(top = 124.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Spacer(Modifier.height(10.dp))

                                Text("Women Printed Kurta",
                                    fontWeight = FontWeight.ExtraBold,
                                    fontStyle = FontStyle.Italic,
                                    modifier = Modifier
                                        .padding(start = 4.dp),
                                    fontSize = 17.sp
                                )

                                Spacer(Modifier.height(2.dp))

                                Text("This is the best kurta and it is arrived in valuable price",
                                    modifier = Modifier
                                        .padding(start = 4.dp),
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Medium,
                                    fontStyle = FontStyle.Normal
                                )

                                Spacer(Modifier.height(5.dp))

                                Text("₹1500",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 17.sp,
                                    modifier = Modifier
                                        .padding(start = 7.dp)
                                )

                                Text("₹2499",
                                    textDecoration = TextDecoration.LineThrough,
                                    modifier = Modifier
                                        .padding(start = 18.dp),
                                    fontSize = 14.sp
                                )

                            }
                        }

                    }
                    Spacer(Modifier.width(5.dp))

                    Card(modifier = Modifier
                        .fillMaxHeight()
                        .width(190.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    )
                    {
                        Box(modifier = Modifier
                            .fillMaxSize()
                        )
                        {
                            Card(modifier = Modifier
                                .height(124.dp)
                                .fillMaxWidth()
                            )
                            {
                                Image(painter = painterResource(R.drawable.image2),
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }

                            Card(modifier = Modifier
                                .padding(top = 124.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            )
                            {
                                Spacer(Modifier.height(10.dp))

                                Text("HRX by Hrithik Roshan",
                                    fontWeight = FontWeight.ExtraBold,
                                    fontStyle = FontStyle.Italic,
                                    modifier = Modifier
                                        .padding(start = 4.dp),
                                    fontSize = 17.sp
                                )

                                Spacer(Modifier.height(2.dp))

                                Text("Specially recommended for HRX lover",
                                    modifier = Modifier
                                        .padding(start = 4.dp),
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Medium,
                                    fontStyle = FontStyle.Normal
                                )

                                Spacer(Modifier.height(5.dp))

                                Text("₹2499",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 17.sp,
                                    modifier = Modifier
                                        .padding(start = 7.dp)
                                )

                                Text("₹4999",
                                    textDecoration = TextDecoration.LineThrough,
                                    modifier = Modifier
                                        .padding(start = 18.dp),
                                    fontSize = 14.sp
                                )

                            }
                        }

                    }

                }
            }
        }
    }
}