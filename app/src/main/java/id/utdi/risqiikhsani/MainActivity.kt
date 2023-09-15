package id.utdi.risqiikhsani


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

import id.utdi.risqiikhsani.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeTutorialTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }

//          panggil messagecard
            MessageCardWithImageAndColumn(msg = Message("Kucing imut","Hi how are you"))
        }
    }
}

data class Message(val author: String,val body: String)


// menambah composable function
@Composable
fun MessageCard(msg: Message){
    Text(msg.author)
    Text(msg.body)
}

// dengan row, image, column
@Composable
fun MessageCardWithImageAndColumn(msg: Message){
    Row(modifier = Modifier.padding(all = 8.dp)){
        // import image
        Image(painterResource(R.drawable.profile_picture),
            // deskripsi content
            contentDescription = "Contact profile pic",
            // size jadi 40dp dan clip circle
            modifier = Modifier.size(40.dp).clip(CircleShape))
        Column{
            Text(msg.author)
            Text(msg.body)
        }
    }
}

// preview function (dapat dijalankan tanpa running android)
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Message("Kucing","Hello"))
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposeTutorialTheme {
//        Greeting("Android")
//    }
//}