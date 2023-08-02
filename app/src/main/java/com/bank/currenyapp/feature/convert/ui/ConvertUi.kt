package com.bank.currenyapp.feature.convert.ui

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bank.currenyapp.R
import com.bank.currenyapp.core.compounant.DropDownMenu

@Composable
@Preview(showBackground = true)
fun ConvertUi() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.convert_title),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            color = Color.Blue,
            textAlign = TextAlign.Center,
            fontSize = 26.sp
        )

        Row(modifier = Modifier.fillMaxWidth()) {
            val coffeeDrinks = arrayListOf("Americano", "Cappuccino", "Espresso", "Latte", "Mocha")
            DropDownMenu(items = coffeeDrinks, modifier = Modifier.wrapContentWidth())

        }


    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFiled(
    value: String = "",
    onChange: (String) -> Unit,
    hint: String = "",
    modifier: Modifier = Modifier.fillMaxWidth()
) {
    OutlinedTextField(
        value = value,
        onValueChange = {
            onChange.invoke(it)
        },
        modifier = modifier,
        enabled = true,
        label = {
            Text(text = hint, color = Color.LightGray, fontSize = 12.sp)
        },
        placeholder = {
            Text(text = hint, color = Color.LightGray, fontSize = 12.sp)
        },
        shape = RoundedCornerShape(8.dp)

    )

}