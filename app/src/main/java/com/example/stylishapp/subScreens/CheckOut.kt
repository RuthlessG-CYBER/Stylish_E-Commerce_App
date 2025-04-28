package com.example.stylishapp.subScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stylishapp.R

@Composable
fun CheckOut(){
    Column(modifier = Modifier
        .fillMaxSize()
    )
    {
        Spacer(Modifier.height(30.dp))

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
                    Icon(
                        Icons.Default.KeyboardArrowLeft,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .height(30.dp)
                        .width(30.dp)
                )
                {
                    Icon(
                        Icons.Default.ShoppingCart, contentDescription = "",
                        modifier = Modifier.fillMaxSize())
                }

                Card(modifier = Modifier
                    .align(Alignment.Center),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ){
                    Text("Checkout",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                }

            }
        }

        Card(modifier = Modifier
            .padding(start = 11.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Row {
                Icon(Icons.Default.LocationOn,
                    contentDescription = "",
                    modifier = Modifier
                        .height(25.dp)
                        .width(22.dp)
                )
                Card(modifier = Modifier
                    .padding(start = 1.dp, end = 10.dp)
                    .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                    )
                {
                    Text("Delivery Address",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Black,
                        color = Color.Black
                    )
                }
            }
        }

        Spacer(Modifier.height(1.dp))

        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(85.dp)
            .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Row(modifier = Modifier
                .fillMaxSize())
            {
                Spacer(modifier = Modifier.weight(1f))
                ElevatedCard(modifier = Modifier
                    .height(80.dp)
                    .width(250.dp)
                    .align(Alignment.CenterVertically)
                    .border(1.dp, Color(0xFF484949), shape = RoundedCornerShape(10.dp)),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFdde1e3)
                    )
                )
                {
                    Column(modifier = Modifier
                        .fillMaxSize())
                    {
                        Spacer(modifier = Modifier.weight(1f))
                        Card(modifier = Modifier.height(20.dp).fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                            )
                        {
                            Row(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 2.dp, end = 2.dp))
                            {
                                Card(modifier = Modifier
                                    .align(Alignment.CenterVertically),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                    )
                                {
                                    Text("Address :",
                                        modifier = Modifier
                                            .padding(start = 5.dp, end = 5.dp),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color.Black,
                                        fontStyle = FontStyle.Italic
                                    )
                                }

                                Spacer(modifier = Modifier.weight(1f))

                                Card(modifier = Modifier
                                    .padding(start = 5.dp, end = 5.dp)
                                    .align(Alignment.CenterVertically),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                    )
                                {
                                    Icon(Icons.Default.Edit, contentDescription = "",
                                        modifier = Modifier
                                            .height(15.dp)
                                            .width(15.dp))
                                }
                            }
                        }
                        Spacer(Modifier.height(5.dp))
                        Card(modifier = Modifier
                            .fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                            )
                        {
                            Text("216 St Paul's Rd, London N1 2LL, UK\n" +
                                    "Contact :  +44-784232",
                                modifier = Modifier
                                    .padding(start = 5.dp, end = 5.dp)
                                    .align(Alignment.CenterHorizontally),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                fontStyle = FontStyle.Italic,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }

                }

                Spacer(modifier = Modifier.weight(1f))
                ElevatedCard(modifier = Modifier
                    .height(80.dp)
                    .width(120.dp)
                    .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Gray
                    )
                )
                {
                    Box(modifier = Modifier.fillMaxSize()){
                        Card(onClick = {},
                            modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.Center),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                            )
                        {
                            Icon(Icons.Default.Add, contentDescription = "Address Add Button",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card(modifier = Modifier
            .height(18.dp)
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            ))
        {
            Text("Shopping Cart",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.dp, end = 15.dp)
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        OutlinedCard(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Card(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, bottom = 3.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp))
                {
                    Row {
                        Spacer(modifier = Modifier.weight(1f))

                        Card(modifier = Modifier.height(124.dp).width(130.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                            )
                        {
                            Image(painter = painterResource(R.drawable.shoppingcart),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                        Spacer(modifier = Modifier.weight(1f))
                        Card(modifier = Modifier.height(125.dp).width(230.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Column(modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center
                                ){
                                Text(" Women’s Casual Wear ",
                                    modifier = Modifier.padding(start = 5.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.Black
                                )
                                Card(modifier = Modifier
                                    .height(30.dp)
                                    .fillMaxWidth()
                                    .padding(start = 5.dp, top = 1.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    ))
                                {
                                    Row(modifier = Modifier.fillMaxSize())
                                    {
                                        Text(" Variations : ",
                                            fontStyle = FontStyle.Italic,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.Black,
                                            modifier = Modifier.padding(start = 1.dp).align(Alignment.CenterVertically)
                                        )
                                        OutlinedCard(modifier = Modifier
                                            .height(20.dp).width(50.dp)
                                            .align(Alignment.CenterVertically),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                            )
                                        {
                                            Text(" Black ",
                                                modifier = Modifier
                                                    .padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp).align(Alignment.CenterHorizontally)
                                            )
                                        }
                                        Spacer(Modifier.width(3.dp))
                                        OutlinedCard(modifier = Modifier
                                            .height(20.dp).width(50.dp)
                                            .align(Alignment.CenterVertically),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                            )
                                        {
                                            Text(" White ",
                                                modifier = Modifier
                                                    .padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp)
                                            )
                                        }
                                    }
                                }
                                Card(modifier = Modifier.padding(start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Row {
                                        Icon(Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            modifier = Modifier
                                                .height(18.dp)
                                                .width(18.dp))
                                        Text("50,000",
                                            modifier = Modifier
                                                .padding(start = 1.dp, end = 5.dp)
                                                .align(Alignment.CenterVertically),
                                            fontSize = 12.sp
                                        )
                                    }
                                }
                                Spacer(Modifier.height(5.dp))
                                Card(modifier = Modifier
                                    .height(25.dp)
                                    .fillMaxWidth(),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Row(modifier = Modifier.fillMaxSize())
                                    {
                                        Card(modifier = Modifier
                                            .height(30.dp)
                                            .width(85.dp)
                                            .padding(start = 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent
                                            ),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Text(" $ 34.00 ",
                                                modifier = Modifier
                                                    .padding(top = 5.dp, bottom = 5.dp)
                                                    .align(Alignment.CenterHorizontally),
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                        Card(modifier = Modifier
                                            .height(30.dp)
                                            .width(85.dp)
                                            .padding(start = 5.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent
                                            ),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Column(modifier = Modifier.fillMaxSize(),
                                                verticalArrangement = Arrangement.Center
                                            ){
                                                Text(" %33 Off ",
                                                    modifier = Modifier
                                                        .padding(start = 5.dp,end = 5.dp),
                                                    fontSize = 8.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.Red
                                                )
                                                Text(" $ 64.00 ",
                                                    modifier = Modifier
                                                        .padding(start = 5.dp,end = 5.dp),
                                                    fontSize = 10.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    textDecoration = TextDecoration.LineThrough
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
            Card(modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, bottom = 3.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black
                )
            )
            {
                Box(modifier = Modifier
                    .fillMaxSize())
                { Text("Buy Now",
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center),
                    fontWeight = FontWeight.Bold
                )
                }
            }
        }
        Spacer(Modifier.height(5.dp))
        OutlinedCard(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        )
        {
            Card(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, bottom = 3.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                )
            )
            {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 15.dp, bottom = 15.dp))
                {
                    Row {
                        Spacer(modifier = Modifier.weight(1f))

                        Card(modifier = Modifier.height(124.dp).width(130.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Image(painter = painterResource(R.drawable.shoppingcart),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                        Spacer(modifier = Modifier.weight(1f))
                        Card(modifier = Modifier
                            .height(125.dp)
                            .width(230.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        )
                        {
                            Column(modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center
                            ){
                                Text(" Women’s Casual Wear ",
                                    modifier = Modifier.padding(start = 5.dp),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.Black
                                )
                                Card(modifier = Modifier
                                    .height(30.dp)
                                    .fillMaxWidth()
                                    .padding(start = 5.dp, top = 1.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Row(modifier = Modifier.fillMaxSize())
                                    {
                                        Text(" Variations : ",
                                            fontStyle = FontStyle.Italic,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.Black,
                                            modifier = Modifier
                                                .padding(start = 1.dp)
                                                .align(Alignment.CenterVertically)
                                        )
                                        OutlinedCard(modifier = Modifier
                                            .height(20.dp).width(50.dp)
                                            .align(Alignment.CenterVertically),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Text(" Black ",
                                                modifier = Modifier
                                                    .padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp).align(Alignment.CenterHorizontally)
                                            )
                                        }
                                        Spacer(Modifier.width(3.dp))
                                        OutlinedCard(modifier = Modifier
                                            .height(20.dp).width(50.dp)
                                            .align(Alignment.CenterVertically),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Text(" White ",
                                                modifier = Modifier
                                                    .padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp)
                                            )
                                        }
                                    }
                                }
                                Card(modifier = Modifier.padding(start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Row {
                                        Icon(Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            modifier = Modifier
                                                .height(18.dp)
                                                .width(18.dp))
                                        Text("50,000",
                                            modifier = Modifier
                                                .padding(start = 1.dp, end = 5.dp)
                                                .align(Alignment.CenterVertically),
                                            fontSize = 12.sp
                                        )
                                    }
                                }
                                Spacer(Modifier.height(5.dp))
                                Card(modifier = Modifier
                                    .height(25.dp)
                                    .fillMaxWidth(),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.Transparent
                                    )
                                )
                                {
                                    Row(modifier = Modifier.fillMaxSize())
                                    {
                                        Card(modifier = Modifier
                                            .height(30.dp)
                                            .width(85.dp)
                                            .padding(start = 10.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent
                                            ),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Text(" $ 34.00 ",
                                                modifier = Modifier
                                                    .padding(top = 5.dp, bottom = 5.dp)
                                                    .align(Alignment.CenterHorizontally),
                                                fontSize = 15.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                        Card(modifier = Modifier
                                            .height(30.dp)
                                            .width(85.dp)
                                            .padding(start = 5.dp),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent
                                            ),
                                            shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp, bottomStart = 3.dp, bottomEnd = 3.dp)
                                        )
                                        {
                                            Column(modifier = Modifier.fillMaxSize(),
                                                verticalArrangement = Arrangement.Center
                                            ){
                                                Text(" %33 Off ",
                                                    modifier = Modifier
                                                        .padding(start = 5.dp,end = 5.dp),
                                                    fontSize = 8.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    color = Color.Red
                                                )
                                                Text(" $ 64.00 ",
                                                    modifier = Modifier
                                                        .padding(start = 5.dp,end = 5.dp),
                                                    fontSize = 10.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    textDecoration = TextDecoration.LineThrough
                                                )
                                            }

                                        }
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
            Card(modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, bottom = 3.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black
                )
            )
            {
                Box(modifier = Modifier.fillMaxSize())
                { Text("Buy Now",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center),
                    fontWeight = FontWeight.Bold
                )
                }
            }
        }
    }
}