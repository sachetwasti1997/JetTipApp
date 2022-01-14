package com.sachet.jettippapp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun InputField(
    modifier: Modifier = Modifier,
    valueState: MutableState<String>,
    labelId: String,
    enabled: Boolean,
    isSingleLine: Boolean,
    imeAction: ImeAction,//ImeActionNext
    keyboardType: KeyboardType,//Number
    onAction: KeyboardActions//Default
){

        OutlinedTextField(
            value = valueState.value,
            onValueChange = {
                valueState.value = it
            },
            label = {
                Text(text = labelId)
            },
            enabled = enabled,
            singleLine = isSingleLine,
            keyboardActions = onAction,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.AttachMoney,
                    contentDescription = "Money Icon"
                ) },
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType,
                imeAction = imeAction
            ),
            modifier = modifier
        )

}